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
		T__0=1, SCIENTIFIC_NUMBER=2, PI=3, E=4, WS=5, VAR=6, NEWLINE=7, POW=8, 
		SIGN=9, PLUS=10, EQUAL=11, MINUS=12, MULT=13, DIV=14, LPAREN=15, RPAREN=16, 
		LBRACKET=17, RBRACKET=18, LFIGURE=19, RFIGURE=20;
	public static final int
		RULE_scientific = 0, RULE_variable = 1, RULE_matrix = 2, RULE_atom = 3, 
		RULE_signedAtom = 4, RULE_factor = 5, RULE_expression = 6, RULE_assign = 7, 
		RULE_print = 8, RULE_init = 9;
	public static final String[] ruleNames = {
		"scientific", "variable", "matrix", "atom", "signedAtom", "factor", "expression", 
		"assign", "print", "init"
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
			setState(20);
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
			setState(22);
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
		enterRule(_localctx, 4, RULE_matrix);
		int _la;
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(LBRACKET);
				setState(25);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(LBRACKET);
				setState(27);
				expression(0);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(28);
					match(T__0);
					setState(29);
					expression(0);
					}
				}

				setState(32);
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
		enterRule(_localctx, 6, RULE_atom);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCIENTIFIC_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				scientific();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				variable();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(LPAREN);
				setState(39);
				expression(0);
				setState(40);
				match(RPAREN);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				matrix();
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
	public static class PlainAtomContext extends SignedAtomContext {
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
	public static class PlainSignedAtomContext extends SignedAtomContext {
		public TerminalNode PLUS() { return getToken(MathLangParser.PLUS, 0); }
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public PlainSignedAtomContext(SignedAtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MathLangVisitor ) return ((MathLangVisitor<? extends T>)visitor).visitPlainSignedAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedAtomContext signedAtom() throws RecognitionException {
		SignedAtomContext _localctx = new SignedAtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_signedAtom);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new PlainSignedAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(PLUS);
				setState(46);
				signedAtom();
				}
				break;
			case MINUS:
				_localctx = new InvertSignedAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(MINUS);
				setState(48);
				signedAtom();
				}
				break;
			case SCIENTIFIC_NUMBER:
			case VAR:
			case LPAREN:
			case LBRACKET:
				_localctx = new PlainAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
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
		enterRule(_localctx, 10, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			signedAtom();
			setState(53);
			match(POW);
			setState(54);
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

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PlainFactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(57);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new SumExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(59);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(60);
						match(PLUS);
						setState(61);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new SubtractExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(63);
						match(MINUS);
						setState(64);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new DivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(66);
						match(DIV);
						setState(67);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new MulTExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(69);
						match(MULT);
						setState(70);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 14, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(VAR);
			setState(77);
			match(EQUAL);
			setState(78);
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
		enterRule(_localctx, 16, RULE_print);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				expression(0);
				setState(81);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				assign();
				setState(84);
				match(NEWLINE);
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
		enterRule(_localctx, 18, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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
		case 6:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4!\n\4\3\4\3\4\5\4%\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5.\n\5\3\6\3\6\3\6\3\6\3\6\5\6\65\n\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\bJ\n\b\f\b\16\bM\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nY\n"+
		"\n\3\13\3\13\3\13\2\3\16\f\2\4\6\b\n\f\16\20\22\24\2\2\2^\2\26\3\2\2\2"+
		"\4\30\3\2\2\2\6$\3\2\2\2\b-\3\2\2\2\n\64\3\2\2\2\f\66\3\2\2\2\16:\3\2"+
		"\2\2\20N\3\2\2\2\22X\3\2\2\2\24Z\3\2\2\2\26\27\7\4\2\2\27\3\3\2\2\2\30"+
		"\31\7\b\2\2\31\5\3\2\2\2\32\33\7\23\2\2\33%\7\24\2\2\34\35\7\23\2\2\35"+
		" \5\16\b\2\36\37\7\3\2\2\37!\5\16\b\2 \36\3\2\2\2 !\3\2\2\2!\"\3\2\2\2"+
		"\"#\7\24\2\2#%\3\2\2\2$\32\3\2\2\2$\34\3\2\2\2%\7\3\2\2\2&.\5\2\2\2\'"+
		".\5\4\3\2()\7\21\2\2)*\5\16\b\2*+\7\22\2\2+.\3\2\2\2,.\5\6\4\2-&\3\2\2"+
		"\2-\'\3\2\2\2-(\3\2\2\2-,\3\2\2\2.\t\3\2\2\2/\60\7\f\2\2\60\65\5\n\6\2"+
		"\61\62\7\16\2\2\62\65\5\n\6\2\63\65\5\b\5\2\64/\3\2\2\2\64\61\3\2\2\2"+
		"\64\63\3\2\2\2\65\13\3\2\2\2\66\67\5\n\6\2\678\7\n\2\289\5\n\6\29\r\3"+
		"\2\2\2:;\b\b\1\2;<\5\f\7\2<K\3\2\2\2=>\f\7\2\2>?\7\f\2\2?J\5\16\b\b@A"+
		"\f\6\2\2AB\7\16\2\2BJ\5\16\b\7CD\f\5\2\2DE\7\20\2\2EJ\5\16\b\6FG\f\4\2"+
		"\2GH\7\17\2\2HJ\5\16\b\5I=\3\2\2\2I@\3\2\2\2IC\3\2\2\2IF\3\2\2\2JM\3\2"+
		"\2\2KI\3\2\2\2KL\3\2\2\2L\17\3\2\2\2MK\3\2\2\2NO\7\b\2\2OP\7\r\2\2PQ\5"+
		"\16\b\2Q\21\3\2\2\2RS\5\16\b\2ST\7\t\2\2TY\3\2\2\2UV\5\20\t\2VW\7\t\2"+
		"\2WY\3\2\2\2XR\3\2\2\2XU\3\2\2\2Y\23\3\2\2\2Z[\5\22\n\2[\25\3\2\2\2\t"+
		" $-\64IKX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}