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
		T__0=1, SCIENTIFIC_NUMBER=2, PI=3, E=4, WS=5, VAR=6, NEWLINE=7, POW=8, 
		SIGN=9, PLUS=10, EQUAL=11, MINUS=12, MULT=13, DIV=14, LPAREN=15, RPAREN=16, 
		LBRACKET=17, RBRACKET=18, LFIGURE=19, RFIGURE=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "DOUBLE", "SCIENTIFIC_NUMBER", "PI", "E", "WS", "VAR", "NEWLINE", 
		"POW", "SIGN", "PLUS", "EQUAL", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", 
		"LBRACKET", "RBRACKET", "LFIGURE", "RFIGURE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", null, "'pi'", "'e'", null, null, "'\r?\n'", "'^'", null, 
		"'+'", "'='", "'-'", "'*'", "'/'", "'('", "')'", "'['", "']'", "'{'", 
		"'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "SCIENTIFIC_NUMBER", "PI", "E", "WS", "VAR", "NEWLINE", "POW", 
		"SIGN", "PLUS", "EQUAL", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "LBRACKET", 
		"RBRACKET", "LFIGURE", "RFIGURE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\6\3\61\n\3\r\3\16"+
		"\3\62\3\3\3\3\6\3\67\n\3\r\3\16\38\5\3;\n\3\3\4\3\4\3\4\5\4@\n\4\3\4\6"+
		"\4C\n\4\r\4\16\4D\5\4G\n\4\3\5\3\5\3\5\3\6\3\6\3\7\6\7O\n\7\r\7\16\7P"+
		"\3\7\3\7\3\b\3\b\7\bW\n\b\f\b\16\bZ\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\2\2\27\3\3\5\2\7\4\t\5\13\6\r"+
		"\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)"+
		"\25+\26\3\2\6\5\2\13\13\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\4\2--//\2"+
		"\177\2\3\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\60\3\2\2\2\7<\3"+
		"\2\2\2\tH\3\2\2\2\13K\3\2\2\2\rN\3\2\2\2\17T\3\2\2\2\21[\3\2\2\2\23_\3"+
		"\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31e\3\2\2\2\33g\3\2\2\2\35i\3\2\2\2\37"+
		"k\3\2\2\2!m\3\2\2\2#o\3\2\2\2%q\3\2\2\2\'s\3\2\2\2)u\3\2\2\2+w\3\2\2\2"+
		"-.\7.\2\2.\4\3\2\2\2/\61\4\62;\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2"+
		"\2\62\63\3\2\2\2\63:\3\2\2\2\64\66\7\60\2\2\65\67\4\62;\2\66\65\3\2\2"+
		"\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:\64\3\2\2\2:;\3\2\2\2;"+
		"\6\3\2\2\2<F\5\5\3\2=?\5\13\6\2>@\5\25\13\2?>\3\2\2\2?@\3\2\2\2@B\3\2"+
		"\2\2AC\4\62;\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2F=\3\2"+
		"\2\2FG\3\2\2\2G\b\3\2\2\2HI\7r\2\2IJ\7k\2\2J\n\3\2\2\2KL\7g\2\2L\f\3\2"+
		"\2\2MO\t\2\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\b\7"+
		"\2\2S\16\3\2\2\2TX\t\3\2\2UW\t\4\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3"+
		"\2\2\2Y\20\3\2\2\2ZX\3\2\2\2[\\\7\17\2\2\\]\7A\2\2]^\7\f\2\2^\22\3\2\2"+
		"\2_`\7`\2\2`\24\3\2\2\2ab\t\5\2\2b\26\3\2\2\2cd\7-\2\2d\30\3\2\2\2ef\7"+
		"?\2\2f\32\3\2\2\2gh\7/\2\2h\34\3\2\2\2ij\7,\2\2j\36\3\2\2\2kl\7\61\2\2"+
		"l \3\2\2\2mn\7*\2\2n\"\3\2\2\2op\7+\2\2p$\3\2\2\2qr\7]\2\2r&\3\2\2\2s"+
		"t\7_\2\2t(\3\2\2\2uv\7}\2\2v*\3\2\2\2wx\7\177\2\2x,\3\2\2\2\13\2\628:"+
		"?DFPX\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}