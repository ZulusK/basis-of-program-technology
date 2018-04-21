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
		T__0=1, T__1=2, SCIENTIFIC_NUMBER=3, PI=4, E=5, WS=6, VAR=7, NEWLINE=8, 
		POW=9, SIGN=10, PLUS=11, EQUAL=12, MINUS=13, MULT=14, DIV=15, LPAREN=16, 
		RPAREN=17, LBRACKET=18, RBRACKET=19, LFIGURE=20, RFIGURE=21, MODULE=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "DOUBLE", "SCIENTIFIC_NUMBER", "PI", "E", "WS", "VAR", 
		"NEWLINE", "POW", "SIGN", "PLUS", "EQUAL", "MINUS", "MULT", "DIV", "LPAREN", 
		"RPAREN", "LBRACKET", "RBRACKET", "LFIGURE", "RFIGURE", "MODULE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'det('", null, "'pi'", "'e'", null, null, "'\n'", "'^'", 
		null, "'+'", "'='", "'-'", "'*'", "'/'", "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "SCIENTIFIC_NUMBER", "PI", "E", "WS", "VAR", "NEWLINE", 
		"POW", "SIGN", "PLUS", "EQUAL", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\6\4:\n\4\r\4\16\4;\3\4\3\4\6\4@\n\4\r\4\16"+
		"\4A\5\4D\n\4\3\5\3\5\3\5\5\5I\n\5\3\5\6\5L\n\5\r\5\16\5M\5\5P\n\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\6\bX\n\b\r\b\16\bY\3\b\3\b\3\t\3\t\7\t`\n\t\f\t\16"+
		"\tc\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\2\2\31\3\3\5\4\7\2\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27"+
		"\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\3\2\6\5\2\13"+
		"\13\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\4\2--//\2\u0088\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2"+
		"\2\79\3\2\2\2\tE\3\2\2\2\13Q\3\2\2\2\rT\3\2\2\2\17W\3\2\2\2\21]\3\2\2"+
		"\2\23d\3\2\2\2\25f\3\2\2\2\27h\3\2\2\2\31j\3\2\2\2\33l\3\2\2\2\35n\3\2"+
		"\2\2\37p\3\2\2\2!r\3\2\2\2#t\3\2\2\2%v\3\2\2\2\'x\3\2\2\2)z\3\2\2\2+|"+
		"\3\2\2\2-~\3\2\2\2/\u0080\3\2\2\2\61\62\7.\2\2\62\4\3\2\2\2\63\64\7f\2"+
		"\2\64\65\7g\2\2\65\66\7v\2\2\66\67\7*\2\2\67\6\3\2\2\28:\4\62;\298\3\2"+
		"\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<C\3\2\2\2=?\7\60\2\2>@\4\62;\2?>\3"+
		"\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2C=\3\2\2\2CD\3\2\2\2D\b"+
		"\3\2\2\2EO\5\7\4\2FH\5\r\7\2GI\5\27\f\2HG\3\2\2\2HI\3\2\2\2IK\3\2\2\2"+
		"JL\4\62;\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OF\3\2\2\2"+
		"OP\3\2\2\2P\n\3\2\2\2QR\7r\2\2RS\7k\2\2S\f\3\2\2\2TU\7g\2\2U\16\3\2\2"+
		"\2VX\t\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\b\b"+
		"\2\2\\\20\3\2\2\2]a\t\3\2\2^`\t\4\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab"+
		"\3\2\2\2b\22\3\2\2\2ca\3\2\2\2de\7\f\2\2e\24\3\2\2\2fg\7`\2\2g\26\3\2"+
		"\2\2hi\t\5\2\2i\30\3\2\2\2jk\7-\2\2k\32\3\2\2\2lm\7?\2\2m\34\3\2\2\2n"+
		"o\7/\2\2o\36\3\2\2\2pq\7,\2\2q \3\2\2\2rs\7\61\2\2s\"\3\2\2\2tu\7*\2\2"+
		"u$\3\2\2\2vw\7+\2\2w&\3\2\2\2xy\7]\2\2y(\3\2\2\2z{\7_\2\2{*\3\2\2\2|}"+
		"\7}\2\2},\3\2\2\2~\177\7\177\2\2\177.\3\2\2\2\u0080\u0081\7~\2\2\u0081"+
		"\60\3\2\2\2\13\2;ACHMOYa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}