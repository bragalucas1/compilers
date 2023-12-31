// Generated from MicroJava.g4 by ANTLR 4.4

package srcparser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, TYPE=24, 
		IDENT=25, INT_NUMBER=26, REAL_NUMBER=27, CHAR_CONST=28, COMMENT=29, LINE_COMMENT=30, 
		WS=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'"
	};
	public static final String[] ruleNames = {
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "LETTER", "DIGIT", "EXPONENT", 
		"TYPE", "IDENT", "INT_NUMBER", "REAL_NUMBER", "CHAR_CONST", "COMMENT", 
		"LINE_COMMENT", "WS"
	};


	public MicroJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MicroJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00fc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\5\33\u0092\n\33\3\33\6\33\u0095\n\33\r\33\16\33\u0096\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u00ab\n\34\3\35\3\35\3\35\7\35\u00b0\n\35\f\35\16\35\u00b3"+
		"\13\35\3\36\6\36\u00b6\n\36\r\36\16\36\u00b7\3\37\6\37\u00bb\n\37\r\37"+
		"\16\37\u00bc\3\37\3\37\7\37\u00c1\n\37\f\37\16\37\u00c4\13\37\5\37\u00c6"+
		"\n\37\3\37\5\37\u00c9\n\37\3\37\3\37\6\37\u00cd\n\37\r\37\16\37\u00ce"+
		"\3\37\5\37\u00d2\n\37\5\37\u00d4\n\37\3 \3 \7 \u00d8\n \f \16 \u00db\13"+
		" \3 \3 \3!\3!\3!\3!\7!\u00e3\n!\f!\16!\u00e6\13!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\7\"\u00ef\n\"\f\"\16\"\u00f2\13\"\3\"\5\"\u00f5\n\"\3\"\3\"\3#\3"+
		"#\3#\3#\3\u00e4\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65"+
		"\2\67\329\33;\34=\35?\36A\37C E!\3\2\b\4\2C\\c|\4\2GGgg\4\2--//\5\2\f"+
		"\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u010b\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\3G\3\2\2\2\5I\3\2\2\2\7P\3\2\2\2\tS\3\2\2\2\13V\3\2\2\2\rX\3\2\2\2\17"+
		"Z\3\2\2\2\21_\3\2\2\2\23b\3\2\2\2\25d\3\2\2\2\27f\3\2\2\2\31h\3\2\2\2"+
		"\33j\3\2\2\2\35m\3\2\2\2\37p\3\2\2\2!x\3\2\2\2#z\3\2\2\2%\177\3\2\2\2"+
		"\'\u0081\3\2\2\2)\u0083\3\2\2\2+\u0085\3\2\2\2-\u0087\3\2\2\2/\u0089\3"+
		"\2\2\2\61\u008b\3\2\2\2\63\u008d\3\2\2\2\65\u008f\3\2\2\2\67\u00aa\3\2"+
		"\2\29\u00ac\3\2\2\2;\u00b5\3\2\2\2=\u00d3\3\2\2\2?\u00d5\3\2\2\2A\u00de"+
		"\3\2\2\2C\u00ea\3\2\2\2E\u00f8\3\2\2\2GH\7\61\2\2H\4\3\2\2\2IJ\7t\2\2"+
		"JK\7g\2\2KL\7v\2\2LM\7w\2\2MN\7t\2\2NO\7p\2\2O\6\3\2\2\2PQ\7#\2\2QR\7"+
		"?\2\2R\b\3\2\2\2ST\7@\2\2TU\7?\2\2U\n\3\2\2\2VW\7}\2\2W\f\3\2\2\2XY\7"+
		"=\2\2Y\16\3\2\2\2Z[\7x\2\2[\\\7q\2\2\\]\7k\2\2]^\7f\2\2^\20\3\2\2\2_`"+
		"\7?\2\2`a\7?\2\2a\22\3\2\2\2bc\7>\2\2c\24\3\2\2\2de\7?\2\2e\26\3\2\2\2"+
		"fg\7\177\2\2g\30\3\2\2\2hi\7@\2\2i\32\3\2\2\2jk\7k\2\2kl\7h\2\2l\34\3"+
		"\2\2\2mn\7>\2\2no\7?\2\2o\36\3\2\2\2pq\7r\2\2qr\7t\2\2rs\7q\2\2st\7i\2"+
		"\2tu\7t\2\2uv\7c\2\2vw\7o\2\2w \3\2\2\2xy\7\'\2\2y\"\3\2\2\2z{\7g\2\2"+
		"{|\7n\2\2|}\7u\2\2}~\7g\2\2~$\3\2\2\2\177\u0080\7*\2\2\u0080&\3\2\2\2"+
		"\u0081\u0082\7+\2\2\u0082(\3\2\2\2\u0083\u0084\7,\2\2\u0084*\3\2\2\2\u0085"+
		"\u0086\7-\2\2\u0086,\3\2\2\2\u0087\u0088\7.\2\2\u0088.\3\2\2\2\u0089\u008a"+
		"\7/\2\2\u008a\60\3\2\2\2\u008b\u008c\t\2\2\2\u008c\62\3\2\2\2\u008d\u008e"+
		"\4\62;\2\u008e\64\3\2\2\2\u008f\u0091\t\3\2\2\u0090\u0092\t\4\2\2\u0091"+
		"\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0095\5\63"+
		"\32\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\66\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2"+
		"\u009a\u00ab\7v\2\2\u009b\u009c\7h\2\2\u009c\u009d\7n\2\2\u009d\u009e"+
		"\7q\2\2\u009e\u009f\7c\2\2\u009f\u00ab\7v\2\2\u00a0\u00a1\7f\2\2\u00a1"+
		"\u00a2\7q\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7d\2\2\u00a4\u00a5\7n\2\2"+
		"\u00a5\u00ab\7g\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9"+
		"\7c\2\2\u00a9\u00ab\7t\2\2\u00aa\u0098\3\2\2\2\u00aa\u009b\3\2\2\2\u00aa"+
		"\u00a0\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab8\3\2\2\2\u00ac\u00b1\5\61\31"+
		"\2\u00ad\u00b0\5\61\31\2\u00ae\u00b0\5\63\32\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2:\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\5\63\32\2\u00b5\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"<\3\2\2\2\u00b9\u00bb\5\63\32\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2"+
		"\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c5\3\2\2\2\u00be\u00c2"+
		"\7\60\2\2\u00bf\u00c1\5\63\32\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2"+
		"\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c5\u00be\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c9\5\65\33\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00d4\3"+
		"\2\2\2\u00ca\u00cc\7\60\2\2\u00cb\u00cd\5\63\32\2\u00cc\u00cb\3\2\2\2"+
		"\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1"+
		"\3\2\2\2\u00d0\u00d2\5\65\33\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2"+
		"\u00d2\u00d4\3\2\2\2\u00d3\u00ba\3\2\2\2\u00d3\u00ca\3\2\2\2\u00d4>\3"+
		"\2\2\2\u00d5\u00d9\7$\2\2\u00d6\u00d8\n\5\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7$\2\2\u00dd@\3\2\2\2\u00de\u00df"+
		"\7\61\2\2\u00df\u00e0\7,\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e3\13\2\2\2"+
		"\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7,\2\2\u00e8"+
		"\u00e9\7\61\2\2\u00e9B\3\2\2\2\u00ea\u00eb\7\61\2\2\u00eb\u00ec\7\61\2"+
		"\2\u00ec\u00f0\3\2\2\2\u00ed\u00ef\n\6\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f5\7\17\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\f\2\2\u00f7D\3\2\2\2\u00f8\u00f9"+
		"\t\7\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\b#\2\2\u00fbF\3\2\2\2\24\2\u0091"+
		"\u0096\u00aa\u00af\u00b1\u00b7\u00bc\u00c2\u00c5\u00c8\u00ce\u00d1\u00d3"+
		"\u00d9\u00e4\u00f0\u00f4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}