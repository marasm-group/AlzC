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
		EQUAL=8, IF=9, ELSE=10, WHILE=11, FOR=12, RETURN=13, FUN=14, VAR=15, BEGIN=16, 
		END=17, LEGACY_STATEMENT=18, LEGACY_END=19, Symbol=20, Type=21, BlockComment=22, 
		LineComment=23, WS=24;
	public static final int
		RULE_program = 0, RULE_varDecl = 1, RULE_argument = 2, RULE_arguments = 3, 
		RULE_funcDecl = 4, RULE_parameter = 5, RULE_parameters = 6, RULE_funcCall = 7, 
		RULE_forStatement = 8, RULE_assignStatement = 9, RULE_ifStatement = 10, 
		RULE_whileStatement = 11, RULE_compoundStatement = 12, RULE_importStatement = 13, 
		RULE_returnStatement = 14, RULE_expression = 15, RULE_statement = 16;
	public static final String[] ruleNames = {
		"program", "varDecl", "argument", "arguments", "funcDecl", "parameter", 
		"parameters", "funcCall", "forStatement", "assignStatement", "ifStatement", 
		"whileStatement", "compoundStatement", "importStatement", "returnStatement", 
		"expression", "statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'import'", "'('", "')'", "','", "';'", "'='", "'if'", 
		"'else'", "'while'", "'for'", "'return'", null, "'var'", "'{'", "'}'", 
		"'$:'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Number", "String", "IMPORT", "OpenPar", "ClosePar", "COMMA", "SEMICOLON", 
		"EQUAL", "IF", "ELSE", "WHILE", "FOR", "RETURN", "FUN", "VAR", "BEGIN", 
		"END", "LEGACY_STATEMENT", "LEGACY_END", "Symbol", "Type", "BlockComment", 
		"LineComment", "WS"
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
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				expression();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Number) | (1L << IMPORT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << FUN) | (1L << VAR) | (1L << Symbol))) != 0) );
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
			setState(39);
			match(VAR);
			setState(40);
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
			setState(42);
			match(Symbol);
			setState(43);
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
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				argument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(49); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(46);
						argument();
						setState(47);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(51); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(53);
				argument();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(55);
					match(Symbol);
					}
					}
					setState(58); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Symbol );
				setState(60);
				match(Type);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(68);
				match(FUN);
				setState(69);
				match(Symbol);
				setState(70);
				match(OpenPar);
				setState(71);
				match(ClosePar);
				setState(72);
				compoundStatement();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(73);
				match(FUN);
				setState(74);
				match(Symbol);
				setState(75);
				match(OpenPar);
				setState(76);
				arguments();
				setState(77);
				match(ClosePar);
				setState(78);
				compoundStatement();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(80);
				match(FUN);
				setState(81);
				match(Symbol);
				setState(82);
				match(OpenPar);
				setState(83);
				arguments();
				setState(84);
				match(ClosePar);
				setState(85);
				match(Type);
				setState(86);
				compoundStatement();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(88);
				match(FUN);
				setState(89);
				match(Symbol);
				setState(90);
				match(OpenPar);
				setState(91);
				match(ClosePar);
				setState(92);
				match(Type);
				setState(93);
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(Symbol);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(Number);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(103);
						parameter();
						setState(104);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(108); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(110);
				parameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(112);
					parameter();
					}
					}
					setState(115); 
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
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(119);
				match(Symbol);
				setState(120);
				match(OpenPar);
				setState(121);
				parameters();
				setState(122);
				match(ClosePar);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(124);
				match(Symbol);
				setState(125);
				match(OpenPar);
				setState(126);
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
			setState(129);
			match(FOR);
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(130);
				varDecl();
				}
				break;
			case 2:
				{
				setState(131);
				statement();
				}
				break;
			case 3:
				{
				setState(132);
				assignStatement();
				}
				break;
			}
			setState(135);
			match(SEMICOLON);
			{
			setState(136);
			statement();
			}
			setState(137);
			match(SEMICOLON);
			setState(138);
			expression();
			setState(139);
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
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(141);
				match(Symbol);
				setState(142);
				match(EQUAL);
				setState(143);
				statement();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(144);
				match(Symbol);
				setState(145);
				match(EQUAL);
				setState(146);
				match(OpenPar);
				setState(147);
				statement();
				setState(148);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(152);
				match(IF);
				{
				setState(153);
				statement();
				}
				setState(154);
				compoundStatement();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(156);
				match(IF);
				{
				setState(157);
				statement();
				}
				setState(158);
				compoundStatement();
				setState(159);
				match(ELSE);
				setState(160);
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
			setState(164);
			match(WHILE);
			{
			setState(165);
			statement();
			}
			setState(166);
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
		enterRule(_localctx, 24, RULE_compoundStatement);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(168);
				match(BEGIN);
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(169);
					expression();
					}
					}
					setState(172); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Number) | (1L << IMPORT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << FUN) | (1L << VAR) | (1L << Symbol))) != 0) );
				setState(174);
				match(END);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(176);
				match(BEGIN);
				setState(177);
				match(END);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(178);
					expression();
					}
					}
					setState(181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Number) | (1L << IMPORT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << FUN) | (1L << VAR) | (1L << Symbol))) != 0) );
				setState(183);
				match(LEGACY_END);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
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
		enterRule(_localctx, 26, RULE_importStatement);
		int _la;
		try {
			int _alt;
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(188);
				match(IMPORT);
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(189);
					match(String);
					}
					}
					setState(192); 
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
				setState(194);
				match(IMPORT);
				setState(197); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(195);
						match(String);
						setState(196);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(199); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(201);
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
		enterRule(_localctx, 28, RULE_returnStatement);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(RETURN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(RETURN);
				setState(206);
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
		enterRule(_localctx, 30, RULE_expression);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(209);
				importStatement();
				setState(210);
				match(SEMICOLON);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(212);
				varDecl();
				setState(213);
				match(SEMICOLON);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(215);
				assignStatement();
				setState(216);
				match(SEMICOLON);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(218);
				statement();
				setState(219);
				match(SEMICOLON);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(221);
				returnStatement();
				setState(222);
				match(SEMICOLON);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				ifStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(225);
				whileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(226);
				forStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(227);
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
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(232);
			switch (_input.LA(1)) {
			case Symbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				funcCall();
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(Number);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u00ed\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5\64"+
		"\n\5\r\5\16\5\65\3\5\3\5\3\5\6\5;\n\5\r\5\16\5<\3\5\3\5\6\5A\n\5\r\5\16"+
		"\5B\5\5E\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6a\n\6\3\7\3\7\3\7\3"+
		"\7\5\7g\n\7\3\b\3\b\3\b\3\b\6\bm\n\b\r\b\16\bn\3\b\3\b\3\b\6\bt\n\b\r"+
		"\b\16\bu\5\bx\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\n\3"+
		"\n\3\n\3\n\5\n\u0088\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u0099\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00a5\n\f\3\r\3\r\3\r\3\r\3\16\3\16\6\16\u00ad\n\16\r\16"+
		"\16\16\u00ae\3\16\3\16\3\16\3\16\3\16\6\16\u00b6\n\16\r\16\16\16\u00b7"+
		"\3\16\3\16\3\16\5\16\u00bd\n\16\3\17\3\17\6\17\u00c1\n\17\r\17\16\17\u00c2"+
		"\3\17\3\17\3\17\6\17\u00c8\n\17\r\17\16\17\u00c9\3\17\5\17\u00cd\n\17"+
		"\3\20\3\20\3\20\5\20\u00d2\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e7\n\21"+
		"\3\22\3\22\5\22\u00eb\n\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"\2\2\u0103\2%\3\2\2\2\4)\3\2\2\2\6,\3\2\2\2\bD\3\2\2\2\n`\3\2"+
		"\2\2\ff\3\2\2\2\16w\3\2\2\2\20\u0081\3\2\2\2\22\u0083\3\2\2\2\24\u0098"+
		"\3\2\2\2\26\u00a4\3\2\2\2\30\u00a6\3\2\2\2\32\u00bc\3\2\2\2\34\u00cc\3"+
		"\2\2\2\36\u00d1\3\2\2\2 \u00e6\3\2\2\2\"\u00ea\3\2\2\2$&\5 \21\2%$\3\2"+
		"\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)*\7\21\2\2*+\5\b\5\2"+
		"+\5\3\2\2\2,-\7\26\2\2-.\7\27\2\2.\7\3\2\2\2/E\5\6\4\2\60\61\5\6\4\2\61"+
		"\62\7\b\2\2\62\64\3\2\2\2\63\60\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65"+
		"\66\3\2\2\2\66\67\3\2\2\2\678\5\6\4\28E\3\2\2\29;\7\26\2\2:9\3\2\2\2;"+
		"<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>E\7\27\2\2?A\7\26\2\2@?\3\2\2"+
		"\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2D/\3\2\2\2D\63\3\2\2\2D:\3\2"+
		"\2\2D@\3\2\2\2E\t\3\2\2\2FG\7\20\2\2GH\7\26\2\2HI\7\6\2\2IJ\7\7\2\2Ja"+
		"\5\32\16\2KL\7\20\2\2LM\7\26\2\2MN\7\6\2\2NO\5\b\5\2OP\7\7\2\2PQ\5\32"+
		"\16\2Qa\3\2\2\2RS\7\20\2\2ST\7\26\2\2TU\7\6\2\2UV\5\b\5\2VW\7\7\2\2WX"+
		"\7\27\2\2XY\5\32\16\2Ya\3\2\2\2Z[\7\20\2\2[\\\7\26\2\2\\]\7\6\2\2]^\7"+
		"\7\2\2^_\7\27\2\2_a\5\32\16\2`F\3\2\2\2`K\3\2\2\2`R\3\2\2\2`Z\3\2\2\2"+
		"a\13\3\2\2\2bg\5\20\t\2cg\7\26\2\2dg\7\3\2\2eg\7\4\2\2fb\3\2\2\2fc\3\2"+
		"\2\2fd\3\2\2\2fe\3\2\2\2g\r\3\2\2\2hx\5\f\7\2ij\5\f\7\2jk\7\b\2\2km\3"+
		"\2\2\2li\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\5\f\7\2qx\3"+
		"\2\2\2rt\5\f\7\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wh\3"+
		"\2\2\2wl\3\2\2\2ws\3\2\2\2x\17\3\2\2\2yz\7\26\2\2z{\7\6\2\2{|\5\16\b\2"+
		"|}\7\7\2\2}\u0082\3\2\2\2~\177\7\26\2\2\177\u0080\7\6\2\2\u0080\u0082"+
		"\7\7\2\2\u0081y\3\2\2\2\u0081~\3\2\2\2\u0082\21\3\2\2\2\u0083\u0087\7"+
		"\16\2\2\u0084\u0088\5\4\3\2\u0085\u0088\5\"\22\2\u0086\u0088\5\24\13\2"+
		"\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\7\t\2\2\u008a\u008b\5\"\22\2\u008b\u008c\7\t\2\2"+
		"\u008c\u008d\5 \21\2\u008d\u008e\5\32\16\2\u008e\23\3\2\2\2\u008f\u0090"+
		"\7\26\2\2\u0090\u0091\7\n\2\2\u0091\u0099\5\"\22\2\u0092\u0093\7\26\2"+
		"\2\u0093\u0094\7\n\2\2\u0094\u0095\7\6\2\2\u0095\u0096\5\"\22\2\u0096"+
		"\u0097\7\7\2\2\u0097\u0099\3\2\2\2\u0098\u008f\3\2\2\2\u0098\u0092\3\2"+
		"\2\2\u0099\25\3\2\2\2\u009a\u009b\7\13\2\2\u009b\u009c\5\"\22\2\u009c"+
		"\u009d\5\32\16\2\u009d\u00a5\3\2\2\2\u009e\u009f\7\13\2\2\u009f\u00a0"+
		"\5\"\22\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\7\f\2\2\u00a2\u00a3\5\32\16"+
		"\2\u00a3\u00a5\3\2\2\2\u00a4\u009a\3\2\2\2\u00a4\u009e\3\2\2\2\u00a5\27"+
		"\3\2\2\2\u00a6\u00a7\7\r\2\2\u00a7\u00a8\5\"\22\2\u00a8\u00a9\5\32\16"+
		"\2\u00a9\31\3\2\2\2\u00aa\u00ac\7\22\2\2\u00ab\u00ad\5 \21\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\7\23\2\2\u00b1\u00bd\3\2\2\2\u00b2\u00b3\7"+
		"\22\2\2\u00b3\u00bd\7\23\2\2\u00b4\u00b6\5 \21\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\7\25\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bd\7\25\2\2\u00bc"+
		"\u00aa\3\2\2\2\u00bc\u00b2\3\2\2\2\u00bc\u00b5\3\2\2\2\u00bc\u00bb\3\2"+
		"\2\2\u00bd\33\3\2\2\2\u00be\u00c0\7\5\2\2\u00bf\u00c1\7\4\2\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00cd\3\2\2\2\u00c4\u00c7\7\5\2\2\u00c5\u00c6\7\4\2\2\u00c6\u00c8\7\b"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\7\4\2\2\u00cc\u00be\3\2"+
		"\2\2\u00cc\u00c4\3\2\2\2\u00cd\35\3\2\2\2\u00ce\u00d2\7\17\2\2\u00cf\u00d0"+
		"\7\17\2\2\u00d0\u00d2\5\"\22\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2"+
		"\u00d2\37\3\2\2\2\u00d3\u00d4\5\34\17\2\u00d4\u00d5\7\t\2\2\u00d5\u00e7"+
		"\3\2\2\2\u00d6\u00d7\5\4\3\2\u00d7\u00d8\7\t\2\2\u00d8\u00e7\3\2\2\2\u00d9"+
		"\u00da\5\24\13\2\u00da\u00db\7\t\2\2\u00db\u00e7\3\2\2\2\u00dc\u00dd\5"+
		"\"\22\2\u00dd\u00de\7\t\2\2\u00de\u00e7\3\2\2\2\u00df\u00e0\5\36\20\2"+
		"\u00e0\u00e1\7\t\2\2\u00e1\u00e7\3\2\2\2\u00e2\u00e7\5\26\f\2\u00e3\u00e7"+
		"\5\30\r\2\u00e4\u00e7\5\22\n\2\u00e5\u00e7\5\n\6\2\u00e6\u00d3\3\2\2\2"+
		"\u00e6\u00d6\3\2\2\2\u00e6\u00d9\3\2\2\2\u00e6\u00dc\3\2\2\2\u00e6\u00df"+
		"\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7!\3\2\2\2\u00e8\u00eb\5\20\t\2\u00e9\u00eb\7\3\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb#\3\2\2\2\31\'\65<BD`fn"+
		"uw\u0081\u0087\u0098\u00a4\u00ae\u00b7\u00bc\u00c2\u00c9\u00cc\u00d1\u00e6"+
		"\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}