// Generated from /home/zulus/projects/basis-of-program-technology/src/main/antlr4/MathLang.g4 by ANTLR 4.7.1

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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABLE=1, NUMBER=2, VALID_ID_START=3, VALID_ID_CHAR=4, E=5, PI=6, COMMA=7, 
		LFIGURE=8, RFIGURE=9, LBRACKET=10, RBRACKET=11, LPAREN=12, RPAREN=13, 
		PLUS=14, MINUS=15, MUL=16, DIV=17, ASSIGN=18, NEWLINE=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VARIABLE", "NUMBER", "VALID_ID_START", "VALID_ID_CHAR", "SIGN", "E", 
		"INT", "PI", "COMMA", "LFIGURE", "RFIGURE", "LBRACKET", "RBRACKET", "LPAREN", 
		"RPAREN", "PLUS", "MINUS", "MUL", "DIV", "ASSIGN", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "','", "'{'", "'}'", "'['", 
		"']'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VARIABLE", "NUMBER", "VALID_ID_START", "VALID_ID_CHAR", "E", "PI", 
		"COMMA", "LFIGURE", "RFIGURE", "LBRACKET", "RBRACKET", "LPAREN", "RPAREN", 
		"PLUS", "MINUS", "MUL", "DIV", "ASSIGN", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\62\n\2"+
		"\f\2\16\2\65\13\2\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\5\3\5\5\5@\n\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tN\n\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\5\26i\n\26\3\26\3\26\3\27\6\27n\n\27\r"+
		"\27\16\27o\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\2\r\7\17\2\21\b\23\t\25"+
		"\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26\3\2\6\5\2"+
		"C\\aac|\4\2--//\4\2GGgg\4\2\13\f\17\17\2w\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\3/\3\2\2\2\5\66\3\2\2\2\7;\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3"+
		"\2\2\2\17E\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31"+
		"U\3\2\2\2\33W\3\2\2\2\35Y\3\2\2\2\37[\3\2\2\2!]\3\2\2\2#_\3\2\2\2%a\3"+
		"\2\2\2\'c\3\2\2\2)e\3\2\2\2+h\3\2\2\2-m\3\2\2\2/\63\5\7\4\2\60\62\5\t"+
		"\5\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\4\3\2"+
		"\2\2\65\63\3\2\2\2\669\5\17\b\2\678\7\60\2\28:\5\17\b\29\67\3\2\2\29:"+
		"\3\2\2\2:\6\3\2\2\2;<\t\2\2\2<\b\3\2\2\2=@\5\7\4\2>@\5\17\b\2?=\3\2\2"+
		"\2?>\3\2\2\2@\n\3\2\2\2AB\t\3\2\2B\f\3\2\2\2CD\t\4\2\2D\16\3\2\2\2EF\4"+
		"\62;\2F\20\3\2\2\2GH\7R\2\2HN\7K\2\2IJ\7R\2\2JN\7k\2\2KL\7r\2\2LN\7k\2"+
		"\2MG\3\2\2\2MI\3\2\2\2MK\3\2\2\2N\22\3\2\2\2OP\7.\2\2P\24\3\2\2\2QR\7"+
		"}\2\2R\26\3\2\2\2ST\7\177\2\2T\30\3\2\2\2UV\7]\2\2V\32\3\2\2\2WX\7_\2"+
		"\2X\34\3\2\2\2YZ\7*\2\2Z\36\3\2\2\2[\\\7+\2\2\\ \3\2\2\2]^\7-\2\2^\"\3"+
		"\2\2\2_`\7/\2\2`$\3\2\2\2ab\7,\2\2b&\3\2\2\2cd\7\61\2\2d(\3\2\2\2ef\7"+
		"?\2\2f*\3\2\2\2gi\7\17\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\f\2\2k,\3"+
		"\2\2\2ln\t\5\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\b"+
		"\27\2\2r.\3\2\2\2\t\2\639?Mho\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}