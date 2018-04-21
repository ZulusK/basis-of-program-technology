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
		VARIABLE=1, SCIENTIFIC_NUMBER=2, COMMA=3, LFIGURE=4, RFIGURE=5, LBRACKET=6, 
		RBRACKET=7, LPAREN=8, RPAREN=9, PLUS=10, MINUS=11, MUL=12, DIV=13, ASSIGN=14, 
		NEWLINE=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VARIABLE", "SCIENTIFIC_NUMBER", "NUMBER", "VALID_ID_START", "VALID_ID_CHAR", 
		"SIGN", "E", "INT", "COMMA", "LFIGURE", "RFIGURE", "LBRACKET", "RBRACKET", 
		"LPAREN", "RPAREN", "PLUS", "MINUS", "MUL", "DIV", "ASSIGN", "NEWLINE", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "','", "'{'", "'}'", "'['", "']'", "'('", "')'", "'+'", 
		"'-'", "'*'", "'/'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VARIABLE", "SCIENTIFIC_NUMBER", "COMMA", "LFIGURE", "RFIGURE", 
		"LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "PLUS", "MINUS", "MUL", "DIV", 
		"ASSIGN", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\62\n\2"+
		"\f\2\16\2\65\13\2\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\4\5"+
		"\4C\n\4\3\5\3\5\3\6\3\6\5\6I\n\6\3\7\3\7\5\7M\n\7\3\b\3\b\3\t\6\tR\n\t"+
		"\r\t\16\tS\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\5\26o\n\26"+
		"\3\26\3\26\3\27\6\27t\n\27\r\27\16\27u\3\27\3\27\2\2\30\3\3\5\4\7\2\t"+
		"\2\13\2\r\2\17\2\21\2\23\5\25\6\27\7\31\b\33\t\35\n\37\13!\f#\r%\16\'"+
		"\17)\20+\21-\22\3\2\6\5\2C\\aac|\4\2GGgg\3\2\62;\4\2\13\f\17\17\2{\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\66\3\2"+
		"\2\2\7?\3\2\2\2\tD\3\2\2\2\13H\3\2\2\2\rL\3\2\2\2\17N\3\2\2\2\21Q\3\2"+
		"\2\2\23U\3\2\2\2\25W\3\2\2\2\27Y\3\2\2\2\31[\3\2\2\2\33]\3\2\2\2\35_\3"+
		"\2\2\2\37a\3\2\2\2!c\3\2\2\2#e\3\2\2\2%g\3\2\2\2\'i\3\2\2\2)k\3\2\2\2"+
		"+n\3\2\2\2-s\3\2\2\2/\63\5\t\5\2\60\62\5\13\6\2\61\60\3\2\2\2\62\65\3"+
		"\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\4\3\2\2\2\65\63\3\2\2\2\66=\5\7"+
		"\4\2\679\5\17\b\28:\5\r\7\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\5\21\t\2<"+
		">\3\2\2\2=\67\3\2\2\2=>\3\2\2\2>\6\3\2\2\2?B\5\21\t\2@A\7\60\2\2AC\5\21"+
		"\t\2B@\3\2\2\2BC\3\2\2\2C\b\3\2\2\2DE\t\2\2\2E\n\3\2\2\2FI\5\t\5\2GI\5"+
		"\21\t\2HF\3\2\2\2HG\3\2\2\2I\f\3\2\2\2JM\5!\21\2KM\5#\22\2LJ\3\2\2\2L"+
		"K\3\2\2\2M\16\3\2\2\2NO\t\3\2\2O\20\3\2\2\2PR\t\4\2\2QP\3\2\2\2RS\3\2"+
		"\2\2SQ\3\2\2\2ST\3\2\2\2T\22\3\2\2\2UV\7.\2\2V\24\3\2\2\2WX\7}\2\2X\26"+
		"\3\2\2\2YZ\7\177\2\2Z\30\3\2\2\2[\\\7]\2\2\\\32\3\2\2\2]^\7_\2\2^\34\3"+
		"\2\2\2_`\7*\2\2`\36\3\2\2\2ab\7+\2\2b \3\2\2\2cd\7-\2\2d\"\3\2\2\2ef\7"+
		"/\2\2f$\3\2\2\2gh\7,\2\2h&\3\2\2\2ij\7\61\2\2j(\3\2\2\2kl\7?\2\2l*\3\2"+
		"\2\2mo\7\17\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\f\2\2q,\3\2\2\2rt\t"+
		"\5\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\27\2\2x."+
		"\3\2\2\2\f\2\639=BHLSnu\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}