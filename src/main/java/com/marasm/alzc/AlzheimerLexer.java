// Generated from /Users/vhq473/marasm/AlzC/src/main/antlr/Alzheimer.g4 by ANTLR 4.5.3
package com.marasm.alzc;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlzheimerLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Number", "String", "IMPORT", "OpenPar", "ClosePar", "COMMA", "SEMICOLON", 
		"EQUAL", "IF", "ELSE", "WHILE", "FOR", "RETURN", "TYPE", "FUN", "VAR", 
		"DOT", "BEGIN", "END", "LEGACY_STATEMENT", "LEGACY_END", "Symbol", "Type", 
		"BlockComment", "LineComment", "LineComment2", "WS"
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


	public AlzheimerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alzheimer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u0103\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\6\2;\n\2\r\2\16\2<\3\2\3\2\6\2"+
		"A\n\2\r\2\16\2B\5\2E\n\2\3\2\6\2H\n\2\r\2\16\2I\3\2\3\2\6\2N\n\2\r\2\16"+
		"\2O\3\2\3\2\6\2T\n\2\r\2\16\2U\3\2\3\2\6\2Z\n\2\r\2\16\2[\5\2^\n\2\5\2"+
		"`\n\2\3\3\3\3\7\3d\n\3\f\3\16\3g\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00a1\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00c8\n\26\3\27\6\27\u00cb\n\27\r\27\16\27\u00cc\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u00d6\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31"+
		"\u00df\n\31\f\31\16\31\u00e2\13\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\7\32\u00ed\n\32\f\32\16\32\u00f0\13\32\3\32\3\32\3\33\3\33"+
		"\7\33\u00f6\n\33\f\33\16\33\u00f9\13\33\3\33\3\33\3\34\6\34\u00fe\n\34"+
		"\r\34\16\34\u00ff\3\34\3\34\4e\u00e0\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\35\3\2\6\3\2\62;\4\2C\\c|\4\2\f\f\17"+
		"\17\5\2\13\f\17\17\"\"\u0116\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7j\3\2\2\2\tq\3\2\2\2\13s\3\2\2\2\r"+
		"u\3\2\2\2\17w\3\2\2\2\21y\3\2\2\2\23{\3\2\2\2\25~\3\2\2\2\27\u0083\3\2"+
		"\2\2\31\u0089\3\2\2\2\33\u008d\3\2\2\2\35\u0094\3\2\2\2\37\u00a0\3\2\2"+
		"\2!\u00a2\3\2\2\2#\u00a6\3\2\2\2%\u00a8\3\2\2\2\'\u00aa\3\2\2\2)\u00ac"+
		"\3\2\2\2+\u00c7\3\2\2\2-\u00d5\3\2\2\2/\u00d7\3\2\2\2\61\u00da\3\2\2\2"+
		"\63\u00e8\3\2\2\2\65\u00f3\3\2\2\2\67\u00fd\3\2\2\29;\t\2\2\2:9\3\2\2"+
		"\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=E\3\2\2\2>@\7/\2\2?A\t\2\2\2@?\3\2\2"+
		"\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2D:\3\2\2\2D>\3\2\2\2E`\3\2\2"+
		"\2FH\t\2\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KM\7\60"+
		"\2\2LN\t\2\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P^\3\2\2\2QS\7/"+
		"\2\2RT\t\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\7\60"+
		"\2\2XZ\t\2\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2]G\3"+
		"\2\2\2]Q\3\2\2\2^`\3\2\2\2_D\3\2\2\2_]\3\2\2\2`\4\3\2\2\2ae\7$\2\2bd\13"+
		"\2\2\2cb\3\2\2\2dg\3\2\2\2ef\3\2\2\2ec\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7"+
		"$\2\2i\6\3\2\2\2jk\7k\2\2kl\7o\2\2lm\7r\2\2mn\7q\2\2no\7t\2\2op\7v\2\2"+
		"p\b\3\2\2\2qr\7*\2\2r\n\3\2\2\2st\7+\2\2t\f\3\2\2\2uv\7.\2\2v\16\3\2\2"+
		"\2wx\7=\2\2x\20\3\2\2\2yz\7?\2\2z\22\3\2\2\2{|\7k\2\2|}\7h\2\2}\24\3\2"+
		"\2\2~\177\7g\2\2\177\u0080\7n\2\2\u0080\u0081\7u\2\2\u0081\u0082\7g\2"+
		"\2\u0082\26\3\2\2\2\u0083\u0084\7y\2\2\u0084\u0085\7j\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088\30\3\2\2\2\u0089\u008a"+
		"\7h\2\2\u008a\u008b\7q\2\2\u008b\u008c\7t\2\2\u008c\32\3\2\2\2\u008d\u008e"+
		"\7t\2\2\u008e\u008f\7g\2\2\u008f\u0090\7v\2\2\u0090\u0091\7w\2\2\u0091"+
		"\u0092\7t\2\2\u0092\u0093\7p\2\2\u0093\34\3\2\2\2\u0094\u0095\7v\2\2\u0095"+
		"\u0096\7{\2\2\u0096\u0097\7r\2\2\u0097\u0098\7g\2\2\u0098\36\3\2\2\2\u0099"+
		"\u009a\7h\2\2\u009a\u009b\7w\2\2\u009b\u00a1\7p\2\2\u009c\u009d\7h\2\2"+
		"\u009d\u009e\7w\2\2\u009e\u009f\7p\2\2\u009f\u00a1\7<\2\2\u00a0\u0099"+
		"\3\2\2\2\u00a0\u009c\3\2\2\2\u00a1 \3\2\2\2\u00a2\u00a3\7x\2\2\u00a3\u00a4"+
		"\7c\2\2\u00a4\u00a5\7t\2\2\u00a5\"\3\2\2\2\u00a6\u00a7\7\60\2\2\u00a7"+
		"$\3\2\2\2\u00a8\u00a9\7}\2\2\u00a9&\3\2\2\2\u00aa\u00ab\7\177\2\2\u00ab"+
		"(\3\2\2\2\u00ac\u00ad\7&\2\2\u00ad\u00ae\7<\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\b\25\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7p\2\2\u00b3"+
		"\u00c8\7f\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7f\2\2"+
		"\u00b7\u00b8\7k\2\2\u00b8\u00c8\7h\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb"+
		"\7p\2\2\u00bb\u00bc\7f\2\2\u00bc\u00bd\7y\2\2\u00bd\u00be\7j\2\2\u00be"+
		"\u00bf\7k\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c8\7g\2\2\u00c1\u00c2\7g\2\2"+
		"\u00c2\u00c3\7p\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6"+
		"\7q\2\2\u00c6\u00c8\7t\2\2\u00c7\u00b1\3\2\2\2\u00c7\u00b4\3\2\2\2\u00c7"+
		"\u00b9\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c8,\3\2\2\2\u00c9\u00cb\t\3\2\2"+
		"\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00d6\3\2\2\2\u00ce\u00cf\5/\30\2\u00cf\u00d0\5#\22\2\u00d0"+
		"\u00d1\7u\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7|\2\2\u00d3\u00d4\7g\2\2"+
		"\u00d4\u00d6\3\2\2\2\u00d5\u00ca\3\2\2\2\u00d5\u00ce\3\2\2\2\u00d6.\3"+
		"\2\2\2\u00d7\u00d8\7<\2\2\u00d8\u00d9\5-\27\2\u00d9\60\3\2\2\2\u00da\u00db"+
		"\7\61\2\2\u00db\u00dc\7,\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00df\13\2\2\2"+
		"\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7,\2\2\u00e4"+
		"\u00e5\7\61\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\31\2\2\u00e7\62\3\2"+
		"\2\2\u00e8\u00e9\7\61\2\2\u00e9\u00ea\7\61\2\2\u00ea\u00ee\3\2\2\2\u00eb"+
		"\u00ed\n\4\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f2\b\32\2\2\u00f2\64\3\2\2\2\u00f3\u00f7\7%\2\2\u00f4\u00f6\n\4\2"+
		"\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\b\33\2\2"+
		"\u00fb\66\3\2\2\2\u00fc\u00fe\t\5\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\b\34\2\2\u01028\3\2\2\2\25\2<BDIOU[]_e\u00a0\u00c7\u00cc\u00d5"+
		"\u00e0\u00ee\u00f7\u00ff\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}