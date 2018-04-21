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
		T__0=1, T__1=2, SCIENTIFIC_NUMBER=3, PI=4, E=5, WS=6, VAR=7, NEWLINE=8, 
		POW=9, SIGN=10, PLUS=11, EQUAL=12, MINUS=13, MULT=14, DIV=15, LPAREN=16, 
		RPAREN=17, LBRACKET=18, RBRACKET=19, LFIGURE=20, RFIGURE=21, MODULE=22;
	public static final int
		RULE_scientific = 0, RULE_variable = 1, RULE_array = 2, RULE_matrix = 3, 
		RULE_atom = 4, RULE_signedAtom = 5, RULE_factor = 6, RULE_expression = 7, 
		RULE_assign = 8, RULE_print = 9, RULE_init = 10;
	public static final String[] ruleNames = {
		"scientific", "variable", "array", "matrix", "atom", "signedAtom", "factor", 
		"expression", "assign", "print", "init"
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
		enterRule(_localctx, 0, RULE_scientific);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
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
		enterRule(_localctx, 2, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
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
		public TerminalNode RFIGURE() { return getToken(MathLangParser.RFIGURE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		enterRule(_localctx, 4, RULE_array);
		int _la;
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(LFIGURE);
				setState(27);
				match(RFIGURE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(LFIGURE);
				setState(29);
				expression(0);
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(30);
					match(T__0);
					setState(31);
					expression(0);
					}
				}

				setState(34);
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
		public TerminalNode RBRACKET() { return getToken(MathLangParser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		enterRule(_localctx, 6, RULE_matrix);
		int _la;
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(LBRACKET);
				setState(39);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(LBRACKET);
				setState(41);
				expression(0);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(42);
					match(T__0);
					setState(43);
					expression(0);
					}
				}

				setState(46);
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
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				scientific();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				variable();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(LPAREN);
				setState(53);
				expression(0);
				setState(54);
				match(RPAREN);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				matrix();
				}
				break;
			case LFIGURE:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
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
		enterRule(_localctx, 10, RULE_signedAtom);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new PlainAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(PLUS);
				setState(61);
				signedAtom();
				}
				break;
			case MINUS:
				_localctx = new InvertSignedAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(MINUS);
				setState(63);
				signedAtom();
				}
				break;
			case SCIENTIFIC_NUMBER:
			case VAR:
			case LPAREN:
			case LBRACKET:
			case LFIGURE:
				_localctx = new PlainAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
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
		enterRule(_localctx, 12, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			signedAtom();
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(68);
				match(POW);
				setState(69);
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
	public static class ModuleExpressionContext extends ExpressionContext {
		public List<TerminalNode> MODULE() { return getTokens(MathLangParser.MODULE); }
		public TerminalNode MODULE(int i) {
			return getToken(MathLangParser.MODULE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ModuleExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitModuleExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulTExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(MathLangParser.MULT, 0); }
		public MulTExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitMulTExpression(this);
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

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODULE:
				{
				_localctx = new ModuleExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(73);
				match(MODULE);
				setState(74);
				expression(0);
				setState(75);
				match(MODULE);
				}
				break;
			case T__1:
				{
				_localctx = new DeterminantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(T__1);
				setState(78);
				expression(0);
				setState(79);
				match(RPAREN);
				}
				break;
			case SCIENTIFIC_NUMBER:
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
				setState(81);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new SumExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(84);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(85);
						match(PLUS);
						setState(86);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new SubtractExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(87);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(88);
						match(MINUS);
						setState(89);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new DivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(91);
						match(DIV);
						setState(92);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new MulTExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(94);
						match(MULT);
						setState(95);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(100);
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
		enterRule(_localctx, 16, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(VAR);
			setState(102);
			match(EQUAL);
			setState(103);
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
		public TerminalNode NEWLINE() { return getToken(MathLangParser.NEWLINE, 0); }
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
		enterRule(_localctx, 18, RULE_print);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				expression(0);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(106);
					match(NEWLINE);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				assign();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(110);
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
		enterRule(_localctx, 20, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30x\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4#\n\4\3\4\3\4\5\4\'"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5/\n\5\3\5\3\5\5\5\63\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6=\n\6\3\7\3\7\3\7\3\7\3\7\5\7D\n\7\3\b\3\b\3\b\5"+
		"\bI\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tU\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tc\n\t\f\t\16\tf\13\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\5\13n\n\13\3\13\3\13\5\13r\n\13\5\13t\n\13\3\f\3\f\3\f"+
		"\2\3\20\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u0080\2\30\3\2\2\2\4\32\3\2"+
		"\2\2\6&\3\2\2\2\b\62\3\2\2\2\n<\3\2\2\2\fC\3\2\2\2\16E\3\2\2\2\20T\3\2"+
		"\2\2\22g\3\2\2\2\24s\3\2\2\2\26u\3\2\2\2\30\31\7\5\2\2\31\3\3\2\2\2\32"+
		"\33\7\t\2\2\33\5\3\2\2\2\34\35\7\26\2\2\35\'\7\27\2\2\36\37\7\26\2\2\37"+
		"\"\5\20\t\2 !\7\3\2\2!#\5\20\t\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\27"+
		"\2\2%\'\3\2\2\2&\34\3\2\2\2&\36\3\2\2\2\'\7\3\2\2\2()\7\24\2\2)\63\7\25"+
		"\2\2*+\7\24\2\2+.\5\20\t\2,-\7\3\2\2-/\5\20\t\2.,\3\2\2\2./\3\2\2\2/\60"+
		"\3\2\2\2\60\61\7\25\2\2\61\63\3\2\2\2\62(\3\2\2\2\62*\3\2\2\2\63\t\3\2"+
		"\2\2\64=\5\2\2\2\65=\5\4\3\2\66\67\7\22\2\2\678\5\20\t\289\7\23\2\29="+
		"\3\2\2\2:=\5\b\5\2;=\5\6\4\2<\64\3\2\2\2<\65\3\2\2\2<\66\3\2\2\2<:\3\2"+
		"\2\2<;\3\2\2\2=\13\3\2\2\2>?\7\r\2\2?D\5\f\7\2@A\7\17\2\2AD\5\f\7\2BD"+
		"\5\n\6\2C>\3\2\2\2C@\3\2\2\2CB\3\2\2\2D\r\3\2\2\2EH\5\f\7\2FG\7\13\2\2"+
		"GI\5\f\7\2HF\3\2\2\2HI\3\2\2\2I\17\3\2\2\2JK\b\t\1\2KL\7\30\2\2LM\5\20"+
		"\t\2MN\7\30\2\2NU\3\2\2\2OP\7\4\2\2PQ\5\20\t\2QR\7\23\2\2RU\3\2\2\2SU"+
		"\5\16\b\2TJ\3\2\2\2TO\3\2\2\2TS\3\2\2\2Ud\3\2\2\2VW\f\t\2\2WX\7\r\2\2"+
		"Xc\5\20\t\nYZ\f\b\2\2Z[\7\17\2\2[c\5\20\t\t\\]\f\7\2\2]^\7\21\2\2^c\5"+
		"\20\t\b_`\f\6\2\2`a\7\20\2\2ac\5\20\t\7bV\3\2\2\2bY\3\2\2\2b\\\3\2\2\2"+
		"b_\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\21\3\2\2\2fd\3\2\2\2gh\7\t\2"+
		"\2hi\7\16\2\2ij\5\20\t\2j\23\3\2\2\2km\5\20\t\2ln\7\n\2\2ml\3\2\2\2mn"+
		"\3\2\2\2nt\3\2\2\2oq\5\22\n\2pr\7\n\2\2qp\3\2\2\2qr\3\2\2\2rt\3\2\2\2"+
		"sk\3\2\2\2so\3\2\2\2t\25\3\2\2\2uv\5\24\13\2v\27\3\2\2\2\17\"&.\62<CH"+
		"Tbdmqs";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}