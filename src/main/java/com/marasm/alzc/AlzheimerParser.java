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
		EQUAL=8, IF=9, ELSE=10, WHILE=11, RETURN=12, FUN=13, VAR=14, BEGIN=15, 
		END=16, LEGACY_STATEMENT=17, LEGACY_END=18, Symbol=19, Type=20, BlockComment=21, 
		LineComment=22, WS=23;
	public static final int
		RULE_program = 0, RULE_varDecl = 1, RULE_argument = 2, RULE_arguments = 3, 
		RULE_funcDecl = 4, RULE_parameter = 5, RULE_parameters = 6, RULE_funcCall = 7, 
		RULE_assignStatement = 8, RULE_ifStatement = 9, RULE_whileStatement = 10, 
		RULE_compoundStatement = 11, RULE_importStatement = 12, RULE_returnStatement = 13, 
		RULE_expression = 14, RULE_statement = 15;
	public static final String[] ruleNames = {
		"program", "varDecl", "argument", "arguments", "funcDecl", "parameter", 
		"parameters", "funcCall", "assignStatement", "ifStatement", "whileStatement", 
		"compoundStatement", "importStatement", "returnStatement", "expression", 
		"statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'import'", "'('", "')'", "','", "';'", "'='", "'if'", 
		"'else'", "'while'", "'return'", null, "'var'", "'{'", "'}'", "'$:'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Number", "String", "IMPORT", "OpenPar", "ClosePar", "COMMA", "SEMICOLON", 
		"EQUAL", "IF", "ELSE", "WHILE", "RETURN", "FUN", "VAR", "BEGIN", "END", 
		"LEGACY_STATEMENT", "LEGACY_END", "Symbol", "Type", "BlockComment", "LineComment", 
		"WS"
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
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
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
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(32);
					expression();
					}
					break;
				case 2:
					{
					setState(33);
					compoundStatement();
					}
					break;
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMPORT) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << FUN) | (1L << VAR) | (1L << BEGIN) | (1L << Symbol))) != 0) );
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
		int _la;
		try {
			int _alt;
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(38);
				match(VAR);
				setState(39);
				argument();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(40);
				match(VAR);
				setState(44); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(41);
						argument();
						setState(42);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(46); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(48);
				argument();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(50);
				match(VAR);
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(51);
					argument();
					}
					}
					setState(54); 
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
			setState(58);
			match(Symbol);
			setState(59);
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
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				argument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(65); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(62);
						argument();
						setState(63);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(67); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(69);
				argument();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(71);
					match(Symbol);
					}
					}
					setState(74); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Symbol );
				setState(76);
				match(Type);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(77);
					match(Symbol);
					}
					}
					setState(80); 
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(84);
				match(FUN);
				setState(85);
				match(Symbol);
				setState(86);
				match(OpenPar);
				setState(87);
				match(ClosePar);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(88);
				match(FUN);
				setState(89);
				match(Symbol);
				setState(90);
				match(OpenPar);
				setState(91);
				arguments();
				setState(92);
				match(ClosePar);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(94);
				match(FUN);
				setState(95);
				match(Symbol);
				setState(96);
				match(OpenPar);
				setState(97);
				arguments();
				setState(98);
				match(ClosePar);
				setState(99);
				match(Type);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(101);
				match(FUN);
				setState(102);
				match(Symbol);
				setState(103);
				match(OpenPar);
				setState(104);
				match(ClosePar);
				}
				setState(106);
				match(Type);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(Symbol);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(Number);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(115);
						parameter();
						setState(116);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(120); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(122);
				parameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					parameter();
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Number || _la==Symbol );
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(131);
				match(Symbol);
				setState(132);
				match(OpenPar);
				setState(133);
				parameters();
				setState(134);
				match(ClosePar);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(136);
				match(Symbol);
				setState(137);
				match(OpenPar);
				setState(138);
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

	public static class AssignStatementContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(AlzheimerParser.Symbol, 0); }
		public TerminalNode EQUAL() { return getToken(AlzheimerParser.EQUAL, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(Symbol);
			setState(142);
			match(EQUAL);
			setState(143);
			statement();
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
		public TerminalNode Number() { return getToken(AlzheimerParser.Number, 0); }
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
		enterRule(_localctx, 18, RULE_ifStatement);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(IF);
				setState(148);
				switch (_input.LA(1)) {
				case Symbol:
					{
					setState(146);
					statement();
					}
					break;
				case Number:
					{
					setState(147);
					match(Number);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(IF);
				setState(154);
				switch (_input.LA(1)) {
				case Symbol:
					{
					setState(152);
					statement();
					}
					break;
				case Number:
					{
					setState(153);
					match(Number);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(156);
				compoundStatement();
				setState(157);
				match(ELSE);
				setState(158);
				compoundStatement();
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
		public TerminalNode Number() { return getToken(AlzheimerParser.Number, 0); }
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
		enterRule(_localctx, 20, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(WHILE);
			setState(165);
			switch (_input.LA(1)) {
			case Symbol:
				{
				setState(163);
				statement();
				}
				break;
			case Number:
				{
				setState(164);
				match(Number);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(167);
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
		enterRule(_localctx, 22, RULE_compoundStatement);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(169);
				match(BEGIN);
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(170);
					expression();
					}
					}
					setState(173); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMPORT) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << FUN) | (1L << VAR) | (1L << Symbol))) != 0) );
				setState(175);
				match(END);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(177);
				match(BEGIN);
				setState(178);
				match(END);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(179);
				expression();
				setState(180);
				match(LEGACY_END);
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
		enterRule(_localctx, 24, RULE_importStatement);
		int _la;
		try {
			int _alt;
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(184);
				match(IMPORT);
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(185);
					match(String);
					}
					}
					setState(188); 
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
				setState(190);
				match(IMPORT);
				setState(193); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(191);
						match(String);
						setState(192);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(195); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(197);
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
		enterRule(_localctx, 26, RULE_returnStatement);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(RETURN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(RETURN);
				setState(202);
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
		enterRule(_localctx, 28, RULE_expression);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(205);
				importStatement();
				setState(206);
				match(SEMICOLON);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(208);
				varDecl();
				setState(209);
				match(SEMICOLON);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(211);
				assignStatement();
				setState(212);
				match(SEMICOLON);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(214);
				statement();
				setState(215);
				match(SEMICOLON);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(217);
				returnStatement();
				setState(218);
				match(SEMICOLON);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				ifStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(221);
				whileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(222);
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
		enterRule(_localctx, 30, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			funcCall();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00e6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\6\2%\n\2\r\2\16\2&\3\3\3\3\3\3\3\3\3\3\3\3\6\3/\n\3\r\3\16\3\60\3\3\3"+
		"\3\3\3\3\3\6\3\67\n\3\r\3\16\38\5\3;\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6"+
		"\5D\n\5\r\5\16\5E\3\5\3\5\3\5\6\5K\n\5\r\5\16\5L\3\5\3\5\6\5Q\n\5\r\5"+
		"\16\5R\5\5U\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\7\3\7\3\7\5\7s\n\7\3"+
		"\b\3\b\3\b\3\b\6\by\n\b\r\b\16\bz\3\b\3\b\3\b\6\b\u0080\n\b\r\b\16\b\u0081"+
		"\5\b\u0084\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\5\13\u0097\n\13\3\13\3\13\3\13\3\13\5\13\u009d\n"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00a3\n\13\3\f\3\f\3\f\5\f\u00a8\n\f\3\f"+
		"\3\f\3\r\3\r\6\r\u00ae\n\r\r\r\16\r\u00af\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00b9\n\r\3\16\3\16\6\16\u00bd\n\16\r\16\16\16\u00be\3\16\3\16\3"+
		"\16\6\16\u00c4\n\16\r\16\16\16\u00c5\3\16\5\16\u00c9\n\16\3\17\3\17\3"+
		"\17\5\17\u00ce\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e2\n\20\3\21\3\21\3\21"+
		"\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\u00fd\2$\3\2\2\2\4"+
		":\3\2\2\2\6<\3\2\2\2\bT\3\2\2\2\nm\3\2\2\2\fr\3\2\2\2\16\u0083\3\2\2\2"+
		"\20\u008d\3\2\2\2\22\u008f\3\2\2\2\24\u00a2\3\2\2\2\26\u00a4\3\2\2\2\30"+
		"\u00b8\3\2\2\2\32\u00c8\3\2\2\2\34\u00cd\3\2\2\2\36\u00e1\3\2\2\2 \u00e3"+
		"\3\2\2\2\"%\5\36\20\2#%\5\30\r\2$\"\3\2\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2"+
		"\2\2&\'\3\2\2\2\'\3\3\2\2\2()\7\20\2\2);\5\6\4\2*.\7\20\2\2+,\5\6\4\2"+
		",-\7\b\2\2-/\3\2\2\2.+\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\62\3\2\2\2\62\63\5\6\4\2\63;\3\2\2\2\64\66\7\20\2\2\65\67\5\6\4\2\66"+
		"\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:(\3\2\2\2:*\3"+
		"\2\2\2:\64\3\2\2\2;\5\3\2\2\2<=\7\25\2\2=>\7\26\2\2>\7\3\2\2\2?U\5\6\4"+
		"\2@A\5\6\4\2AB\7\b\2\2BD\3\2\2\2C@\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2"+
		"\2FG\3\2\2\2GH\5\6\4\2HU\3\2\2\2IK\7\25\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2"+
		"\2\2LM\3\2\2\2MN\3\2\2\2NU\7\26\2\2OQ\7\25\2\2PO\3\2\2\2QR\3\2\2\2RP\3"+
		"\2\2\2RS\3\2\2\2SU\3\2\2\2T?\3\2\2\2TC\3\2\2\2TJ\3\2\2\2TP\3\2\2\2U\t"+
		"\3\2\2\2VW\7\17\2\2WX\7\25\2\2XY\7\6\2\2Yn\7\7\2\2Z[\7\17\2\2[\\\7\25"+
		"\2\2\\]\7\6\2\2]^\5\b\5\2^_\7\7\2\2_n\3\2\2\2`a\7\17\2\2ab\7\25\2\2bc"+
		"\7\6\2\2cd\5\b\5\2de\7\7\2\2ef\7\26\2\2fn\3\2\2\2gh\7\17\2\2hi\7\25\2"+
		"\2ij\7\6\2\2jk\7\7\2\2kl\3\2\2\2ln\7\26\2\2mV\3\2\2\2mZ\3\2\2\2m`\3\2"+
		"\2\2mg\3\2\2\2n\13\3\2\2\2os\5\20\t\2ps\7\25\2\2qs\7\3\2\2ro\3\2\2\2r"+
		"p\3\2\2\2rq\3\2\2\2s\r\3\2\2\2t\u0084\5\f\7\2uv\5\f\7\2vw\7\b\2\2wy\3"+
		"\2\2\2xu\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\5\f\7\2}\u0084"+
		"\3\2\2\2~\u0080\5\f\7\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083t\3\2\2\2\u0083x\3\2"+
		"\2\2\u0083\177\3\2\2\2\u0084\17\3\2\2\2\u0085\u0086\7\25\2\2\u0086\u0087"+
		"\7\6\2\2\u0087\u0088\5\16\b\2\u0088\u0089\7\7\2\2\u0089\u008e\3\2\2\2"+
		"\u008a\u008b\7\25\2\2\u008b\u008c\7\6\2\2\u008c\u008e\7\7\2\2\u008d\u0085"+
		"\3\2\2\2\u008d\u008a\3\2\2\2\u008e\21\3\2\2\2\u008f\u0090\7\25\2\2\u0090"+
		"\u0091\7\n\2\2\u0091\u0092\5 \21\2\u0092\23\3\2\2\2\u0093\u0096\7\13\2"+
		"\2\u0094\u0097\5 \21\2\u0095\u0097\7\3\2\2\u0096\u0094\3\2\2\2\u0096\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u00a3\5\30\r\2\u0099\u009c\7\13\2\2"+
		"\u009a\u009d\5 \21\2\u009b\u009d\7\3\2\2\u009c\u009a\3\2\2\2\u009c\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\5\30\r\2\u009f\u00a0\7\f\2\2"+
		"\u00a0\u00a1\5\30\r\2\u00a1\u00a3\3\2\2\2\u00a2\u0093\3\2\2\2\u00a2\u0099"+
		"\3\2\2\2\u00a3\25\3\2\2\2\u00a4\u00a7\7\r\2\2\u00a5\u00a8\5 \21\2\u00a6"+
		"\u00a8\7\3\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00aa\5\30\r\2\u00aa\27\3\2\2\2\u00ab\u00ad\7\21\2\2\u00ac"+
		"\u00ae\5\36\20\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3"+
		"\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\22\2\2\u00b2"+
		"\u00b9\3\2\2\2\u00b3\u00b4\7\21\2\2\u00b4\u00b9\7\22\2\2\u00b5\u00b6\5"+
		"\36\20\2\u00b6\u00b7\7\24\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00ab\3\2\2\2"+
		"\u00b8\u00b3\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\31\3\2\2\2\u00ba\u00bc"+
		"\7\5\2\2\u00bb\u00bd\7\4\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c9\3\2\2\2\u00c0\u00c3\7\5"+
		"\2\2\u00c1\u00c2\7\4\2\2\u00c2\u00c4\7\b\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c9\7\4\2\2\u00c8\u00ba\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c9"+
		"\33\3\2\2\2\u00ca\u00ce\7\16\2\2\u00cb\u00cc\7\16\2\2\u00cc\u00ce\5 \21"+
		"\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\35\3\2\2\2\u00cf\u00d0"+
		"\5\32\16\2\u00d0\u00d1\7\t\2\2\u00d1\u00e2\3\2\2\2\u00d2\u00d3\5\4\3\2"+
		"\u00d3\u00d4\7\t\2\2\u00d4\u00e2\3\2\2\2\u00d5\u00d6\5\22\n\2\u00d6\u00d7"+
		"\7\t\2\2\u00d7\u00e2\3\2\2\2\u00d8\u00d9\5 \21\2\u00d9\u00da\7\t\2\2\u00da"+
		"\u00e2\3\2\2\2\u00db\u00dc\5\34\17\2\u00dc\u00dd\7\t\2\2\u00dd\u00e2\3"+
		"\2\2\2\u00de\u00e2\5\24\13\2\u00df\u00e2\5\26\f\2\u00e0\u00e2\5\n\6\2"+
		"\u00e1\u00cf\3\2\2\2\u00e1\u00d2\3\2\2\2\u00e1\u00d5\3\2\2\2\u00e1\u00d8"+
		"\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\37\3\2\2\2\u00e3\u00e4\5\20\t\2\u00e4!\3\2\2\2\34"+
		"$&\608:ELRTmrz\u0081\u0083\u008d\u0096\u009c\u00a2\u00a7\u00af\u00b8\u00be"+
		"\u00c5\u00c8\u00cd\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}