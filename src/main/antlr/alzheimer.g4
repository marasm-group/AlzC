grammar Alzheimer;
program : (expression)+ ;

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
FOR: 'for' ;
RETURN: 'return' ;

TYPE: 'type' ;

FUN: 'fun' | 'fun:';
VAR: 'var';

DOT: '.' ;
BEGIN: '{' ;
END: '}' ;

LEGACY_STATEMENT: '$:' -> skip ;
LEGACY_END: 'end' | 'endif' | 'endwhile' | 'endfor' ;

Symbol
:
    ([A-Za-z]+) | (Type DOT 'size')
;

Type: ':'Symbol ;


varDecl
:
    (VAR arguments)
;

argument: (Symbol Type);
arguments
:
    argument | ((argument COMMA)+ argument) | (Symbol+ Type) | (Symbol+)
;

funcDecl
:
    (FUN Symbol OpenPar ClosePar compoundStatement) |
    (FUN Symbol OpenPar arguments ClosePar compoundStatement)|
    (FUN Symbol OpenPar arguments ClosePar Type compoundStatement)|
    (FUN Symbol OpenPar ClosePar Type compoundStatement)
;

parameter
:
    funcCall | Symbol | Number | String
;
parameters
:
   parameter | (parameter COMMA)+ parameter | parameter+
;
funcCall
:
    (Symbol OpenPar parameters ClosePar) | (Symbol OpenPar ClosePar)
;

forStatement
:
    FOR (varDecl | statement | assignStatement) SEMICOLON (statement) SEMICOLON expression compoundStatement
;


assignStatement
:
    (Symbol EQUAL statement)|
    (Symbol EQUAL OpenPar statement ClosePar)
;

ifStatement
:
    (IF (statement) compoundStatement) |
    (IF (statement) compoundStatement ELSE compoundStatement)
;

whileStatement
:
    WHILE (statement) compoundStatement
;

typeField
:
    (Type Symbol+ )|
    (Type (Symbol COMMA)+ Symbol)
;
typeFields
:
    (typeField+ LEGACY_END) |
    (BEGIN typeField END)
;

typeStatement
:
    TYPE Type typeFields
;

compoundStatement
:
   (BEGIN (expression)+ END) |
   (BEGIN END)|
   (expression+ LEGACY_END) | LEGACY_END
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
    (typeStatement )|
    (varDecl SEMICOLON ) |
    (assignStatement SEMICOLON) |
    (statement SEMICOLON)|
    //(LEGACY_STATEMENT statement SEMICOLON)|
    (returnStatement SEMICOLON)|
    ifStatement |
    whileStatement |
    forStatement |
    funcDecl
;

statement
:
    funcCall | Number | Symbol
;


BlockComment
:
	'/*' .*? '*/' -> skip
;
LineComment
:
	'//' ~[\r\n]* -> skip
;
LineComment2
:
	'#' ~[\r\n]* -> skip
;

WS : ( ' ' | '\t' | '\r' | '\n' )+ -> skip ;
