// Generated from /home/zulus/projects/basis-of-program-technology/src/main/antlr4/MathLang.g4 by ANTLR 4.7

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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, END=3, SCIENTIFIC_NUMBER=4, PI=5, E=6, WS=7, VAR=8, NEWLINE=9, 
		POW=10, PLUS=11, EQUAL=12, MINUS=13, MULT=14, DIV=15, LPAREN=16, RPAREN=17, 
		LBRACKET=18, RBRACKET=19, LFIGURE=20, RFIGURE=21, MODULE=22;
	public static final int
		RULE_pi = 0, RULE_scientific = 1, RULE_variable = 2, RULE_array = 3, RULE_matrix = 4, 
		RULE_atom = 5, RULE_signedAtom = 6, RULE_factor = 7, RULE_expression = 8, 
		RULE_assign = 9, RULE_print = 10, RULE_init = 11;
	public static final String[] ruleNames = {
		"pi", "scientific", "variable", "array", "matrix", "atom", "signedAtom", 
		"factor", "expression", "assign", "print", "init"
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
	public static class PiContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(MathLangParser.PI, 0); }
		public PiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitPi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PiContext pi() throws RecognitionException {
		PiContext _localctx = new PiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(PI);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitScientific(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScientificContext scientific() throws RecognitionException {
		ScientificContext _localctx = new ScientificContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scientific);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
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
		public TerminalNode VAR() { return getToken(MathLangParser.VAR, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(VAR);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RFIGURE() { return getToken(MathLangParser.RFIGURE, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array);
		int _la;
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(LFIGURE);
				setState(31);
				expression(0);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(32);
					match(T__0);
					setState(33);
					expression(0);
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(39);
				match(RFIGURE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(LFIGURE);
				setState(42);
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
		public TerminalNode LBRACKET() { return getToken(MathLangParser.LBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(MathLangParser.RBRACKET, 0); }
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matrix);
		int _la;
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(LBRACKET);
				setState(46);
				expression(0);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(47);
					match(T__0);
					setState(48);
					expression(0);
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(LBRACKET);
				setState(57);
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
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				scientific();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				variable();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(LPAREN);
				setState(63);
				expression(0);
				setState(64);
				match(RPAREN);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				matrix();
				}
				break;
			case LFIGURE:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				array();
				}
				break;
			case PI:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				pi();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitPlainAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvertSignedAtomContext extends SignedAtomContext {
		public TerminalNode MINUS() { return getToken(MathLangParser.MINUS, 0); }
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public InvertSignedAtomContext(SignedAtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitInvertSignedAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedAtomContext signedAtom() throws RecognitionException {
		SignedAtomContext _localctx = new SignedAtomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_signedAtom);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new PlainAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(PLUS);
				setState(72);
				signedAtom();
				}
				break;
			case MINUS:
				_localctx = new InvertSignedAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(MINUS);
				setState(74);
				signedAtom();
				}
				break;
			case SCIENTIFIC_NUMBER:
			case PI:
			case VAR:
			case LPAREN:
			case LBRACKET:
			case LFIGURE:
				_localctx = new PlainAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			signedAtom();
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(79);
				match(POW);
				setState(80);
				signedAtom();
				}
				break;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitSubtractExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlainFactorContext extends ExpressionContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PlainFactorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitPlainFactor(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitSumExpression(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeterminantExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeterminantExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitDeterminantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(MathLangParser.MULT, 0); }
		public MultExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitMultExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				_localctx = new DeterminantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(84);
				match(T__1);
				setState(85);
				expression(0);
				setState(86);
				match(RPAREN);
				}
				break;
			case SCIENTIFIC_NUMBER:
			case PI:
			case VAR:
			case PLUS:
			case MINUS:
			case LPAREN:
			case LBRACKET:
			case LFIGURE:
				{
				_localctx = new PlainFactorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new SumExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(92);
						match(PLUS);
						setState(93);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new SubtractExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(95);
						match(MINUS);
						setState(96);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new DivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(97);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(98);
						match(DIV);
						setState(99);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(100);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(101);
						match(MULT);
						setState(102);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MathLangParser.VAR, 0); }
		public TerminalNode EQUAL() { return getToken(MathLangParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(VAR);
			setState(109);
			match(EQUAL);
			setState(110);
			expression(0);
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

	public static class PrintContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(MathLangParser.END, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				expression(0);
				setState(113);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				assign();
				setState(116);
				match(END);
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

	public static class InitContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			print();
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
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5%\n\5\f\5\16"+
		"\5(\13\5\3\5\3\5\3\5\3\5\5\5.\n\5\3\6\3\6\3\6\3\6\7\6\64\n\6\f\6\16\6"+
		"\67\13\6\3\6\3\6\3\6\3\6\5\6=\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7H\n\7\3\b\3\b\3\b\3\b\3\b\5\bO\n\b\3\t\3\t\3\t\5\tT\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\\\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\nj\n\n\f\n\16\nm\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\fy\n\f\3\r\3\r\3\r\2\3\22\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u0082"+
		"\2\32\3\2\2\2\4\34\3\2\2\2\6\36\3\2\2\2\b-\3\2\2\2\n<\3\2\2\2\fG\3\2\2"+
		"\2\16N\3\2\2\2\20P\3\2\2\2\22[\3\2\2\2\24n\3\2\2\2\26x\3\2\2\2\30z\3\2"+
		"\2\2\32\33\7\7\2\2\33\3\3\2\2\2\34\35\7\6\2\2\35\5\3\2\2\2\36\37\7\n\2"+
		"\2\37\7\3\2\2\2 !\7\26\2\2!&\5\22\n\2\"#\7\3\2\2#%\5\22\n\2$\"\3\2\2\2"+
		"%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)*\7\27\2\2*.\3\2"+
		"\2\2+,\7\26\2\2,.\7\27\2\2- \3\2\2\2-+\3\2\2\2.\t\3\2\2\2/\60\7\24\2\2"+
		"\60\65\5\22\n\2\61\62\7\3\2\2\62\64\5\22\n\2\63\61\3\2\2\2\64\67\3\2\2"+
		"\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\25\2\29="+
		"\3\2\2\2:;\7\24\2\2;=\7\25\2\2</\3\2\2\2<:\3\2\2\2=\13\3\2\2\2>H\5\4\3"+
		"\2?H\5\6\4\2@A\7\22\2\2AB\5\22\n\2BC\7\23\2\2CH\3\2\2\2DH\5\n\6\2EH\5"+
		"\b\5\2FH\5\2\2\2G>\3\2\2\2G?\3\2\2\2G@\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3"+
		"\2\2\2H\r\3\2\2\2IJ\7\r\2\2JO\5\16\b\2KL\7\17\2\2LO\5\16\b\2MO\5\f\7\2"+
		"NI\3\2\2\2NK\3\2\2\2NM\3\2\2\2O\17\3\2\2\2PS\5\16\b\2QR\7\f\2\2RT\5\16"+
		"\b\2SQ\3\2\2\2ST\3\2\2\2T\21\3\2\2\2UV\b\n\1\2VW\7\4\2\2WX\5\22\n\2XY"+
		"\7\23\2\2Y\\\3\2\2\2Z\\\5\20\t\2[U\3\2\2\2[Z\3\2\2\2\\k\3\2\2\2]^\f\b"+
		"\2\2^_\7\r\2\2_j\5\22\n\t`a\f\7\2\2ab\7\17\2\2bj\5\22\n\bcd\f\6\2\2de"+
		"\7\21\2\2ej\5\22\n\7fg\f\5\2\2gh\7\20\2\2hj\5\22\n\6i]\3\2\2\2i`\3\2\2"+
		"\2ic\3\2\2\2if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\23\3\2\2\2mk\3\2"+
		"\2\2no\7\n\2\2op\7\16\2\2pq\5\22\n\2q\25\3\2\2\2rs\5\22\n\2st\7\5\2\2"+
		"ty\3\2\2\2uv\5\24\13\2vw\7\5\2\2wy\3\2\2\2xr\3\2\2\2xu\3\2\2\2y\27\3\2"+
		"\2\2z{\5\26\f\2{\31\3\2\2\2\r&-\65<GNS[ikx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}