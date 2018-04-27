// Generated from /home/zulus/projects/basis-of-program-technology/src/main/antlr4/MathLang.g4 by ANTLR 4.7

    package zulus.lab3.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MathLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, END=3, SCIENTIFIC_NUMBER=4, PI=5, E=6, WS=7, VAR=8, NEWLINE=9, 
		POW=10, PLUS=11, EQUAL=12, MINUS=13, MULT=14, DIV=15, LPAREN=16, RPAREN=17, 
		LBRACKET=18, RBRACKET=19, LFIGURE=20, RFIGURE=21, MODULE=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "END", "DOUBLE", "SCIENTIFIC_NUMBER", "PI", "E", "WS", 
		"VAR", "NEWLINE", "POW", "PLUS", "EQUAL", "MINUS", "MULT", "DIV", "LPAREN", 
		"RPAREN", "LBRACKET", "RBRACKET", "LFIGURE", "RFIGURE", "MODULE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'det('", null, null, "'pi'", "'e'", null, null, "'\n'", 
		"'^'", "'+'", "'='", "'-'", "'*'", "'/'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "END", "SCIENTIFIC_NUMBER", "PI", "E", "WS", "VAR", 
		"NEWLINE", "POW", "PLUS", "EQUAL", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", 
		"LBRACKET", "RBRACKET", "LFIGURE", "RFIGURE", "MODULE"
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


	public MathLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MathLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0084\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\5\4:\n\4\3\5\6\5=\n\5\r\5\16\5>\3\5\3\5\6"+
		"\5C\n\5\r\5\16\5D\5\5G\n\5\3\6\3\6\3\6\3\6\5\6M\n\6\3\6\6\6P\n\6\r\6\16"+
		"\6Q\5\6T\n\6\3\7\3\7\3\7\3\b\3\b\3\t\6\t\\\n\t\r\t\16\t]\3\t\3\t\3\n\3"+
		"\n\7\nd\n\n\f\n\16\ng\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\2\2\31\3\3\5\4\7\5\t\2\13\6\r\7\17\b\21\t\23\n"+
		"\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\3"+
		"\2\6\3\3\f\f\5\2\13\13\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\2\u008b\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5"+
		"\63\3\2\2\2\79\3\2\2\2\t<\3\2\2\2\13H\3\2\2\2\rU\3\2\2\2\17X\3\2\2\2\21"+
		"[\3\2\2\2\23a\3\2\2\2\25h\3\2\2\2\27j\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2"+
		"\35p\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#v\3\2\2\2%x\3\2\2\2\'z\3\2\2\2)|\3"+
		"\2\2\2+~\3\2\2\2-\u0080\3\2\2\2/\u0082\3\2\2\2\61\62\7.\2\2\62\4\3\2\2"+
		"\2\63\64\7f\2\2\64\65\7g\2\2\65\66\7v\2\2\66\67\7*\2\2\67\6\3\2\2\28:"+
		"\t\2\2\298\3\2\2\2:\b\3\2\2\2;=\4\62;\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2"+
		">?\3\2\2\2?F\3\2\2\2@B\7\60\2\2AC\4\62;\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2"+
		"\2DE\3\2\2\2EG\3\2\2\2F@\3\2\2\2FG\3\2\2\2G\n\3\2\2\2HS\5\t\5\2IL\5\17"+
		"\b\2JM\5\31\r\2KM\5\35\17\2LJ\3\2\2\2LK\3\2\2\2LM\3\2\2\2MO\3\2\2\2NP"+
		"\4\62;\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SI\3\2\2\2S"+
		"T\3\2\2\2T\f\3\2\2\2UV\7r\2\2VW\7k\2\2W\16\3\2\2\2XY\7g\2\2Y\20\3\2\2"+
		"\2Z\\\t\3\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\b\t"+
		"\2\2`\22\3\2\2\2ae\t\4\2\2bd\t\5\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3"+
		"\2\2\2f\24\3\2\2\2ge\3\2\2\2hi\7\f\2\2i\26\3\2\2\2jk\7`\2\2k\30\3\2\2"+
		"\2lm\7-\2\2m\32\3\2\2\2no\7?\2\2o\34\3\2\2\2pq\7/\2\2q\36\3\2\2\2rs\7"+
		",\2\2s \3\2\2\2tu\7\61\2\2u\"\3\2\2\2vw\7*\2\2w$\3\2\2\2xy\7+\2\2y&\3"+
		"\2\2\2z{\7]\2\2{(\3\2\2\2|}\7_\2\2}*\3\2\2\2~\177\7}\2\2\177,\3\2\2\2"+
		"\u0080\u0081\7\177\2\2\u0081.\3\2\2\2\u0082\u0083\7~\2\2\u0083\60\3\2"+
		"\2\2\f\29>DFLQS]e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}