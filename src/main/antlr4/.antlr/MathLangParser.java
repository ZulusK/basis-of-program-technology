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
		PI=1, E=2, WS=3, VAR=4, NEWLINE=5, POW=6, SIGN=7, PLUS=8, EQUAL=9, MINUS=10, 
		MULT=11, DIV=12, LPAREN=13, RPAREN=14, LBRACKET=15, RBRACKET=16, LFIGURE=17, 
		RFIGURE=18, MUL=19, SCIENTIFIC_NUMBER=20, VARIABLE=21, COMMA=22;
	public static final int
		RULE_assign = 0, RULE_expression = 1, RULE_factor = 2, RULE_signedAtom = 3, 
		RULE_atom = 4, RULE_scientific = 5, RULE_variable = 6, RULE_array = 7, 
		RULE_matrix = 8;
	public static final String[] ruleNames = {
		"assign", "expression", "factor", "signedAtom", "atom", "scientific", 
		"variable", "array", "matrix"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pi'", "'e'", null, null, "'\r?\n'", "'^'", null, "'+'", "'='", 
		"'-'", "'*'", "'/'", "'('", "')'", "'['", "']'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PI", "E", "WS", "VAR", "NEWLINE", "POW", "SIGN", "PLUS", "EQUAL", 
		"MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LFIGURE", 
		"RFIGURE", "MUL", "SCIENTIFIC_NUMBER", "VARIABLE", "COMMA"
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MathLangParser.VAR, 0); }
		public TerminalNode EQUAL() { return getToken(MathLangParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(MathLangParser.NEWLINE, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(VAR);
			setState(19);
			match(EQUAL);
			setState(20);
			expression(0);
			setState(21);
			match(NEWLINE);
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
	public static class SubtractExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(MathLangParser.MINUS, 0); }
		public SubtractExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SumExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MathLangParser.PLUS, 0); }
		public SumExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class DivExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(MathLangParser.DIV, 0); }
		public DivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MulExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MathLangParser.MUL, 0); }
		public MulExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PlainSignedAtomContext extends ExpressionContext {
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public PlainSignedAtomContext(ExpressionContext ctx) { copyFrom(ctx); }
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

			setState(24);
			signedAtom();
			}
			_ctx.stop = _input.LT(-1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(38);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new SumExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(26);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(27);
						match(PLUS);
						setState(28);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new SubtractExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(29);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(30);
						match(MINUS);
						setState(31);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new DivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(32);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(33);
						match(DIV);
						setState(34);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(35);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(36);
						match(MUL);
						setState(37);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public List<SignedAtomContext> signedAtom() {
			return getRuleContexts(SignedAtomContext.class);
		}
		public SignedAtomContext signedAtom(int i) {
			return getRuleContext(SignedAtomContext.class,i);
		}
		public TerminalNode POW() { return getToken(MathLangParser.POW, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			signedAtom();
			setState(44);
			match(POW);
			setState(45);
			signedAtom();
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
	public static class PlainAtomContext extends SignedAtomContext {
		public TerminalNode PLUS() { return getToken(MathLangParser.PLUS, 0); }
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public PlainAtomContext(SignedAtomContext ctx) { copyFrom(ctx); }
	}
	public static class InverAtomContext extends SignedAtomContext {
		public TerminalNode MINUS() { return getToken(MathLangParser.MINUS, 0); }
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public InverAtomContext(SignedAtomContext ctx) { copyFrom(ctx); }
	}

	public final SignedAtomContext signedAtom() throws RecognitionException {
		SignedAtomContext _localctx = new SignedAtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_signedAtom);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new PlainAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(PLUS);
				setState(48);
				signedAtom();
				}
				break;
			case MINUS:
				_localctx = new InverAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(MINUS);
				setState(50);
				signedAtom();
				}
				break;
			case LPAREN:
			case SCIENTIFIC_NUMBER:
			case VARIABLE:
				_localctx = new PlainAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
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
		public ScientificContext scientific() {
			return getRuleContext(ScientificContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MathLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MathLangParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				scientific();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				variable();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(LPAREN);
				setState(57);
				expression(0);
				setState(58);
				match(RPAREN);
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

	public static class ScientificContext extends ParserRuleContext {
		public TerminalNode SCIENTIFIC_NUMBER() { return getToken(MathLangParser.SCIENTIFIC_NUMBER, 0); }
		public ScientificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientific; }
	}

	public final ScientificContext scientific() throws RecognitionException {
		ScientificContext _localctx = new ScientificContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scientific);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(SCIENTIFIC_NUMBER);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MathLangParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(VARIABLE);
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
		enterRule(_localctx, 14, RULE_array);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(LFIGURE);
				setState(67);
				match(RFIGURE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(LFIGURE);
				setState(69);
				expression(0);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(70);
					match(COMMA);
					setState(71);
					expression(0);
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(77);
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

	public static class MatrixContext extends ParserRuleContext {
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
	 
		public MatrixContext() { }
		public void copyFrom(MatrixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BuildMatrxWithNumbersContext extends MatrixContext {
		public TerminalNode LBRACKET() { return getToken(MathLangParser.LBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(MathLangParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MathLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MathLangParser.COMMA, i);
		}
		public BuildMatrxWithNumbersContext(MatrixContext ctx) { copyFrom(ctx); }
	}
	public static class BuildEmptyMatrixContext extends MatrixContext {
		public TerminalNode LBRACKET() { return getToken(MathLangParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(MathLangParser.RBRACKET, 0); }
		public BuildEmptyMatrixContext(MatrixContext ctx) { copyFrom(ctx); }
	}
	public static class BuildMatrxWithArraysContext extends MatrixContext {
		public TerminalNode LBRACKET() { return getToken(MathLangParser.LBRACKET, 0); }
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(MathLangParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MathLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MathLangParser.COMMA, i);
		}
		public BuildMatrxWithArraysContext(MatrixContext ctx) { copyFrom(ctx); }
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_matrix);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new BuildEmptyMatrixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(LBRACKET);
				setState(82);
				match(RBRACKET);
				}
				break;
			case 2:
				_localctx = new BuildMatrxWithArraysContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(LBRACKET);
				setState(84);
				array();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(85);
					match(COMMA);
					setState(86);
					array();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(RBRACKET);
				}
				break;
			case 3:
				_localctx = new BuildMatrxWithNumbersContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(LBRACKET);
				setState(95);
				expression(0);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(96);
					match(COMMA);
					setState(97);
					expression(0);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30n\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3)\n\3\f\3\16\3,\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\67\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6?\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\tK\n\t\f\t\16\tN\13\t\3\t\3\t\5\tR\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\nZ\n\n\f\n\16\n]\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\ne\n\n\f\n\16\nh\13"+
		"\n\3\n\3\n\5\nl\n\n\3\n\2\3\4\13\2\4\6\b\n\f\16\20\22\2\2\2r\2\24\3\2"+
		"\2\2\4\31\3\2\2\2\6-\3\2\2\2\b\66\3\2\2\2\n>\3\2\2\2\f@\3\2\2\2\16B\3"+
		"\2\2\2\20Q\3\2\2\2\22k\3\2\2\2\24\25\7\6\2\2\25\26\7\13\2\2\26\27\5\4"+
		"\3\2\27\30\7\7\2\2\30\3\3\2\2\2\31\32\b\3\1\2\32\33\5\b\5\2\33*\3\2\2"+
		"\2\34\35\f\7\2\2\35\36\7\n\2\2\36)\5\4\3\b\37 \f\6\2\2 !\7\f\2\2!)\5\4"+
		"\3\7\"#\f\5\2\2#$\7\16\2\2$)\5\4\3\6%&\f\4\2\2&\'\7\25\2\2\')\5\4\3\5"+
		"(\34\3\2\2\2(\37\3\2\2\2(\"\3\2\2\2(%\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3"+
		"\2\2\2+\5\3\2\2\2,*\3\2\2\2-.\5\b\5\2./\7\b\2\2/\60\5\b\5\2\60\7\3\2\2"+
		"\2\61\62\7\n\2\2\62\67\5\b\5\2\63\64\7\f\2\2\64\67\5\b\5\2\65\67\5\n\6"+
		"\2\66\61\3\2\2\2\66\63\3\2\2\2\66\65\3\2\2\2\67\t\3\2\2\28?\5\f\7\29?"+
		"\5\16\b\2:;\7\17\2\2;<\5\4\3\2<=\7\20\2\2=?\3\2\2\2>8\3\2\2\2>9\3\2\2"+
		"\2>:\3\2\2\2?\13\3\2\2\2@A\7\26\2\2A\r\3\2\2\2BC\7\27\2\2C\17\3\2\2\2"+
		"DE\7\23\2\2ER\7\24\2\2FG\7\23\2\2GL\5\4\3\2HI\7\30\2\2IK\5\4\3\2JH\3\2"+
		"\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\24\2\2PR\3"+
		"\2\2\2QD\3\2\2\2QF\3\2\2\2R\21\3\2\2\2ST\7\21\2\2Tl\7\22\2\2UV\7\21\2"+
		"\2V[\5\20\t\2WX\7\30\2\2XZ\5\20\t\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3"+
		"\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\22\2\2_l\3\2\2\2`a\7\21\2\2af\5\4\3\2"+
		"bc\7\30\2\2ce\5\4\3\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2"+
		"\2hf\3\2\2\2ij\7\22\2\2jl\3\2\2\2kS\3\2\2\2kU\3\2\2\2k`\3\2\2\2l\23\3"+
		"\2\2\2\13(*\66>LQ[fk";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}