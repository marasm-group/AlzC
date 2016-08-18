// Generated from /Users/vhq473/marasm/AlzC/src/main/antlr/Alzheimer.g4 by ANTLR 4.5.3
package com.marasm.alzc;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlzheimerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Number=1, String=2, IMPORT=3, OpenPar=4, ClosePar=5, COMMA=6, SEMICOLON=7, 
		EQUAL=8, IF=9, ELSE=10, WHILE=11, FOR=12, RETURN=13, TYPE=14, FUN=15, 
		VAR=16, DOT=17, BEGIN=18, END=19, LEGACY_STATEMENT=20, LEGACY_END=21, 
		Symbol=22, Type=23, BlockComment=24, LineComment=25, LineComment2=26, 
		WS=27;
	public static final int
		RULE_program = 0, RULE_varDecl = 1, RULE_argument = 2, RULE_arguments = 3, 
		RULE_funcDecl = 4, RULE_parameter = 5, RULE_parameters = 6, RULE_funcCall = 7, 
		RULE_forStatement = 8, RULE_assignStatement = 9, RULE_ifStatement = 10, 
		RULE_whileStatement = 11, RULE_typeField = 12, RULE_typeFields = 13, RULE_typeStatement = 14, 
		RULE_compoundStatement = 15, RULE_importStatement = 16, RULE_returnStatement = 17, 
		RULE_expression = 18, RULE_statement = 19;
	public static final String[] ruleNames = {
		"program", "varDecl", "argument", "arguments", "funcDecl", "parameter", 
		"parameters", "funcCall", "forStatement", "assignStatement", "ifStatement", 
		"whileStatement", "typeField", "typeFields", "typeStatement", "compoundStatement", 
		"importStatement", "returnStatement", "expression", "statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'import'", "'('", "')'", "','", "';'", "'='", "'if'", 
		"'else'", "'while'", "'for'", "'return'", "'type'", null, "'var'", "'.'", 
		"'{'", "'}'", "'$:'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Number", "String", "IMPORT", "OpenPar", "ClosePar", "COMMA", "SEMICOLON", 
		"EQUAL", "IF", "ELSE", "WHILE", "FOR", "RETURN", "TYPE", "FUN", "VAR", 
		"DOT", "BEGIN", "END", "LEGACY_STATEMENT", "LEGACY_END", "Symbol", "Type", 
		"BlockComment", "LineComment", "LineComment2", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Alzheimer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlzheimerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				expression();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Number) | (1L << IMPORT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << TYPE) | (1L << FUN) | (1L << VAR) | (1L << Symbol))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(AlzheimerParser.VAR, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(45);
			match(VAR);
			setState(46);
			arguments();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(AlzheimerParser.Symbol, 0); }
		public TerminalNode Type() { return getToken(AlzheimerParser.Type, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(48);
			match(Symbol);
			setState(49);
			match(Type);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AlzheimerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AlzheimerParser.COMMA, i);
		}
		public TerminalNode Type() { return getToken(AlzheimerParser.Type, 0); }
		public List<TerminalNode> Symbol() { return getTokens(AlzheimerParser.Symbol); }
		public TerminalNode Symbol(int i) {
			return getToken(AlzheimerParser.Symbol, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arguments);
		int _la;
		try {
			int _alt;
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				argument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(55); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(52);
						argument();
						setState(53);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(57); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(59);
				argument();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61);
					match(Symbol);
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Symbol );
				setState(66);
				match(Type);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67);
					match(Symbol);
					}
					}
					setState(70); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Symbol );
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(AlzheimerParser.FUN, 0); }
		public TerminalNode Symbol() { return getToken(AlzheimerParser.Symbol, 0); }
		public TerminalNode OpenPar() { return getToken(AlzheimerParser.OpenPar, 0); }
		public TerminalNode ClosePar() { return getToken(AlzheimerParser.ClosePar, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Type() { return getToken(AlzheimerParser.Type, 0); }
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcDecl);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(74);
				match(FUN);
				setState(75);
				match(Symbol);
				setState(76);
				match(OpenPar);
				setState(77);
				match(ClosePar);
				setState(78);
				compoundStatement();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(79);
				match(FUN);
				setState(80);
				match(Symbol);
				setState(81);
				match(OpenPar);
				setState(82);
				arguments();
				setState(83);
				match(ClosePar);
				setState(84);
				compoundStatement();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(86);
				match(FUN);
				setState(87);
				match(Symbol);
				setState(88);
				match(OpenPar);
				setState(89);
				arguments();
				setState(90);
				match(ClosePar);
				setState(91);
				match(Type);
				setState(92);
				compoundStatement();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(94);
				match(FUN);
				setState(95);
				match(Symbol);
				setState(96);
				match(OpenPar);
				setState(97);
				match(ClosePar);
				setState(98);
				match(Type);
				setState(99);
				compoundStatement();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode Symbol() { return getToken(AlzheimerParser.Symbol, 0); }
		public TerminalNode Number() { return getToken(AlzheimerParser.Number, 0); }
		public TerminalNode String() { return getToken(AlzheimerParser.String, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(Symbol);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(Number);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(String);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AlzheimerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AlzheimerParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			int _alt;
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(109);
						parameter();
						setState(110);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(114); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(116);
				parameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(118);
					parameter();
					}
					}
					setState(121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Number) | (1L << String) | (1L << Symbol))) != 0) );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(AlzheimerParser.Symbol, 0); }
		public TerminalNode OpenPar() { return getToken(AlzheimerParser.OpenPar, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode ClosePar() { return getToken(AlzheimerParser.ClosePar, 0); }
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcCall);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(125);
				match(Symbol);
				setState(126);
				match(OpenPar);
				setState(127);
				parameters();
				setState(128);
				match(ClosePar);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(130);
				match(Symbol);
				setState(131);
				match(OpenPar);
				setState(132);
				match(ClosePar);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AlzheimerParser.FOR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(AlzheimerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AlzheimerParser.SEMICOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(FOR);
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(136);
				varDecl();
				}
				break;
			case 2:
				{
				setState(137);
				statement();
				}
				break;
			case 3:
				{
				setState(138);
				assignStatement();
				}
				break;
			}
			setState(141);
			match(SEMICOLON);
			{
			setState(142);
			statement();
			}
			setState(143);
			match(SEMICOLON);
			setState(144);
			expression();
			setState(145);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStatementContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(AlzheimerParser.Symbol, 0); }
		public TerminalNode EQUAL() { return getToken(AlzheimerParser.EQUAL, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode OpenPar() { return getToken(AlzheimerParser.OpenPar, 0); }
		public TerminalNode ClosePar() { return getToken(AlzheimerParser.ClosePar, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignStatement);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(147);
				match(Symbol);
				setState(148);
				match(EQUAL);
				setState(149);
				statement();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(150);
				match(Symbol);
				setState(151);
				match(EQUAL);
				setState(152);
				match(OpenPar);
				setState(153);
				statement();
				setState(154);
				match(ClosePar);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AlzheimerParser.IF, 0); }
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(AlzheimerParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(158);
				match(IF);
				{
				setState(159);
				statement();
				}
				setState(160);
				compoundStatement();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(162);
				match(IF);
				{
				setState(163);
				statement();
				}
				setState(164);
				compoundStatement();
				setState(165);
				match(ELSE);
				setState(166);
				compoundStatement();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AlzheimerParser.WHILE, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(WHILE);
			{
			setState(171);
			statement();
			}
			setState(172);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeFieldContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(AlzheimerParser.Type, 0); }
		public List<TerminalNode> Symbol() { return getTokens(AlzheimerParser.Symbol); }
		public TerminalNode Symbol(int i) {
			return getToken(AlzheimerParser.Symbol, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AlzheimerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AlzheimerParser.COMMA, i);
		}
		public TypeFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterTypeField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitTypeField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitTypeField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeFieldContext typeField() throws RecognitionException {
		TypeFieldContext _localctx = new TypeFieldContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeField);
		int _la;
		try {
			int _alt;
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(174);
				match(Type);
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(175);
					match(Symbol);
					}
					}
					setState(178); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Symbol );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(180);
				match(Type);
				setState(183); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(181);
						match(Symbol);
						setState(182);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(185); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(187);
				match(Symbol);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeFieldsContext extends ParserRuleContext {
		public TerminalNode LEGACY_END() { return getToken(AlzheimerParser.LEGACY_END, 0); }
		public List<TypeFieldContext> typeField() {
			return getRuleContexts(TypeFieldContext.class);
		}
		public TypeFieldContext typeField(int i) {
			return getRuleContext(TypeFieldContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(AlzheimerParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(AlzheimerParser.END, 0); }
		public TypeFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterTypeFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitTypeFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitTypeFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeFieldsContext typeFields() throws RecognitionException {
		TypeFieldsContext _localctx = new TypeFieldsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeFields);
		int _la;
		try {
			setState(201);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(190);
					typeField();
					}
					}
					setState(193); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Type );
				setState(195);
				match(LEGACY_END);
				}
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(197);
				match(BEGIN);
				setState(198);
				typeField();
				setState(199);
				match(END);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeStatementContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(AlzheimerParser.TYPE, 0); }
		public TerminalNode Type() { return getToken(AlzheimerParser.Type, 0); }
		public TypeFieldsContext typeFields() {
			return getRuleContext(TypeFieldsContext.class,0);
		}
		public TypeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterTypeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitTypeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitTypeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeStatementContext typeStatement() throws RecognitionException {
		TypeStatementContext _localctx = new TypeStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(TYPE);
			setState(204);
			match(Type);
			setState(205);
			typeFields();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(AlzheimerParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(AlzheimerParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LEGACY_END() { return getToken(AlzheimerParser.LEGACY_END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compoundStatement);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(207);
				match(BEGIN);
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(208);
					expression();
					}
					}
					setState(211); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Number) | (1L << IMPORT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << TYPE) | (1L << FUN) | (1L << VAR) | (1L << Symbol))) != 0) );
				setState(213);
				match(END);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(215);
				match(BEGIN);
				setState(216);
				match(END);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(217);
					expression();
					}
					}
					setState(220); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Number) | (1L << IMPORT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << TYPE) | (1L << FUN) | (1L << VAR) | (1L << Symbol))) != 0) );
				setState(222);
				match(LEGACY_END);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(LEGACY_END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AlzheimerParser.IMPORT, 0); }
		public List<TerminalNode> String() { return getTokens(AlzheimerParser.String); }
		public TerminalNode String(int i) {
			return getToken(AlzheimerParser.String, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AlzheimerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AlzheimerParser.COMMA, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_importStatement);
		int _la;
		try {
			int _alt;
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(227);
				match(IMPORT);
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(228);
					match(String);
					}
					}
					setState(231); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==String );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(233);
				match(IMPORT);
				setState(236); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(234);
						match(String);
						setState(235);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(238); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(240);
				match(String);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AlzheimerParser.RETURN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(RETURN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(RETURN);
				setState(245);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AlzheimerParser.SEMICOLON, 0); }
		public TypeStatementContext typeStatement() {
			return getRuleContext(TypeStatementContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(248);
				importStatement();
				setState(249);
				match(SEMICOLON);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(251);
				typeStatement();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(252);
				varDecl();
				setState(253);
				match(SEMICOLON);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(255);
				assignStatement();
				setState(256);
				match(SEMICOLON);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(258);
				statement();
				setState(259);
				match(SEMICOLON);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(261);
				returnStatement();
				setState(262);
				match(SEMICOLON);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				ifStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(265);
				whileStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(266);
				forStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(267);
				funcDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode Number() { return getToken(AlzheimerParser.Number, 0); }
		public TerminalNode Symbol() { return getToken(AlzheimerParser.Symbol, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlzheimerListener ) ((AlzheimerListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlzheimerVisitor ) return ((AlzheimerVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(Number);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(Symbol);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u0116\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\6\5:\n\5\r\5\16\5;\3\5\3\5\3\5\6\5A\n\5\r\5\16"+
		"\5B\3\5\3\5\6\5G\n\5\r\5\16\5H\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6g\n\6\3\7\3\7\3\7\3\7\5\7m\n\7\3\b\3\b\3\b\3\b\6\bs\n\b\r\b\16"+
		"\bt\3\b\3\b\3\b\6\bz\n\b\r\b\16\b{\5\b~\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0088\n\t\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009f\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ab\n\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\6\16\u00b3\n\16\r\16\16\16\u00b4\3\16\3\16\3\16\6\16\u00ba\n\16"+
		"\r\16\16\16\u00bb\3\16\5\16\u00bf\n\16\3\17\6\17\u00c2\n\17\r\17\16\17"+
		"\u00c3\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cc\n\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\6\21\u00d4\n\21\r\21\16\21\u00d5\3\21\3\21\3\21\3\21\3\21"+
		"\6\21\u00dd\n\21\r\21\16\21\u00de\3\21\3\21\3\21\5\21\u00e4\n\21\3\22"+
		"\3\22\6\22\u00e8\n\22\r\22\16\22\u00e9\3\22\3\22\3\22\6\22\u00ef\n\22"+
		"\r\22\16\22\u00f0\3\22\5\22\u00f4\n\22\3\23\3\23\3\23\5\23\u00f9\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010f\n\24\3\25\3\25\3\25\5\25\u0114"+
		"\n\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\u0130"+
		"\2+\3\2\2\2\4/\3\2\2\2\6\62\3\2\2\2\bJ\3\2\2\2\nf\3\2\2\2\fl\3\2\2\2\16"+
		"}\3\2\2\2\20\u0087\3\2\2\2\22\u0089\3\2\2\2\24\u009e\3\2\2\2\26\u00aa"+
		"\3\2\2\2\30\u00ac\3\2\2\2\32\u00be\3\2\2\2\34\u00cb\3\2\2\2\36\u00cd\3"+
		"\2\2\2 \u00e3\3\2\2\2\"\u00f3\3\2\2\2$\u00f8\3\2\2\2&\u010e\3\2\2\2(\u0113"+
		"\3\2\2\2*,\5&\24\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2"+
		"/\60\7\22\2\2\60\61\5\b\5\2\61\5\3\2\2\2\62\63\7\30\2\2\63\64\7\31\2\2"+
		"\64\7\3\2\2\2\65K\5\6\4\2\66\67\5\6\4\2\678\7\b\2\28:\3\2\2\29\66\3\2"+
		"\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\5\6\4\2>K\3\2\2\2?A\7\30"+
		"\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DK\7\31\2\2EG\7"+
		"\30\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2J\65\3\2\2\2"+
		"J9\3\2\2\2J@\3\2\2\2JF\3\2\2\2K\t\3\2\2\2LM\7\21\2\2MN\7\30\2\2NO\7\6"+
		"\2\2OP\7\7\2\2Pg\5 \21\2QR\7\21\2\2RS\7\30\2\2ST\7\6\2\2TU\5\b\5\2UV\7"+
		"\7\2\2VW\5 \21\2Wg\3\2\2\2XY\7\21\2\2YZ\7\30\2\2Z[\7\6\2\2[\\\5\b\5\2"+
		"\\]\7\7\2\2]^\7\31\2\2^_\5 \21\2_g\3\2\2\2`a\7\21\2\2ab\7\30\2\2bc\7\6"+
		"\2\2cd\7\7\2\2de\7\31\2\2eg\5 \21\2fL\3\2\2\2fQ\3\2\2\2fX\3\2\2\2f`\3"+
		"\2\2\2g\13\3\2\2\2hm\5\20\t\2im\7\30\2\2jm\7\3\2\2km\7\4\2\2lh\3\2\2\2"+
		"li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\r\3\2\2\2n~\5\f\7\2op\5\f\7\2pq\7\b\2"+
		"\2qs\3\2\2\2ro\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\5\f\7"+
		"\2w~\3\2\2\2xz\5\f\7\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2"+
		"\2}n\3\2\2\2}r\3\2\2\2}y\3\2\2\2~\17\3\2\2\2\177\u0080\7\30\2\2\u0080"+
		"\u0081\7\6\2\2\u0081\u0082\5\16\b\2\u0082\u0083\7\7\2\2\u0083\u0088\3"+
		"\2\2\2\u0084\u0085\7\30\2\2\u0085\u0086\7\6\2\2\u0086\u0088\7\7\2\2\u0087"+
		"\177\3\2\2\2\u0087\u0084\3\2\2\2\u0088\21\3\2\2\2\u0089\u008d\7\16\2\2"+
		"\u008a\u008e\5\4\3\2\u008b\u008e\5(\25\2\u008c\u008e\5\24\13\2\u008d\u008a"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\7\t\2\2\u0090\u0091\5(\25\2\u0091\u0092\7\t\2\2\u0092\u0093\5&"+
		"\24\2\u0093\u0094\5 \21\2\u0094\23\3\2\2\2\u0095\u0096\7\30\2\2\u0096"+
		"\u0097\7\n\2\2\u0097\u009f\5(\25\2\u0098\u0099\7\30\2\2\u0099\u009a\7"+
		"\n\2\2\u009a\u009b\7\6\2\2\u009b\u009c\5(\25\2\u009c\u009d\7\7\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u0095\3\2\2\2\u009e\u0098\3\2\2\2\u009f\25\3\2\2"+
		"\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2\5(\25\2\u00a2\u00a3\5 \21\2\u00a3"+
		"\u00ab\3\2\2\2\u00a4\u00a5\7\13\2\2\u00a5\u00a6\5(\25\2\u00a6\u00a7\5"+
		" \21\2\u00a7\u00a8\7\f\2\2\u00a8\u00a9\5 \21\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a0\3\2\2\2\u00aa\u00a4\3\2\2\2\u00ab\27\3\2\2\2\u00ac\u00ad\7\r\2"+
		"\2\u00ad\u00ae\5(\25\2\u00ae\u00af\5 \21\2\u00af\31\3\2\2\2\u00b0\u00b2"+
		"\7\31\2\2\u00b1\u00b3\7\30\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00bf\3\2\2\2\u00b6\u00b9"+
		"\7\31\2\2\u00b7\u00b8\7\30\2\2\u00b8\u00ba\7\b\2\2\u00b9\u00b7\3\2\2\2"+
		"\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00bf\7\30\2\2\u00be\u00b0\3\2\2\2\u00be\u00b6\3\2\2\2"+
		"\u00bf\33\3\2\2\2\u00c0\u00c2\5\32\16\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\7\27\2\2\u00c6\u00cc\3\2\2\2\u00c7\u00c8\7\24\2\2\u00c8\u00c9\5"+
		"\32\16\2\u00c9\u00ca\7\25\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c1\3\2\2\2"+
		"\u00cb\u00c7\3\2\2\2\u00cc\35\3\2\2\2\u00cd\u00ce\7\20\2\2\u00ce\u00cf"+
		"\7\31\2\2\u00cf\u00d0\5\34\17\2\u00d0\37\3\2\2\2\u00d1\u00d3\7\24\2\2"+
		"\u00d2\u00d4\5&\24\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\25\2\2"+
		"\u00d8\u00e4\3\2\2\2\u00d9\u00da\7\24\2\2\u00da\u00e4\7\25\2\2\u00db\u00dd"+
		"\5&\24\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7\27\2\2\u00e1\u00e4\3"+
		"\2\2\2\u00e2\u00e4\7\27\2\2\u00e3\u00d1\3\2\2\2\u00e3\u00d9\3\2\2\2\u00e3"+
		"\u00dc\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4!\3\2\2\2\u00e5\u00e7\7\5\2\2"+
		"\u00e6\u00e8\7\4\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f4\3\2\2\2\u00eb\u00ee\7\5\2\2\u00ec"+
		"\u00ed\7\4\2\2\u00ed\u00ef\7\b\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f4\7\4\2\2\u00f3\u00e5\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f4#\3\2\2\2"+
		"\u00f5\u00f9\7\17\2\2\u00f6\u00f7\7\17\2\2\u00f7\u00f9\5(\25\2\u00f8\u00f5"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9%\3\2\2\2\u00fa\u00fb\5\"\22\2\u00fb"+
		"\u00fc\7\t\2\2\u00fc\u010f\3\2\2\2\u00fd\u010f\5\36\20\2\u00fe\u00ff\5"+
		"\4\3\2\u00ff\u0100\7\t\2\2\u0100\u010f\3\2\2\2\u0101\u0102\5\24\13\2\u0102"+
		"\u0103\7\t\2\2\u0103\u010f\3\2\2\2\u0104\u0105\5(\25\2\u0105\u0106\7\t"+
		"\2\2\u0106\u010f\3\2\2\2\u0107\u0108\5$\23\2\u0108\u0109\7\t\2\2\u0109"+
		"\u010f\3\2\2\2\u010a\u010f\5\26\f\2\u010b\u010f\5\30\r\2\u010c\u010f\5"+
		"\22\n\2\u010d\u010f\5\n\6\2\u010e\u00fa\3\2\2\2\u010e\u00fd\3\2\2\2\u010e"+
		"\u00fe\3\2\2\2\u010e\u0101\3\2\2\2\u010e\u0104\3\2\2\2\u010e\u0107\3\2"+
		"\2\2\u010e\u010a\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010d\3\2\2\2\u010f\'\3\2\2\2\u0110\u0114\5\20\t\2\u0111\u0114\7\3\2"+
		"\2\u0112\u0114\7\30\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114)\3\2\2\2\36-;BHJflt{}\u0087\u008d\u009e\u00aa\u00b4"+
		"\u00bb\u00be\u00c3\u00cb\u00d5\u00de\u00e3\u00e9\u00f0\u00f3\u00f8\u010e"+
		"\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}