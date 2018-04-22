// Generated from MathLang.g4 by ANTLR 4.3

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
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, SCIENTIFIC_NUMBER=3, PI=4, E=5, WS=6, VAR=7, NEWLINE=8, 
		POW=9, PLUS=10, EQUAL=11, MINUS=12, MULT=13, DIV=14, LPAREN=15, RPAREN=16, 
		LBRACKET=17, RBRACKET=18, LFIGURE=19, RFIGURE=20, MODULE=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "DOUBLE", "SCIENTIFIC_NUMBER", "PI", "E", "WS", "VAR", 
		"NEWLINE", "POW", "PLUS", "EQUAL", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", 
		"LBRACKET", "RBRACKET", "LFIGURE", "RFIGURE", "MODULE"
	};


	public MathLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MathLang.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\6\48\n\4\r\4\16\49\3\4\3\4\6\4>\n\4\r\4\16\4?\5\4B\n\4\3"+
		"\5\3\5\3\5\3\5\5\5H\n\5\3\5\6\5K\n\5\r\5\16\5L\5\5O\n\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\6\bW\n\b\r\b\16\bX\3\b\3\b\3\t\3\t\7\t_\n\t\f\t\16\tb\13\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\2\2"+
		"\30\3\3\5\4\7\2\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17"+
		"\37\20!\21#\22%\23\'\24)\25+\26-\27\3\2\5\5\2\13\13\17\17\"\"\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\u0086\2\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\3/\3\2\2\2\5\64\3\2\2\2\7\67\3\2\2\2\tC\3\2\2\2\13P\3\2\2\2\rS\3\2"+
		"\2\2\17V\3\2\2\2\21\\\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3\2\2\2\31i"+
		"\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#s\3\2\2\2%u\3\2"+
		"\2\2\'w\3\2\2\2)y\3\2\2\2+{\3\2\2\2-}\3\2\2\2/\60\7f\2\2\60\61\7g\2\2"+
		"\61\62\7v\2\2\62\63\7*\2\2\63\4\3\2\2\2\64\65\7.\2\2\65\6\3\2\2\2\668"+
		"\4\62;\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:A\3\2\2\2;=\7\60"+
		"\2\2<>\4\62;\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A;\3\2"+
		"\2\2AB\3\2\2\2B\b\3\2\2\2CN\5\7\4\2DG\5\r\7\2EH\5\27\f\2FH\5\33\16\2G"+
		"E\3\2\2\2GF\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IK\4\62;\2JI\3\2\2\2KL\3\2\2\2"+
		"LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2ND\3\2\2\2NO\3\2\2\2O\n\3\2\2\2PQ\7r\2\2"+
		"QR\7k\2\2R\f\3\2\2\2ST\7g\2\2T\16\3\2\2\2UW\t\2\2\2VU\3\2\2\2WX\3\2\2"+
		"\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\b\b\2\2[\20\3\2\2\2\\`\t\3\2\2]_\t"+
		"\4\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\22\3\2\2\2b`\3\2\2\2c"+
		"d\7\f\2\2d\24\3\2\2\2ef\7`\2\2f\26\3\2\2\2gh\7-\2\2h\30\3\2\2\2ij\7?\2"+
		"\2j\32\3\2\2\2kl\7/\2\2l\34\3\2\2\2mn\7,\2\2n\36\3\2\2\2op\7\61\2\2p "+
		"\3\2\2\2qr\7*\2\2r\"\3\2\2\2st\7+\2\2t$\3\2\2\2uv\7]\2\2v&\3\2\2\2wx\7"+
		"_\2\2x(\3\2\2\2yz\7}\2\2z*\3\2\2\2{|\7\177\2\2|,\3\2\2\2}~\7~\2\2~.\3"+
		"\2\2\2\13\29?AGLNX`\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}