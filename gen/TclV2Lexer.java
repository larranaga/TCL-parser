// Generated from F:/u/decimo/monitoria/TCL-parser/Grammar\TclV2.g4 by ANTLR 4.7
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
		SET=1, GETS=2, STDIN=3, PUTS=4, IF=5, THEN=6, ELSEIF=7, ELSE=8, SWITCH=9, 
		DEFAULT=10, WHILE=11, EXPR=12, CONTINUE=13, BREAK=14, FOR=15, INCR=16, 
		ARRAY=17, EXISTS=18, SIZE=19, PROC=20, RETURN=21, CASE=22, STRINGVALUE=23, 
		INTEGERVALUE=24, DOUBLEVALUE=25, TOKEN_LLAVE_IZQ=26, TOKEN_LLAVE_DER=27, 
		TOKEN_DOLLAR=28, TOKEN_PYC=29, TOKEN_COR_IZQ=30, TOKEN_COR_DER=31, TOKEN_PAR_IZQ=32, 
		TOKEN_PAR_DER=33, TOKEN_MAYOR=34, TOKEN_MENOR=35, TOKEN_MAYOR_IGUAL=36, 
		TOKEN_MENOR_IGUAL=37, TOKEN_IGUAL_STR=38, TOKEN_IGUAL_NUM=39, TOKEN_DIFF_STR=40, 
		TOKEN_DIFF_NUM=41, TOKEN_NOT=42, TOKEN_AND=43, TOKEN_OR=44, TOKEN_MAS=45, 
		TOKEN_MENOS=46, TOKEN_MUL=47, TOKEN_POT=48, TOKEN_DIV=49, TOKEN_MOD=50, 
		ID=51, WS=52, COMMENT=53, ERRORCHARACTER=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SET", "GETS", "STDIN", "PUTS", "IF", "THEN", "ELSEIF", "ELSE", "SWITCH", 
		"DEFAULT", "WHILE", "EXPR", "CONTINUE", "BREAK", "FOR", "INCR", "ARRAY", 
		"EXISTS", "SIZE", "PROC", "RETURN", "CASE", "STRINGVALUE", "INTEGERVALUE", 
		"DOUBLEVALUE", "TOKEN_LLAVE_IZQ", "TOKEN_LLAVE_DER", "TOKEN_DOLLAR", "TOKEN_PYC", 
		"TOKEN_COR_IZQ", "TOKEN_COR_DER", "TOKEN_PAR_IZQ", "TOKEN_PAR_DER", "TOKEN_MAYOR", 
		"TOKEN_MENOR", "TOKEN_MAYOR_IGUAL", "TOKEN_MENOR_IGUAL", "TOKEN_IGUAL_STR", 
		"TOKEN_IGUAL_NUM", "TOKEN_DIFF_STR", "TOKEN_DIFF_NUM", "TOKEN_NOT", "TOKEN_AND", 
		"TOKEN_OR", "TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MUL", "TOKEN_POT", "TOKEN_DIV", 
		"TOKEN_MOD", "ID", "WS", "COMMENT", "ERRORCHARACTER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'set'", "'gets'", "'stdin'", "'puts'", "'if'", "'then'", "'elseif'", 
		"'else'", "'switch'", "'default'", "'while'", "'expr'", "'continue'", 
		"'break'", "'for'", "'incr'", "'array'", "'exists'", "'size'", "'proc'", 
		"'return'", "'case'", null, null, null, "'{'", "'}'", "'$'", "';'", "'['", 
		"']'", "'('", "')'", "'>'", "'<'", "'>='", "'<='", "'eq'", "'=='", "'ne'", 
		"'!='", "'!'", "'&&'", "'||'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SET", "GETS", "STDIN", "PUTS", "IF", "THEN", "ELSEIF", "ELSE", 
		"SWITCH", "DEFAULT", "WHILE", "EXPR", "CONTINUE", "BREAK", "FOR", "INCR", 
		"ARRAY", "EXISTS", "SIZE", "PROC", "RETURN", "CASE", "STRINGVALUE", "INTEGERVALUE", 
		"DOUBLEVALUE", "TOKEN_LLAVE_IZQ", "TOKEN_LLAVE_DER", "TOKEN_DOLLAR", "TOKEN_PYC", 
		"TOKEN_COR_IZQ", "TOKEN_COR_DER", "TOKEN_PAR_IZQ", "TOKEN_PAR_DER", "TOKEN_MAYOR", 
		"TOKEN_MENOR", "TOKEN_MAYOR_IGUAL", "TOKEN_MENOR_IGUAL", "TOKEN_IGUAL_STR", 
		"TOKEN_IGUAL_NUM", "TOKEN_DIFF_STR", "TOKEN_DIFF_NUM", "TOKEN_NOT", "TOKEN_AND", 
		"TOKEN_OR", "TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MUL", "TOKEN_POT", "TOKEN_DIV", 
		"TOKEN_MOD", "ID", "WS", "COMMENT", "ERRORCHARACTER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u015b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u00ef\n\30\f\30"+
		"\16\30\u00f2\13\30\3\30\3\30\3\31\3\31\7\31\u00f8\n\31\f\31\16\31\u00fb"+
		"\13\31\3\32\6\32\u00fe\n\32\r\32\16\32\u00ff\3\32\3\32\6\32\u0104\n\32"+
		"\r\32\16\32\u0105\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3("+
		"\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\7\64\u0145\n\64\f\64\16\64\u0148"+
		"\13\64\3\65\6\65\u014b\n\65\r\65\16\65\u014c\3\65\3\65\3\66\3\66\7\66"+
		"\u0153\n\66\f\66\16\66\u0156\13\66\3\66\3\66\3\67\3\67\2\28\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8\3\2\7\4\2"+
		"\f\f\17\17\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0161"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\3o\3\2\2\2\5s\3\2\2\2\7x\3\2\2\2\t~\3\2\2\2\13\u0083\3\2\2\2\r\u0086"+
		"\3\2\2\2\17\u008b\3\2\2\2\21\u0092\3\2\2\2\23\u0097\3\2\2\2\25\u009e\3"+
		"\2\2\2\27\u00a6\3\2\2\2\31\u00ac\3\2\2\2\33\u00b1\3\2\2\2\35\u00ba\3\2"+
		"\2\2\37\u00c0\3\2\2\2!\u00c4\3\2\2\2#\u00c9\3\2\2\2%\u00cf\3\2\2\2\'\u00d6"+
		"\3\2\2\2)\u00db\3\2\2\2+\u00e0\3\2\2\2-\u00e7\3\2\2\2/\u00ec\3\2\2\2\61"+
		"\u00f5\3\2\2\2\63\u00fd\3\2\2\2\65\u0107\3\2\2\2\67\u0109\3\2\2\29\u010b"+
		"\3\2\2\2;\u010d\3\2\2\2=\u010f\3\2\2\2?\u0111\3\2\2\2A\u0113\3\2\2\2C"+
		"\u0115\3\2\2\2E\u0117\3\2\2\2G\u0119\3\2\2\2I\u011b\3\2\2\2K\u011e\3\2"+
		"\2\2M\u0121\3\2\2\2O\u0124\3\2\2\2Q\u0127\3\2\2\2S\u012a\3\2\2\2U\u012d"+
		"\3\2\2\2W\u012f\3\2\2\2Y\u0132\3\2\2\2[\u0135\3\2\2\2]\u0137\3\2\2\2_"+
		"\u0139\3\2\2\2a\u013b\3\2\2\2c\u013e\3\2\2\2e\u0140\3\2\2\2g\u0142\3\2"+
		"\2\2i\u014a\3\2\2\2k\u0150\3\2\2\2m\u0159\3\2\2\2op\7u\2\2pq\7g\2\2qr"+
		"\7v\2\2r\4\3\2\2\2st\7i\2\2tu\7g\2\2uv\7v\2\2vw\7u\2\2w\6\3\2\2\2xy\7"+
		"u\2\2yz\7v\2\2z{\7f\2\2{|\7k\2\2|}\7p\2\2}\b\3\2\2\2~\177\7r\2\2\177\u0080"+
		"\7w\2\2\u0080\u0081\7v\2\2\u0081\u0082\7u\2\2\u0082\n\3\2\2\2\u0083\u0084"+
		"\7k\2\2\u0084\u0085\7h\2\2\u0085\f\3\2\2\2\u0086\u0087\7v\2\2\u0087\u0088"+
		"\7j\2\2\u0088\u0089\7g\2\2\u0089\u008a\7p\2\2\u008a\16\3\2\2\2\u008b\u008c"+
		"\7g\2\2\u008c\u008d\7n\2\2\u008d\u008e\7u\2\2\u008e\u008f\7g\2\2\u008f"+
		"\u0090\7k\2\2\u0090\u0091\7h\2\2\u0091\20\3\2\2\2\u0092\u0093\7g\2\2\u0093"+
		"\u0094\7n\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096\22\3\2\2\2\u0097"+
		"\u0098\7u\2\2\u0098\u0099\7y\2\2\u0099\u009a\7k\2\2\u009a\u009b\7v\2\2"+
		"\u009b\u009c\7e\2\2\u009c\u009d\7j\2\2\u009d\24\3\2\2\2\u009e\u009f\7"+
		"f\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3"+
		"\7w\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7v\2\2\u00a5\26\3\2\2\2\u00a6\u00a7"+
		"\7y\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7n\2\2\u00aa"+
		"\u00ab\7g\2\2\u00ab\30\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7z\2\2\u00ae"+
		"\u00af\7r\2\2\u00af\u00b0\7t\2\2\u00b0\32\3\2\2\2\u00b1\u00b2\7e\2\2\u00b2"+
		"\u00b3\7q\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7k\2\2"+
		"\u00b6\u00b7\7p\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7g\2\2\u00b9\34\3\2"+
		"\2\2\u00ba\u00bb\7d\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be"+
		"\7c\2\2\u00be\u00bf\7m\2\2\u00bf\36\3\2\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2"+
		"\7q\2\2\u00c2\u00c3\7t\2\2\u00c3 \3\2\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6"+
		"\7p\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7t\2\2\u00c8\"\3\2\2\2\u00c9\u00ca"+
		"\7c\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7c\2\2\u00cd"+
		"\u00ce\7{\2\2\u00ce$\3\2\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7z\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7u\2\2"+
		"\u00d5&\3\2\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7|\2"+
		"\2\u00d9\u00da\7g\2\2\u00da(\3\2\2\2\u00db\u00dc\7r\2\2\u00dc\u00dd\7"+
		"t\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7e\2\2\u00df*\3\2\2\2\u00e0\u00e1"+
		"\7t\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7w\2\2\u00e4"+
		"\u00e5\7t\2\2\u00e5\u00e6\7p\2\2\u00e6,\3\2\2\2\u00e7\u00e8\7e\2\2\u00e8"+
		"\u00e9\7c\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7g\2\2\u00eb.\3\2\2\2\u00ec"+
		"\u00f0\7$\2\2\u00ed\u00ef\n\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f4\7$\2\2\u00f4\60\3\2\2\2\u00f5\u00f9\t\3\2\2"+
		"\u00f6\u00f8\t\3\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\62\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fe\t\3\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\7\60\2\2\u0102"+
		"\u0104\t\3\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\64\3\2\2\2\u0107\u0108\7}\2\2\u0108\66"+
		"\3\2\2\2\u0109\u010a\7\177\2\2\u010a8\3\2\2\2\u010b\u010c\7&\2\2\u010c"+
		":\3\2\2\2\u010d\u010e\7=\2\2\u010e<\3\2\2\2\u010f\u0110\7]\2\2\u0110>"+
		"\3\2\2\2\u0111\u0112\7_\2\2\u0112@\3\2\2\2\u0113\u0114\7*\2\2\u0114B\3"+
		"\2\2\2\u0115\u0116\7+\2\2\u0116D\3\2\2\2\u0117\u0118\7@\2\2\u0118F\3\2"+
		"\2\2\u0119\u011a\7>\2\2\u011aH\3\2\2\2\u011b\u011c\7@\2\2\u011c\u011d"+
		"\7?\2\2\u011dJ\3\2\2\2\u011e\u011f\7>\2\2\u011f\u0120\7?\2\2\u0120L\3"+
		"\2\2\2\u0121\u0122\7g\2\2\u0122\u0123\7s\2\2\u0123N\3\2\2\2\u0124\u0125"+
		"\7?\2\2\u0125\u0126\7?\2\2\u0126P\3\2\2\2\u0127\u0128\7p\2\2\u0128\u0129"+
		"\7g\2\2\u0129R\3\2\2\2\u012a\u012b\7#\2\2\u012b\u012c\7?\2\2\u012cT\3"+
		"\2\2\2\u012d\u012e\7#\2\2\u012eV\3\2\2\2\u012f\u0130\7(\2\2\u0130\u0131"+
		"\7(\2\2\u0131X\3\2\2\2\u0132\u0133\7~\2\2\u0133\u0134\7~\2\2\u0134Z\3"+
		"\2\2\2\u0135\u0136\7-\2\2\u0136\\\3\2\2\2\u0137\u0138\7/\2\2\u0138^\3"+
		"\2\2\2\u0139\u013a\7,\2\2\u013a`\3\2\2\2\u013b\u013c\7,\2\2\u013c\u013d"+
		"\7,\2\2\u013db\3\2\2\2\u013e\u013f\7\61\2\2\u013fd\3\2\2\2\u0140\u0141"+
		"\7\'\2\2\u0141f\3\2\2\2\u0142\u0146\t\4\2\2\u0143\u0145\t\5\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147h\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014b\t\6\2\2\u014a\u0149"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\b\65\2\2\u014fj\3\2\2\2\u0150\u0154\7%\2\2"+
		"\u0151\u0153\n\2\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0158\b\66\2\2\u0158l\3\2\2\2\u0159\u015a\13\2\2\2\u015an\3\2\2\2\n\2"+
		"\u00f0\u00f9\u00ff\u0105\u0146\u014c\u0154\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}