// Generated from F:/u/decimo/monitoria/TCL-parser/Grammar\TclV1.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TclV1 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SET=1, GETS=2, STDIN=3, PUTS=4, IF=5, THEN=6, ELSEIF=7, ELSE=8, SWITCH=9, 
		DEFAULT=10, WHILE=11, EXPR=12, CONTINUE=13, BREAK=14, FOR=15, INCR=16, 
		ARRAY=17, EXISTS=18, SIZE=19, PROC=20, STRINGVALUE=21, INTEGERVALUE=22, 
		DOUBLEVALUE=23, TOKEN_LLAVE_IZQ=24, TOKEN_LLAVE_DER=25, TOKEN_DOLLAR=26, 
		TOKEN_PYC=27, TOKEN_COR_IZQ=28, TOKEN_COR_DER=29, TOKEN_PAR_IZQ=30, TOKEN_PAR_DER=31, 
		TOKEN_MAYOR=32, TOKEN_MENOR=33, TOKEN_MAYOR_IGUAL=34, TOKEN_MENOR_IGUAL=35, 
		TOKEN_IGUAL_STR=36, TOKEN_IGUAL_NUM=37, TOKEN_DIFF_STR=38, TOKEN_DIFF_NUM=39, 
		TOKEN_NOT=40, TOKEN_AND=41, TOKEN_OR=42, TOKEN_MAS=43, TOKEN_MENOS=44, 
		TOKEN_MUL=45, TOKEN_POT=46, TOKEN_DIV=47, TOKEN_MOD=48, ID=49, WS=50, 
		COMMENT=51, ERRORCHARACTER=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SET", "GETS", "STDIN", "PUTS", "IF", "THEN", "ELSEIF", "ELSE", "SWITCH", 
		"DEFAULT", "WHILE", "EXPR", "CONTINUE", "BREAK", "FOR", "INCR", "ARRAY", 
		"EXISTS", "SIZE", "PROC", "STRINGVALUE", "INTEGERVALUE", "DOUBLEVALUE", 
		"TOKEN_LLAVE_IZQ", "TOKEN_LLAVE_DER", "TOKEN_DOLLAR", "TOKEN_PYC", "TOKEN_COR_IZQ", 
		"TOKEN_COR_DER", "TOKEN_PAR_IZQ", "TOKEN_PAR_DER", "TOKEN_MAYOR", "TOKEN_MENOR", 
		"TOKEN_MAYOR_IGUAL", "TOKEN_MENOR_IGUAL", "TOKEN_IGUAL_STR", "TOKEN_IGUAL_NUM", 
		"TOKEN_DIFF_STR", "TOKEN_DIFF_NUM", "TOKEN_NOT", "TOKEN_AND", "TOKEN_OR", 
		"TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MUL", "TOKEN_POT", "TOKEN_DIV", "TOKEN_MOD", 
		"ID", "WS", "COMMENT", "ERRORCHARACTER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'set'", "'gets'", "'stdin'", "'puts'", "'if'", "'then'", "'elseif'", 
		"'else'", "'switch'", "'default'", "'while'", "'expr'", "'continue'", 
		"'break'", "'for'", "'incr'", "'array'", "'exists'", "'size'", "'proc'", 
		null, null, null, "'{'", "'}'", "'$'", "';'", "'['", "']'", "'('", "')'", 
		"'>'", "'<'", "'>='", "'<='", "'eq'", "'=='", "'ne'", "'!='", "'!'", "'&&'", 
		"'||'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SET", "GETS", "STDIN", "PUTS", "IF", "THEN", "ELSEIF", "ELSE", 
		"SWITCH", "DEFAULT", "WHILE", "EXPR", "CONTINUE", "BREAK", "FOR", "INCR", 
		"ARRAY", "EXISTS", "SIZE", "PROC", "STRINGVALUE", "INTEGERVALUE", "DOUBLEVALUE", 
		"TOKEN_LLAVE_IZQ", "TOKEN_LLAVE_DER", "TOKEN_DOLLAR", "TOKEN_PYC", "TOKEN_COR_IZQ", 
		"TOKEN_COR_DER", "TOKEN_PAR_IZQ", "TOKEN_PAR_DER", "TOKEN_MAYOR", "TOKEN_MENOR", 
		"TOKEN_MAYOR_IGUAL", "TOKEN_MENOR_IGUAL", "TOKEN_IGUAL_STR", "TOKEN_IGUAL_NUM", 
		"TOKEN_DIFF_STR", "TOKEN_DIFF_NUM", "TOKEN_NOT", "TOKEN_AND", "TOKEN_OR", 
		"TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MUL", "TOKEN_POT", "TOKEN_DIV", "TOKEN_MOD", 
		"ID", "WS", "COMMENT", "ERRORCHARACTER"
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


	public TclV1(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TclV1.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u014b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u00df\n\26\f\26\16"+
		"\26\u00e2\13\26\3\26\3\26\3\27\3\27\7\27\u00e8\n\27\f\27\16\27\u00eb\13"+
		"\27\3\30\6\30\u00ee\n\30\r\30\16\30\u00ef\3\30\3\30\6\30\u00f4\n\30\r"+
		"\30\16\30\u00f5\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3"+
		"&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\62\3\62\7\62\u0135\n\62\f\62\16\62\u0138\13"+
		"\62\3\63\6\63\u013b\n\63\r\63\16\63\u013c\3\63\3\63\3\64\3\64\7\64\u0143"+
		"\n\64\f\64\16\64\u0146\13\64\3\64\3\64\3\65\3\65\2\2\66\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66\3\2\7\4\2\f\f\17\17"+
		"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0151\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5o\3\2\2\2\7t\3"+
		"\2\2\2\tz\3\2\2\2\13\177\3\2\2\2\r\u0082\3\2\2\2\17\u0087\3\2\2\2\21\u008e"+
		"\3\2\2\2\23\u0093\3\2\2\2\25\u009a\3\2\2\2\27\u00a2\3\2\2\2\31\u00a8\3"+
		"\2\2\2\33\u00ad\3\2\2\2\35\u00b6\3\2\2\2\37\u00bc\3\2\2\2!\u00c0\3\2\2"+
		"\2#\u00c5\3\2\2\2%\u00cb\3\2\2\2\'\u00d2\3\2\2\2)\u00d7\3\2\2\2+\u00dc"+
		"\3\2\2\2-\u00e5\3\2\2\2/\u00ed\3\2\2\2\61\u00f7\3\2\2\2\63\u00f9\3\2\2"+
		"\2\65\u00fb\3\2\2\2\67\u00fd\3\2\2\29\u00ff\3\2\2\2;\u0101\3\2\2\2=\u0103"+
		"\3\2\2\2?\u0105\3\2\2\2A\u0107\3\2\2\2C\u0109\3\2\2\2E\u010b\3\2\2\2G"+
		"\u010e\3\2\2\2I\u0111\3\2\2\2K\u0114\3\2\2\2M\u0117\3\2\2\2O\u011a\3\2"+
		"\2\2Q\u011d\3\2\2\2S\u011f\3\2\2\2U\u0122\3\2\2\2W\u0125\3\2\2\2Y\u0127"+
		"\3\2\2\2[\u0129\3\2\2\2]\u012b\3\2\2\2_\u012e\3\2\2\2a\u0130\3\2\2\2c"+
		"\u0132\3\2\2\2e\u013a\3\2\2\2g\u0140\3\2\2\2i\u0149\3\2\2\2kl\7u\2\2l"+
		"m\7g\2\2mn\7v\2\2n\4\3\2\2\2op\7i\2\2pq\7g\2\2qr\7v\2\2rs\7u\2\2s\6\3"+
		"\2\2\2tu\7u\2\2uv\7v\2\2vw\7f\2\2wx\7k\2\2xy\7p\2\2y\b\3\2\2\2z{\7r\2"+
		"\2{|\7w\2\2|}\7v\2\2}~\7u\2\2~\n\3\2\2\2\177\u0080\7k\2\2\u0080\u0081"+
		"\7h\2\2\u0081\f\3\2\2\2\u0082\u0083\7v\2\2\u0083\u0084\7j\2\2\u0084\u0085"+
		"\7g\2\2\u0085\u0086\7p\2\2\u0086\16\3\2\2\2\u0087\u0088\7g\2\2\u0088\u0089"+
		"\7n\2\2\u0089\u008a\7u\2\2\u008a\u008b\7g\2\2\u008b\u008c\7k\2\2\u008c"+
		"\u008d\7h\2\2\u008d\20\3\2\2\2\u008e\u008f\7g\2\2\u008f\u0090\7n\2\2\u0090"+
		"\u0091\7u\2\2\u0091\u0092\7g\2\2\u0092\22\3\2\2\2\u0093\u0094\7u\2\2\u0094"+
		"\u0095\7y\2\2\u0095\u0096\7k\2\2\u0096\u0097\7v\2\2\u0097\u0098\7e\2\2"+
		"\u0098\u0099\7j\2\2\u0099\24\3\2\2\2\u009a\u009b\7f\2\2\u009b\u009c\7"+
		"g\2\2\u009c\u009d\7h\2\2\u009d\u009e\7c\2\2\u009e\u009f\7w\2\2\u009f\u00a0"+
		"\7n\2\2\u00a0\u00a1\7v\2\2\u00a1\26\3\2\2\2\u00a2\u00a3\7y\2\2\u00a3\u00a4"+
		"\7j\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7g\2\2\u00a7"+
		"\30\3\2\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7z\2\2\u00aa\u00ab\7r\2\2\u00ab"+
		"\u00ac\7t\2\2\u00ac\32\3\2\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7q\2\2\u00af"+
		"\u00b0\7p\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2"+
		"\u00b3\u00b4\7w\2\2\u00b4\u00b5\7g\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\7"+
		"d\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb"+
		"\7m\2\2\u00bb\36\3\2\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\7q\2\2\u00be\u00bf"+
		"\7t\2\2\u00bf \3\2\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3"+
		"\7e\2\2\u00c3\u00c4\7t\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7"+
		"\7t\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7{\2\2\u00ca"+
		"$\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7z\2\2\u00cd\u00ce\7k\2\2\u00ce"+
		"\u00cf\7u\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7u\2\2\u00d1&\3\2\2\2\u00d2"+
		"\u00d3\7u\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7|\2\2\u00d5\u00d6\7g\2\2"+
		"\u00d6(\3\2\2\2\u00d7\u00d8\7r\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7q\2"+
		"\2\u00da\u00db\7e\2\2\u00db*\3\2\2\2\u00dc\u00e0\7$\2\2\u00dd\u00df\n"+
		"\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7$"+
		"\2\2\u00e4,\3\2\2\2\u00e5\u00e9\t\3\2\2\u00e6\u00e8\t\3\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		".\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\t\3\2\2\u00ed\u00ec\3\2\2\2"+
		"\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f3\7\60\2\2\u00f2\u00f4\t\3\2\2\u00f3\u00f2\3\2\2\2"+
		"\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\60"+
		"\3\2\2\2\u00f7\u00f8\7}\2\2\u00f8\62\3\2\2\2\u00f9\u00fa\7\177\2\2\u00fa"+
		"\64\3\2\2\2\u00fb\u00fc\7&\2\2\u00fc\66\3\2\2\2\u00fd\u00fe\7=\2\2\u00fe"+
		"8\3\2\2\2\u00ff\u0100\7]\2\2\u0100:\3\2\2\2\u0101\u0102\7_\2\2\u0102<"+
		"\3\2\2\2\u0103\u0104\7*\2\2\u0104>\3\2\2\2\u0105\u0106\7+\2\2\u0106@\3"+
		"\2\2\2\u0107\u0108\7@\2\2\u0108B\3\2\2\2\u0109\u010a\7>\2\2\u010aD\3\2"+
		"\2\2\u010b\u010c\7@\2\2\u010c\u010d\7?\2\2\u010dF\3\2\2\2\u010e\u010f"+
		"\7>\2\2\u010f\u0110\7?\2\2\u0110H\3\2\2\2\u0111\u0112\7g\2\2\u0112\u0113"+
		"\7s\2\2\u0113J\3\2\2\2\u0114\u0115\7?\2\2\u0115\u0116\7?\2\2\u0116L\3"+
		"\2\2\2\u0117\u0118\7p\2\2\u0118\u0119\7g\2\2\u0119N\3\2\2\2\u011a\u011b"+
		"\7#\2\2\u011b\u011c\7?\2\2\u011cP\3\2\2\2\u011d\u011e\7#\2\2\u011eR\3"+
		"\2\2\2\u011f\u0120\7(\2\2\u0120\u0121\7(\2\2\u0121T\3\2\2\2\u0122\u0123"+
		"\7~\2\2\u0123\u0124\7~\2\2\u0124V\3\2\2\2\u0125\u0126\7-\2\2\u0126X\3"+
		"\2\2\2\u0127\u0128\7/\2\2\u0128Z\3\2\2\2\u0129\u012a\7,\2\2\u012a\\\3"+
		"\2\2\2\u012b\u012c\7,\2\2\u012c\u012d\7,\2\2\u012d^\3\2\2\2\u012e\u012f"+
		"\7\61\2\2\u012f`\3\2\2\2\u0130\u0131\7\'\2\2\u0131b\3\2\2\2\u0132\u0136"+
		"\t\4\2\2\u0133\u0135\t\5\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137d\3\2\2\2\u0138\u0136\3\2\2\2"+
		"\u0139\u013b\t\6\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\b\63\2\2"+
		"\u013ff\3\2\2\2\u0140\u0144\7%\2\2\u0141\u0143\n\2\2\2\u0142\u0141\3\2"+
		"\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\b\64\2\2\u0148h\3\2\2\2"+
		"\u0149\u014a\13\2\2\2\u014aj\3\2\2\2\n\2\u00e0\u00e9\u00ef\u00f5\u0136"+
		"\u013c\u0144\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}