// Generated from /home/zulus/projects/basis-of-program-technology/src/main/antlr4/MathLang.g4 by ANTLR 4.7.1

    package zulus.lab3.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MathLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABLE=1, NUMBER=2, VALID_ID_START=3, VALID_ID_CHAR=4, E=5, PI=6, COMMA=7, 
		LFIGURE=8, RFIGURE=9, LBRACKET=10, RBRACKET=11, LPAREN=12, RPAREN=13, 
		PLUS=14, MINUS=15, MUL=16, DIV=17, ASSIGN=18, NEWLINE=19, WS=20, INT=21;
	public static final int
		RULE_init = 0, RULE_expression = 1, RULE_signedAtom = 2, RULE_atom = 3, 
		RULE_matrix = 4, RULE_array = 5, RULE_scientific = 6;
	public static final String[] ruleNames = {
		"init", "expression", "signedAtom", "atom", "matrix", "array", "scientific"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "','", "'{'", "'}'", "'['", 
		"']'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VARIABLE", "NUMBER", "VALID_ID_START", "VALID_ID_CHAR", "E", "PI", 
		"COMMA", "LFIGURE", "RFIGURE", "LBRACKET", "RBRACKET", "LPAREN", "RPAREN", 
		"PLUS", "MINUS", "MUL", "DIV", "ASSIGN", "NEWLINE", "WS", "INT"
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

	@Override
	public String getGrammarFileName() { return "MathLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MathLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	 
		public InitContext() { }
		public void copyFrom(InitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends InitContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MathLangParser.NEWLINE, 0); }
		public PrintContext(InitContext ctx) { copyFrom(ctx); }
	}
	public static class AssignContext extends InitContext {
		public TerminalNode VARIABLE() { return getToken(MathLangParser.VARIABLE, 0); }
		public TerminalNode ASSIGN() { return getToken(MathLangParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MathLangParser.NEWLINE, 0); }
		public AssignContext(InitContext ctx) { copyFrom(ctx); }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(VARIABLE);
				setState(15);
				match(ASSIGN);
				setState(16);
				expression(0);
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(17);
					match(NEWLINE);
					}
				}

				}
				break;
			case 2:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				expression(0);
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(21);
					match(NEWLINE);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionSubtractContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(MathLangParser.MINUS, 0); }
		public ExpressionSubtractContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExpressionDivContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(MathLangParser.DIV, 0); }
		public ExpressionDivContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExpressionMulContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MathLangParser.MUL, 0); }
		public ExpressionMulContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PlainSignedAtomContext extends ExpressionContext {
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public PlainSignedAtomContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExpressionPlusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MathLangParser.PLUS, 0); }
		public ExpressionPlusContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PlainSignedAtomContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(27);
			signedAtom();
			}
			_ctx.stop = _input.LT(-1);
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(41);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionPlusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(29);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(30);
						match(PLUS);
						setState(31);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionSubtractContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(32);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(33);
						match(MINUS);
						setState(34);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(35);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(36);
						match(DIV);
						setState(37);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionMulContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(38);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(39);
						match(MUL);
						setState(40);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SignedAtomContext extends ParserRuleContext {
		public SignedAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedAtom; }
	 
		public SignedAtomContext() { }
		public void copyFrom(SignedAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PlainValueContext extends SignedAtomContext {
		public TerminalNode PLUS() { return getToken(MathLangParser.PLUS, 0); }
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public PlainValueContext(SignedAtomContext ctx) { copyFrom(ctx); }
	}
	public static class InvertSignContext extends SignedAtomContext {
		public TerminalNode MINUS() { return getToken(MathLangParser.MINUS, 0); }
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public InvertSignContext(SignedAtomContext ctx) { copyFrom(ctx); }
	}

	public final SignedAtomContext signedAtom() throws RecognitionException {
		SignedAtomContext _localctx = new SignedAtomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_signedAtom);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new PlainValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(PLUS);
				setState(47);
				signedAtom();
				}
				break;
			case MINUS:
				_localctx = new InvertSignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(MINUS);
				setState(49);
				signedAtom();
				}
				break;
			case VARIABLE:
			case NUMBER:
			case LFIGURE:
			case LBRACKET:
				_localctx = new PlainValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MathLangParser.VARIABLE, 0); }
		public TerminalNode NUMBER() { return getToken(MathLangParser.NUMBER, 0); }
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atom);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(VARIABLE);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(NUMBER);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				matrix();
				}
				break;
			case LFIGURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(MathLangParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(MathLangParser.RBRACKET, 0); }
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MathLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MathLangParser.COMMA, i);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matrix);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(LBRACKET);
				setState(60);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(LBRACKET);
				setState(62);
				array();
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(63);
					match(COMMA);
					setState(64);
					array();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				match(RBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LFIGURE() { return getToken(MathLangParser.LFIGURE, 0); }
		public TerminalNode RFIGURE() { return getToken(MathLangParser.RFIGURE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MathLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MathLangParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array);
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(LFIGURE);
				setState(75);
				match(RFIGURE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(LFIGURE);
				setState(77);
				expression(0);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(78);
					match(COMMA);
					setState(79);
					expression(0);
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				match(RFIGURE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScientificContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(MathLangParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MathLangParser.INT, i);
		}
		public TerminalNode E() { return getToken(MathLangParser.E, 0); }
		public ScientificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientific; }
	}

	public final ScientificContext scientific() throws RecognitionException {
		ScientificContext _localctx = new ScientificContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_scientific);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(INT);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==E) {
				{
				setState(90);
				match(E);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(91);
					match(MINUS);
					}
				}

				setState(94);
				match(INT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27d\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\5\2\25\n\2"+
		"\3\2\3\2\5\2\31\n\2\5\2\33\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\4\3\4\3\4\3\4\3\4\5\4\66"+
		"\n\4\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6D\n\6\f\6\16"+
		"\6G\13\6\3\6\3\6\5\6K\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7S\n\7\f\7\16\7V\13"+
		"\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\5\b_\n\b\3\b\5\bb\n\b\3\b\2\3\4\t\2\4"+
		"\6\b\n\f\16\2\2\2n\2\32\3\2\2\2\4\34\3\2\2\2\6\65\3\2\2\2\b;\3\2\2\2\n"+
		"J\3\2\2\2\fY\3\2\2\2\16[\3\2\2\2\20\21\7\3\2\2\21\22\7\24\2\2\22\24\5"+
		"\4\3\2\23\25\7\25\2\2\24\23\3\2\2\2\24\25\3\2\2\2\25\33\3\2\2\2\26\30"+
		"\5\4\3\2\27\31\7\25\2\2\30\27\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\20"+
		"\3\2\2\2\32\26\3\2\2\2\33\3\3\2\2\2\34\35\b\3\1\2\35\36\5\6\4\2\36-\3"+
		"\2\2\2\37 \f\7\2\2 !\7\20\2\2!,\5\4\3\b\"#\f\6\2\2#$\7\21\2\2$,\5\4\3"+
		"\7%&\f\5\2\2&\'\7\23\2\2\',\5\4\3\6()\f\4\2\2)*\7\22\2\2*,\5\4\3\5+\37"+
		"\3\2\2\2+\"\3\2\2\2+%\3\2\2\2+(\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2"+
		".\5\3\2\2\2/-\3\2\2\2\60\61\7\20\2\2\61\66\5\6\4\2\62\63\7\21\2\2\63\66"+
		"\5\6\4\2\64\66\5\b\5\2\65\60\3\2\2\2\65\62\3\2\2\2\65\64\3\2\2\2\66\7"+
		"\3\2\2\2\67<\7\3\2\28<\7\4\2\29<\5\n\6\2:<\5\f\7\2;\67\3\2\2\2;8\3\2\2"+
		"\2;9\3\2\2\2;:\3\2\2\2<\t\3\2\2\2=>\7\f\2\2>K\7\r\2\2?@\7\f\2\2@E\5\f"+
		"\7\2AB\7\t\2\2BD\5\f\7\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2"+
		"\2\2GE\3\2\2\2HI\7\r\2\2IK\3\2\2\2J=\3\2\2\2J?\3\2\2\2K\13\3\2\2\2LM\7"+
		"\n\2\2MZ\7\13\2\2NO\7\n\2\2OT\5\4\3\2PQ\7\t\2\2QS\5\4\3\2RP\3\2\2\2SV"+
		"\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\13\2\2XZ\3\2\2\2"+
		"YL\3\2\2\2YN\3\2\2\2Z\r\3\2\2\2[a\7\27\2\2\\^\7\7\2\2]_\7\21\2\2^]\3\2"+
		"\2\2^_\3\2\2\2_`\3\2\2\2`b\7\27\2\2a\\\3\2\2\2ab\3\2\2\2b\17\3\2\2\2\17"+
		"\24\30\32+-\65;EJTY^a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}