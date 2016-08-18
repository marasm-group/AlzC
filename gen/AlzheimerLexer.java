// Generated from /Users/vhq473/marasm/AlzC/src/main/antlr/Alzheimer.g4 by ANTLR 4.5.3
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
		INTEGER=1, REAL=2, Symbol=3, Type=4, VarDecl=5, FuncDecl=6, WS=7, BlockComment=8, 
		LineComment=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INTEGER", "REAL", "Symbol", "Type", "VarDecl", "FuncDecl", "WS", "BlockComment", 
		"LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INTEGER", "REAL", "Symbol", "Type", "VarDecl", "FuncDecl", "WS", 
		"BlockComment", "LineComment"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13k\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2"+
		"\27\n\2\r\2\16\2\30\3\3\6\3\34\n\3\r\3\16\3\35\3\3\3\3\6\3\"\n\3\r\3\16"+
		"\3#\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4.\n\4\r\4\16\4/\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7E\n\7"+
		"\r\7\16\7F\3\7\3\7\3\7\3\b\6\bM\n\b\r\b\16\bN\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\7\tW\n\t\f\t\16\tZ\13\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\ne\n\n"+
		"\f\n\16\nh\13\n\3\n\3\n\3X\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\3\2\4\5\2\13\f\17\17\"\"\4\2\f\f\17\17r\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\3\26\3\2\2\2\5\33\3\2\2\2\7%\3\2\2\2\t\61\3\2\2\2\13"+
		"\64\3\2\2\2\r;\3\2\2\2\17L\3\2\2\2\21R\3\2\2\2\23`\3\2\2\2\25\27\4\62"+
		";\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\4\3\2\2"+
		"\2\32\34\4\62;\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2"+
		"\2\36\37\3\2\2\2\37!\7\60\2\2 \"\4\62;\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2"+
		"\2#$\3\2\2\2$\6\3\2\2\2%&\7a\2\2&\'\4c|\2\'(\4C\\\2(-\3\2\2\2)*\7a\2\2"+
		"*+\4c|\2+,\4C\\\2,.\4\62;\2-)\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2"+
		"\60\b\3\2\2\2\61\62\7<\2\2\62\63\5\7\4\2\63\n\3\2\2\2\64\65\7x\2\2\65"+
		"\66\7c\2\2\66\67\7t\2\2\678\3\2\2\289\5\7\4\29:\5\t\5\2:\f\3\2\2\2;<\7"+
		"h\2\2<=\7w\2\2=>\7p\2\2>?\3\2\2\2?@\5\7\4\2@D\7*\2\2AB\5\7\4\2BC\5\t\5"+
		"\2CE\3\2\2\2DA\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7+\2"+
		"\2IJ\5\t\5\2J\16\3\2\2\2KM\t\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2"+
		"\2\2OP\3\2\2\2PQ\b\b\2\2Q\20\3\2\2\2RS\7\61\2\2ST\7,\2\2TX\3\2\2\2UW\13"+
		"\2\2\2VU\3\2\2\2WZ\3\2\2\2XY\3\2\2\2XV\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\"+
		"\7,\2\2\\]\7\61\2\2]^\3\2\2\2^_\b\t\2\2_\22\3\2\2\2`a\7\61\2\2ab\7\61"+
		"\2\2bf\3\2\2\2ce\n\3\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2"+
		"\2\2hf\3\2\2\2ij\b\n\2\2j\24\3\2\2\2\13\2\30\35#/FNXf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}