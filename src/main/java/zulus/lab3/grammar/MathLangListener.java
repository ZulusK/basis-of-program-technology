// Generated from MathLang.g4 by ANTLR 4.3

    package zulus.lab3.grammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MathLangParser}.
 */
public interface MathLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ExpressionMul}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMul(@NotNull MathLangParser.ExpressionMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionMul}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMul(@NotNull MathLangParser.ExpressionMulContext ctx);

	/**
	 * Enter a parse tree produced by {@link MathLangParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(@NotNull MathLangParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathLangParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(@NotNull MathLangParser.ScientificContext ctx);

	/**
	 * Enter a parse tree produced by {@link MathLangParser#matrix}.
	 * @param ctx the parse tree
	 */
	void enterMatrix(@NotNull MathLangParser.MatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathLangParser#matrix}.
	 * @param ctx the parse tree
	 */
	void exitMatrix(@NotNull MathLangParser.MatrixContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ExpressionSubtract}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSubtract(@NotNull MathLangParser.ExpressionSubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionSubtract}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSubtract(@NotNull MathLangParser.ExpressionSubtractContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ExpressionDiv}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDiv(@NotNull MathLangParser.ExpressionDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionDiv}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDiv(@NotNull MathLangParser.ExpressionDivContext ctx);

	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link MathLangParser#init}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull MathLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link MathLangParser#init}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull MathLangParser.PrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MathLangParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull MathLangParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathLangParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull MathLangParser.ArrayContext ctx);

	/**
	 * Enter a parse tree produced by the {@code PlainValue}
	 * labeled alternative in {@link MathLangParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterPlainValue(@NotNull MathLangParser.PlainValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlainValue}
	 * labeled alternative in {@link MathLangParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitPlainValue(@NotNull MathLangParser.PlainValueContext ctx);

	/**
	 * Enter a parse tree produced by the {@code InvertSign}
	 * labeled alternative in {@link MathLangParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterInvertSign(@NotNull MathLangParser.InvertSignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvertSign}
	 * labeled alternative in {@link MathLangParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitInvertSign(@NotNull MathLangParser.InvertSignContext ctx);

	/**
	 * Enter a parse tree produced by the {@code PlainSignedAtom}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlainSignedAtom(@NotNull MathLangParser.PlainSignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlainSignedAtom}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlainSignedAtom(@NotNull MathLangParser.PlainSignedAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link MathLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull MathLangParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull MathLangParser.AtomContext ctx);

	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MathLangParser#init}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull MathLangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MathLangParser#init}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull MathLangParser.AssignContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ExpressionPlus}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPlus(@NotNull MathLangParser.ExpressionPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionPlus}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPlus(@NotNull MathLangParser.ExpressionPlusContext ctx);
}