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
		EQUAL=8, IF=9, ELSE=10, WHILE=11, FOR=12, RETURN=13, FUN=14, VAR=15, BEGIN=16, 
		END=17, LEGACY_STATEMENT=18, LEGACY_END=19, Symbol=20, Type=21, BlockComment=22, 
		LineComment=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Number", "String", "IMPORT", "OpenPar", "ClosePar", "COMMA", "SEMICOLON", 
		"EQUAL", "IF", "ELSE", "WHILE", "FOR", "RETURN", "FUN", "VAR", "BEGIN", 
		"END", "LEGACY_STATEMENT", "LEGACY_END", "Symbol", "Type", "BlockComment", 
		"LineComment", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00e4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\6\2\65\n\2\r\2\16\2\66\3\2\3\2\6\2;\n\2\r\2\16\2<\5\2?\n\2\3"+
		"\2\6\2B\n\2\r\2\16\2C\3\2\3\2\6\2H\n\2\r\2\16\2I\3\2\3\2\6\2N\n\2\r\2"+
		"\16\2O\3\2\3\2\6\2T\n\2\r\2\16\2U\5\2X\n\2\5\2Z\n\2\3\3\3\3\7\3^\n\3\f"+
		"\3\16\3a\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u0096\n\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00bb\n\24\3\25\6\25\u00be\n\25\r\25\16\25\u00bf\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00c9\n\27\f\27\16\27\u00cc\13\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00d7\n\30\f\30\16"+
		"\30\u00da\13\30\3\30\3\30\3\31\6\31\u00df\n\31\r\31\16\31\u00e0\3\31\3"+
		"\31\4_\u00ca\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\6\3\2"+
		"\62;\4\2C\\c|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u00f5\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3Y\3"+
		"\2\2\2\5[\3\2\2\2\7d\3\2\2\2\tk\3\2\2\2\13m\3\2\2\2\ro\3\2\2\2\17q\3\2"+
		"\2\2\21s\3\2\2\2\23u\3\2\2\2\25x\3\2\2\2\27}\3\2\2\2\31\u0083\3\2\2\2"+
		"\33\u0087\3\2\2\2\35\u0095\3\2\2\2\37\u0097\3\2\2\2!\u009b\3\2\2\2#\u009d"+
		"\3\2\2\2%\u009f\3\2\2\2\'\u00ba\3\2\2\2)\u00bd\3\2\2\2+\u00c1\3\2\2\2"+
		"-\u00c4\3\2\2\2/\u00d2\3\2\2\2\61\u00de\3\2\2\2\63\65\t\2\2\2\64\63\3"+
		"\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67?\3\2\2\28:\7/\2\2"+
		"9;\t\2\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2>\64\3\2\2"+
		"\2>8\3\2\2\2?Z\3\2\2\2@B\t\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2"+
		"\2DE\3\2\2\2EG\7\60\2\2FH\t\2\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2JX\3\2\2\2KM\7/\2\2LN\t\2\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2"+
		"\2\2PQ\3\2\2\2QS\7\60\2\2RT\t\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3"+
		"\2\2\2VX\3\2\2\2WA\3\2\2\2WK\3\2\2\2XZ\3\2\2\2Y>\3\2\2\2YW\3\2\2\2Z\4"+
		"\3\2\2\2[_\7$\2\2\\^\13\2\2\2]\\\3\2\2\2^a\3\2\2\2_`\3\2\2\2_]\3\2\2\2"+
		"`b\3\2\2\2a_\3\2\2\2bc\7$\2\2c\6\3\2\2\2de\7k\2\2ef\7o\2\2fg\7r\2\2gh"+
		"\7q\2\2hi\7t\2\2ij\7v\2\2j\b\3\2\2\2kl\7*\2\2l\n\3\2\2\2mn\7+\2\2n\f\3"+
		"\2\2\2op\7.\2\2p\16\3\2\2\2qr\7=\2\2r\20\3\2\2\2st\7?\2\2t\22\3\2\2\2"+
		"uv\7k\2\2vw\7h\2\2w\24\3\2\2\2xy\7g\2\2yz\7n\2\2z{\7u\2\2{|\7g\2\2|\26"+
		"\3\2\2\2}~\7y\2\2~\177\7j\2\2\177\u0080\7k\2\2\u0080\u0081\7n\2\2\u0081"+
		"\u0082\7g\2\2\u0082\30\3\2\2\2\u0083\u0084\7h\2\2\u0084\u0085\7q\2\2\u0085"+
		"\u0086\7t\2\2\u0086\32\3\2\2\2\u0087\u0088\7t\2\2\u0088\u0089\7g\2\2\u0089"+
		"\u008a\7v\2\2\u008a\u008b\7w\2\2\u008b\u008c\7t\2\2\u008c\u008d\7p\2\2"+
		"\u008d\34\3\2\2\2\u008e\u008f\7h\2\2\u008f\u0090\7w\2\2\u0090\u0096\7"+
		"p\2\2\u0091\u0092\7h\2\2\u0092\u0093\7w\2\2\u0093\u0094\7p\2\2\u0094\u0096"+
		"\7<\2\2\u0095\u008e\3\2\2\2\u0095\u0091\3\2\2\2\u0096\36\3\2\2\2\u0097"+
		"\u0098\7x\2\2\u0098\u0099\7c\2\2\u0099\u009a\7t\2\2\u009a \3\2\2\2\u009b"+
		"\u009c\7}\2\2\u009c\"\3\2\2\2\u009d\u009e\7\177\2\2\u009e$\3\2\2\2\u009f"+
		"\u00a0\7&\2\2\u00a0\u00a1\7<\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\23"+
		"\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7p\2\2\u00a6\u00bb"+
		"\7f\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7f\2\2\u00aa"+
		"\u00ab\7k\2\2\u00ab\u00bb\7h\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7p\2\2"+
		"\u00ae\u00af\7f\2\2\u00af\u00b0\7y\2\2\u00b0\u00b1\7j\2\2\u00b1\u00b2"+
		"\7k\2\2\u00b2\u00b3\7n\2\2\u00b3\u00bb\7g\2\2\u00b4\u00b5\7g\2\2\u00b5"+
		"\u00b6\7p\2\2\u00b6\u00b7\7f\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7q\2\2"+
		"\u00b9\u00bb\7t\2\2\u00ba\u00a4\3\2\2\2\u00ba\u00a7\3\2\2\2\u00ba\u00ac"+
		"\3\2\2\2\u00ba\u00b4\3\2\2\2\u00bb(\3\2\2\2\u00bc\u00be\t\3\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0*\3\2\2\2\u00c1\u00c2\7<\2\2\u00c2\u00c3\5)\25\2\u00c3,\3\2"+
		"\2\2\u00c4\u00c5\7\61\2\2\u00c5\u00c6\7,\2\2\u00c6\u00ca\3\2\2\2\u00c7"+
		"\u00c9\13\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cb\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00ce\7,\2\2\u00ce\u00cf\7\61\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\27"+
		"\2\2\u00d1.\3\2\2\2\u00d2\u00d3\7\61\2\2\u00d3\u00d4\7\61\2\2\u00d4\u00d8"+
		"\3\2\2\2\u00d5\u00d7\n\4\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00dc\b\30\2\2\u00dc\60\3\2\2\2\u00dd\u00df\t\5\2\2\u00de\u00dd"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\b\31\2\2\u00e3\62\3\2\2\2\23\2\66<>CIOUWY_"+
		"\u0095\u00ba\u00bf\u00ca\u00d8\u00e0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}