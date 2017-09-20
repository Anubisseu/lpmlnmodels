// Generated from LPMLN.g4 by ANTLR 4.5.1
package cn.edu.seu.kse.lpmln.util.syntax.lpmln;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LPMLNLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAF_NOT=1, STRING=2, FULLSTOP=3, POSITIVE_INT=4, DECIMAL=5, ZERO=6, IDENTIFIER=7, 
		VAR=8, EXPONENITIATION=9, BITWISE_AND=10, BITWISE_OR=11, BITWISE_EXCLUSIVE_OR=12, 
		BITWISE_COMPLEMENT=13, PLUS=14, MINUS=15, STAR=16, SLASH=17, LPAREN=18, 
		RPAREN=19, LSBRACK=20, RSBRACK=21, LCBRACK=22, RCBRACK=23, RANGE=24, COMMA=25, 
		DISJUNCTION=26, CONDITION=27, ASSIGN=28, WEAK_ASSIGN=29, SEMICOLON=30, 
		LESS_THAN=31, LEQ=32, GREATER_THAN=33, GEQ=34, EQUAL=35, DOUBLE_EQUAL=36, 
		NEQ=37, AGGREGATE_OP=38, META_OP=39, LINE_COMMENT=40, WS=41, BOOL_CONSTANTS=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NAF_NOT", "STRING", "FULLSTOP", "POSITIVE_INT", "DECIMAL", "ZERO", "IDENTIFIER", 
		"VAR", "EXPONENITIATION", "BITWISE_AND", "BITWISE_OR", "BITWISE_EXCLUSIVE_OR", 
		"BITWISE_COMPLEMENT", "PLUS", "MINUS", "STAR", "SLASH", "LPAREN", "RPAREN", 
		"LSBRACK", "RSBRACK", "LCBRACK", "RCBRACK", "RANGE", "COMMA", "DISJUNCTION", 
		"CONDITION", "ASSIGN", "WEAK_ASSIGN", "SEMICOLON", "LESS_THAN", "LEQ", 
		"GREATER_THAN", "GEQ", "EQUAL", "DOUBLE_EQUAL", "NEQ", "AGGREGATE_OP", 
		"META_OP", "LINE_COMMENT", "WS", "BOOL_CONSTANTS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'not '", null, "'.'", null, null, "'0'", null, null, "'**'", "'&'", 
		"'?'", "'^'", "'~'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'['", 
		"']'", "'{'", "'}'", "'..'", "','", "'|'", "':'", "':-'", "':~'", "';'", 
		"'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", null, "'#show '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NAF_NOT", "STRING", "FULLSTOP", "POSITIVE_INT", "DECIMAL", "ZERO", 
		"IDENTIFIER", "VAR", "EXPONENITIATION", "BITWISE_AND", "BITWISE_OR", "BITWISE_EXCLUSIVE_OR", 
		"BITWISE_COMPLEMENT", "PLUS", "MINUS", "STAR", "SLASH", "LPAREN", "RPAREN", 
		"LSBRACK", "RSBRACK", "LCBRACK", "RCBRACK", "RANGE", "COMMA", "DISJUNCTION", 
		"CONDITION", "ASSIGN", "WEAK_ASSIGN", "SEMICOLON", "LESS_THAN", "LEQ", 
		"GREATER_THAN", "GEQ", "EQUAL", "DOUBLE_EQUAL", "NEQ", "AGGREGATE_OP", 
		"META_OP", "LINE_COMMENT", "WS", "BOOL_CONSTANTS"
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


	public LPMLNLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LPMLN.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u0125\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3a\n\3\f\3\16\3d\13\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\7\5l\n\5\f\5\16\5o\13\5\3\6\5\6r\n\6\3\6\7\6u\n\6\f\6\16"+
		"\6x\13\6\3\6\5\6{\n\6\3\6\3\6\3\6\7\6\u0080\n\6\f\6\16\6\u0083\13\6\3"+
		"\6\7\6\u0086\n\6\f\6\16\6\u0089\13\6\3\7\3\7\3\b\7\b\u008e\n\b\f\b\16"+
		"\b\u0091\13\b\3\b\3\b\7\b\u0095\n\b\f\b\16\b\u0098\13\b\3\t\7\t\u009b"+
		"\n\t\f\t\16\t\u009e\13\t\3\t\3\t\7\t\u00a2\n\t\f\t\16\t\u00a5\13\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u00fb\n\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\7)\u0106\n)\f)\16"+
		")\u0109\13)\3)\5)\u010c\n)\3)\3)\3)\3)\3*\6*\u0113\n*\r*\16*\u0114\3*"+
		"\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0124\n+\2\2,\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,\3\2\13\3\2$$\3\2\63;\3\2\62;\3\2aa\3\2c|\7\2))\62;C\\aac"+
		"|\3\2C\\\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u0137\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5"+
		"\\\3\2\2\2\7g\3\2\2\2\ti\3\2\2\2\13q\3\2\2\2\r\u008a\3\2\2\2\17\u008f"+
		"\3\2\2\2\21\u009c\3\2\2\2\23\u00a6\3\2\2\2\25\u00a9\3\2\2\2\27\u00ab\3"+
		"\2\2\2\31\u00ad\3\2\2\2\33\u00af\3\2\2\2\35\u00b1\3\2\2\2\37\u00b3\3\2"+
		"\2\2!\u00b5\3\2\2\2#\u00b7\3\2\2\2%\u00b9\3\2\2\2\'\u00bb\3\2\2\2)\u00bd"+
		"\3\2\2\2+\u00bf\3\2\2\2-\u00c1\3\2\2\2/\u00c3\3\2\2\2\61\u00c5\3\2\2\2"+
		"\63\u00c8\3\2\2\2\65\u00ca\3\2\2\2\67\u00cc\3\2\2\29\u00ce\3\2\2\2;\u00d1"+
		"\3\2\2\2=\u00d4\3\2\2\2?\u00d6\3\2\2\2A\u00d8\3\2\2\2C\u00db\3\2\2\2E"+
		"\u00dd\3\2\2\2G\u00e0\3\2\2\2I\u00e2\3\2\2\2K\u00e5\3\2\2\2M\u00fa\3\2"+
		"\2\2O\u00fc\3\2\2\2Q\u0103\3\2\2\2S\u0112\3\2\2\2U\u0123\3\2\2\2WX\7p"+
		"\2\2XY\7q\2\2YZ\7v\2\2Z[\7\"\2\2[\4\3\2\2\2\\b\7$\2\2]^\7^\2\2^a\7$\2"+
		"\2_a\n\2\2\2`]\3\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2"+
		"\2db\3\2\2\2ef\7$\2\2f\6\3\2\2\2gh\7\60\2\2h\b\3\2\2\2im\t\3\2\2jl\t\4"+
		"\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\n\3\2\2\2om\3\2\2\2pr\5"+
		"\37\20\2qp\3\2\2\2qr\3\2\2\2rz\3\2\2\2su\5\t\5\2ts\3\2\2\2ux\3\2\2\2v"+
		"t\3\2\2\2vw\3\2\2\2w{\3\2\2\2xv\3\2\2\2y{\5\r\7\2zv\3\2\2\2zy\3\2\2\2"+
		"{|\3\2\2\2|}\5\7\4\2}\u0081\t\4\2\2~\u0080\5\r\7\2\177~\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0087\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0084\u0086\t\3\2\2\u0085\u0084\3\2\2\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\f\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\7\62\2\2\u008b\16\3\2\2\2\u008c\u008e\t\5\2"+
		"\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0096\t\6\2\2\u0093"+
		"\u0095\t\7\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\20\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b"+
		"\t\5\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a3\t\b"+
		"\2\2\u00a0\u00a2\t\7\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\22\3\2\2\2\u00a5\u00a3\3\2\2"+
		"\2\u00a6\u00a7\7,\2\2\u00a7\u00a8\7,\2\2\u00a8\24\3\2\2\2\u00a9\u00aa"+
		"\7(\2\2\u00aa\26\3\2\2\2\u00ab\u00ac\7A\2\2\u00ac\30\3\2\2\2\u00ad\u00ae"+
		"\7`\2\2\u00ae\32\3\2\2\2\u00af\u00b0\7\u0080\2\2\u00b0\34\3\2\2\2\u00b1"+
		"\u00b2\7-\2\2\u00b2\36\3\2\2\2\u00b3\u00b4\7/\2\2\u00b4 \3\2\2\2\u00b5"+
		"\u00b6\7,\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\7\61\2\2\u00b8$\3\2\2\2\u00b9"+
		"\u00ba\7*\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7+\2\2\u00bc(\3\2\2\2\u00bd\u00be"+
		"\7]\2\2\u00be*\3\2\2\2\u00bf\u00c0\7_\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7"+
		"}\2\2\u00c2.\3\2\2\2\u00c3\u00c4\7\177\2\2\u00c4\60\3\2\2\2\u00c5\u00c6"+
		"\7\60\2\2\u00c6\u00c7\7\60\2\2\u00c7\62\3\2\2\2\u00c8\u00c9\7.\2\2\u00c9"+
		"\64\3\2\2\2\u00ca\u00cb\7~\2\2\u00cb\66\3\2\2\2\u00cc\u00cd\7<\2\2\u00cd"+
		"8\3\2\2\2\u00ce\u00cf\7<\2\2\u00cf\u00d0\7/\2\2\u00d0:\3\2\2\2\u00d1\u00d2"+
		"\7<\2\2\u00d2\u00d3\7\u0080\2\2\u00d3<\3\2\2\2\u00d4\u00d5\7=\2\2\u00d5"+
		">\3\2\2\2\u00d6\u00d7\7>\2\2\u00d7@\3\2\2\2\u00d8\u00d9\7>\2\2\u00d9\u00da"+
		"\7?\2\2\u00daB\3\2\2\2\u00db\u00dc\7@\2\2\u00dcD\3\2\2\2\u00dd\u00de\7"+
		"@\2\2\u00de\u00df\7?\2\2\u00dfF\3\2\2\2\u00e0\u00e1\7?\2\2\u00e1H\3\2"+
		"\2\2\u00e2\u00e3\7?\2\2\u00e3\u00e4\7?\2\2\u00e4J\3\2\2\2\u00e5\u00e6"+
		"\7#\2\2\u00e6\u00e7\7?\2\2\u00e7L\3\2\2\2\u00e8\u00e9\7%\2\2\u00e9\u00ea"+
		"\7e\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7p\2\2\u00ed"+
		"\u00fb\7v\2\2\u00ee\u00ef\7%\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7w\2\2"+
		"\u00f1\u00fb\7o\2\2\u00f2\u00f3\7%\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5"+
		"\7c\2\2\u00f5\u00fb\7z\2\2\u00f6\u00f7\7%\2\2\u00f7\u00f8\7o\2\2\u00f8"+
		"\u00f9\7k\2\2\u00f9\u00fb\7p\2\2\u00fa\u00e8\3\2\2\2\u00fa\u00ee\3\2\2"+
		"\2\u00fa\u00f2\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fbN\3\2\2\2\u00fc\u00fd"+
		"\7%\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7j\2\2\u00ff\u0100\7q\2\2\u0100"+
		"\u0101\7y\2\2\u0101\u0102\7\"\2\2\u0102P\3\2\2\2\u0103\u0107\7\'\2\2\u0104"+
		"\u0106\n\t\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010c\7\17\2\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3"+
		"\2\2\2\u010d\u010e\7\f\2\2\u010e\u010f\3\2\2\2\u010f\u0110\b)\2\2\u0110"+
		"R\3\2\2\2\u0111\u0113\t\n\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117"+
		"\b*\2\2\u0117T\3\2\2\2\u0118\u0119\7%\2\2\u0119\u011a\7v\2\2\u011a\u011b"+
		"\7t\2\2\u011b\u011c\7w\2\2\u011c\u0124\7g\2\2\u011d\u011e\7%\2\2\u011e"+
		"\u011f\7h\2\2\u011f\u0120\7c\2\2\u0120\u0121\7n\2\2\u0121\u0122\7u\2\2"+
		"\u0122\u0124\7g\2\2\u0123\u0118\3\2\2\2\u0123\u011d\3\2\2\2\u0124V\3\2"+
		"\2\2\24\2`bmqvz\u0081\u0087\u008f\u0096\u009c\u00a3\u00fa\u0107\u010b"+
		"\u0114\u0123\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}