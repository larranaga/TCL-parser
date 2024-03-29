// Generated from /home/larra/pl/TCL-parser/Grammar/TclV2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TclV2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, STRINGVALUE=48, INTEGERVALUE=49, DOUBLEVALUE=50, ID=51, 
		WS=52, COMMENT=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "STRINGVALUE", "INTEGERVALUE", 
		"DOUBLEVALUE", "ID", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'**'", "'%'", 
		"'||'", "'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'ne'", 
		"'eq'", "'!'", "'$'", "'proc'", "'{'", "'}'", "'return'", "'if'", "'then'", 
		"'elseif'", "'else'", "'for'", "'set'", "'incr'", "'expr'", "'while'", 
		"'break'", "'continue'", "'switch'", "'case'", "'default'", "'gets'", 
		"'stdin'", "'puts'", "'size'", "'exists'", "'['", "']'", "'array'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"STRINGVALUE", "INTEGERVALUE", "DOUBLEVALUE", "ID", "WS", "COMMENT"
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


	public TclV2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TclV2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0157\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,"+
		"\3-\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\7\61\u0128\n\61\f\61\16\61\u012b\13\61\3\61\3\61\3\62\3\62\7\62\u0131"+
		"\n\62\f\62\16\62\u0134\13\62\3\63\6\63\u0137\n\63\r\63\16\63\u0138\3\63"+
		"\3\63\6\63\u013d\n\63\r\63\16\63\u013e\3\64\3\64\7\64\u0143\n\64\f\64"+
		"\16\64\u0146\13\64\3\65\6\65\u0149\n\65\r\65\16\65\u014a\3\65\3\65\3\66"+
		"\3\66\7\66\u0151\n\66\f\66\16\66\u0154\13\66\3\66\3\66\2\2\67\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67\3\2\7\4\2\f"+
		"\f\17\17\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u015d"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2"+
		"\2\5o\3\2\2\2\7q\3\2\2\2\ts\3\2\2\2\13u\3\2\2\2\rw\3\2\2\2\17y\3\2\2\2"+
		"\21{\3\2\2\2\23~\3\2\2\2\25\u0080\3\2\2\2\27\u0083\3\2\2\2\31\u0086\3"+
		"\2\2\2\33\u0089\3\2\2\2\35\u008c\3\2\2\2\37\u008e\3\2\2\2!\u0090\3\2\2"+
		"\2#\u0093\3\2\2\2%\u0096\3\2\2\2\'\u0099\3\2\2\2)\u009c\3\2\2\2+\u009e"+
		"\3\2\2\2-\u00a0\3\2\2\2/\u00a5\3\2\2\2\61\u00a7\3\2\2\2\63\u00a9\3\2\2"+
		"\2\65\u00b0\3\2\2\2\67\u00b3\3\2\2\29\u00b8\3\2\2\2;\u00bf\3\2\2\2=\u00c4"+
		"\3\2\2\2?\u00c8\3\2\2\2A\u00cc\3\2\2\2C\u00d1\3\2\2\2E\u00d6\3\2\2\2G"+
		"\u00dc\3\2\2\2I\u00e2\3\2\2\2K\u00eb\3\2\2\2M\u00f2\3\2\2\2O\u00f7\3\2"+
		"\2\2Q\u00ff\3\2\2\2S\u0104\3\2\2\2U\u010a\3\2\2\2W\u010f\3\2\2\2Y\u0114"+
		"\3\2\2\2[\u011b\3\2\2\2]\u011d\3\2\2\2_\u011f\3\2\2\2a\u0125\3\2\2\2c"+
		"\u012e\3\2\2\2e\u0136\3\2\2\2g\u0140\3\2\2\2i\u0148\3\2\2\2k\u014e\3\2"+
		"\2\2mn\7=\2\2n\4\3\2\2\2op\7*\2\2p\6\3\2\2\2qr\7+\2\2r\b\3\2\2\2st\7-"+
		"\2\2t\n\3\2\2\2uv\7/\2\2v\f\3\2\2\2wx\7,\2\2x\16\3\2\2\2yz\7\61\2\2z\20"+
		"\3\2\2\2{|\7,\2\2|}\7,\2\2}\22\3\2\2\2~\177\7\'\2\2\177\24\3\2\2\2\u0080"+
		"\u0081\7~\2\2\u0081\u0082\7~\2\2\u0082\26\3\2\2\2\u0083\u0084\7(\2\2\u0084"+
		"\u0085\7(\2\2\u0085\30\3\2\2\2\u0086\u0087\7?\2\2\u0087\u0088\7?\2\2\u0088"+
		"\32\3\2\2\2\u0089\u008a\7#\2\2\u008a\u008b\7?\2\2\u008b\34\3\2\2\2\u008c"+
		"\u008d\7>\2\2\u008d\36\3\2\2\2\u008e\u008f\7@\2\2\u008f \3\2\2\2\u0090"+
		"\u0091\7>\2\2\u0091\u0092\7?\2\2\u0092\"\3\2\2\2\u0093\u0094\7@\2\2\u0094"+
		"\u0095\7?\2\2\u0095$\3\2\2\2\u0096\u0097\7p\2\2\u0097\u0098\7g\2\2\u0098"+
		"&\3\2\2\2\u0099\u009a\7g\2\2\u009a\u009b\7s\2\2\u009b(\3\2\2\2\u009c\u009d"+
		"\7#\2\2\u009d*\3\2\2\2\u009e\u009f\7&\2\2\u009f,\3\2\2\2\u00a0\u00a1\7"+
		"r\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7e\2\2\u00a4."+
		"\3\2\2\2\u00a5\u00a6\7}\2\2\u00a6\60\3\2\2\2\u00a7\u00a8\7\177\2\2\u00a8"+
		"\62\3\2\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"\u00ad\7w\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7p\2\2\u00af\64\3\2\2\2\u00b0"+
		"\u00b1\7k\2\2\u00b1\u00b2\7h\2\2\u00b2\66\3\2\2\2\u00b3\u00b4\7v\2\2\u00b4"+
		"\u00b5\7j\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7p\2\2\u00b78\3\2\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7g\2\2"+
		"\u00bc\u00bd\7k\2\2\u00bd\u00be\7h\2\2\u00be:\3\2\2\2\u00bf\u00c0\7g\2"+
		"\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3<\3\2"+
		"\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7t\2\2\u00c7>\3"+
		"\2\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7v\2\2\u00cb"+
		"@\3\2\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7e\2\2\u00cf"+
		"\u00d0\7t\2\2\u00d0B\3\2\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7z\2\2\u00d3"+
		"\u00d4\7r\2\2\u00d4\u00d5\7t\2\2\u00d5D\3\2\2\2\u00d6\u00d7\7y\2\2\u00d7"+
		"\u00d8\7j\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7g\2\2"+
		"\u00dbF\3\2\2\2\u00dc\u00dd\7d\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7g\2"+
		"\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7m\2\2\u00e1H\3\2\2\2\u00e2\u00e3\7"+
		"e\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7"+
		"\7k\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		"J\3\2\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7y\2\2\u00ed\u00ee\7k\2\2\u00ee"+
		"\u00ef\7v\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7j\2\2\u00f1L\3\2\2\2\u00f2"+
		"\u00f3\7e\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7g\2\2"+
		"\u00f6N\3\2\2\2\u00f7\u00f8\7f\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7h\2"+
		"\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe"+
		"\7v\2\2\u00feP\3\2\2\2\u00ff\u0100\7i\2\2\u0100\u0101\7g\2\2\u0101\u0102"+
		"\7v\2\2\u0102\u0103\7u\2\2\u0103R\3\2\2\2\u0104\u0105\7u\2\2\u0105\u0106"+
		"\7v\2\2\u0106\u0107\7f\2\2\u0107\u0108\7k\2\2\u0108\u0109\7p\2\2\u0109"+
		"T\3\2\2\2\u010a\u010b\7r\2\2\u010b\u010c\7w\2\2\u010c\u010d\7v\2\2\u010d"+
		"\u010e\7u\2\2\u010eV\3\2\2\2\u010f\u0110\7u\2\2\u0110\u0111\7k\2\2\u0111"+
		"\u0112\7|\2\2\u0112\u0113\7g\2\2\u0113X\3\2\2\2\u0114\u0115\7g\2\2\u0115"+
		"\u0116\7z\2\2\u0116\u0117\7k\2\2\u0117\u0118\7u\2\2\u0118\u0119\7v\2\2"+
		"\u0119\u011a\7u\2\2\u011aZ\3\2\2\2\u011b\u011c\7]\2\2\u011c\\\3\2\2\2"+
		"\u011d\u011e\7_\2\2\u011e^\3\2\2\2\u011f\u0120\7c\2\2\u0120\u0121\7t\2"+
		"\2\u0121\u0122\7t\2\2\u0122\u0123\7c\2\2\u0123\u0124\7{\2\2\u0124`\3\2"+
		"\2\2\u0125\u0129\7$\2\2\u0126\u0128\n\2\2\2\u0127\u0126\3\2\2\2\u0128"+
		"\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7$\2\2\u012db\3\2\2\2\u012e\u0132"+
		"\t\3\2\2\u012f\u0131\t\3\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133d\3\2\2\2\u0134\u0132\3\2\2\2"+
		"\u0135\u0137\t\3\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\7\60\2\2"+
		"\u013b\u013d\t\3\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013ff\3\2\2\2\u0140\u0144\t\4\2\2\u0141"+
		"\u0143\t\5\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145h\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149"+
		"\t\6\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\b\65\2\2\u014dj\3\2\2\2"+
		"\u014e\u0152\7%\2\2\u014f\u0151\n\2\2\2\u0150\u014f\3\2\2\2\u0151\u0154"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0156\b\66\2\2\u0156l\3\2\2\2\n\2\u0129\u0132\u0138"+
		"\u013e\u0144\u014a\u0152\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}