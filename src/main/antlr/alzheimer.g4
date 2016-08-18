grammar Alzheimer;
program : (expression | compoundStatement)+ ;

Number: (([0-9]+) | '-'([0-9])+) | (([0-9])+'.'([0-9])+ | '-'([0-9])+'.'([0-9])+ );
String: '"' .*? '"';

IMPORT: 'import' ;
OpenPar: '(' ;
ClosePar: ')' ;
COMMA: ',' ;
SEMICOLON: ';' ;
EQUAL: '=';
IF: 'if' ;
ELSE: 'else' ;
WHILE: 'while' ;
RETURN: 'return' ;

FUN: 'fun' | 'fun:';
VAR: 'var';

BEGIN: '{' ;
END: '}' ;

LEGACY_STATEMENT: '$:' ;
LEGACY_END: 'end' | 'endif' | 'endwhile' | 'endfor' ;


//Symbol: (('a'..'z')|('A'..'Z')|'_')(('a'..'z')|('A'..'Z')|'_'|('0'..'9'))+;
Symbol
:
    [A-Za-z]+
;
Type: ':'Symbol ;

varDecl
:
    (VAR argument) | (VAR (argument COMMA)+ argument) | (VAR argument+)
;

argument: (Symbol Type);
arguments
:
    argument | ((argument COMMA)+ argument) | (Symbol+ Type) | (Symbol+)
;

funcDecl
:
    (FUN Symbol OpenPar ClosePar) |
    (FUN Symbol OpenPar arguments ClosePar)|
    (FUN Symbol OpenPar arguments ClosePar Type)|
    (FUN Symbol OpenPar ClosePar) Type

;

parameter
:
    funcCall | Symbol | Number
;
parameters
:
   parameter | (parameter COMMA)+ parameter | parameter+
;
funcCall
:
    (Symbol OpenPar parameters ClosePar) | (Symbol OpenPar ClosePar)
;

assignStatement
:
    Symbol EQUAL statement
;

ifStatement
:
    IF (statement | Number) compoundStatement |
    IF (statement | Number) compoundStatement ELSE compoundStatement
;

whileStatement
:
    WHILE (statement | Number) compoundStatement
;

compoundStatement
:
   (BEGIN (expression)+ END) |
   (BEGIN END)|
   (expression LEGACY_END)
;
importStatement
:
    (IMPORT String+)|
    (IMPORT (String COMMA)+ String)
;
returnStatement
:
    RETURN |
    RETURN statement
;
expression
:
    (importStatement SEMICOLON)|
    (varDecl SEMICOLON ) |
    (assignStatement SEMICOLON) |
    (statement SEMICOLON)|
    (LEGACY_STATEMENT statement SEMICOLON)|
    (returnStatement SEMICOLON)|
    ifStatement |
    whileStatement |
    funcDecl
;

statement
:
    funcCall
;


BlockComment
:
	'/*' .*? '*/' -> skip
;
LineComment
:
	'//' ~[\r\n]* -> skip
;
WS : ( ' ' | '\t' | '\r' | '\n' )+ -> skip ;
