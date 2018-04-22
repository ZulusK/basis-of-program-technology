// Generated from MathLang.g4 by ANTLR 4.3

    package zulus.lab3.grammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MathLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MathLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MathLangParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull MathLangParser.InitContext ctx);

	/**
	 * Visit a parse tree produced by the {@code PlainAtom}
	 * labeled alternative in {@link MathLangParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainAtom(@NotNull MathLangParser.PlainAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link MathLangParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(@NotNull MathLangParser.ScientificContext ctx);

	/**
	 * Visit a parse tree produced by the {@code InvertSignedAtom}
	 * labeled alternative in {@link MathLangParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvertSignedAtom(@NotNull MathLangParser.InvertSignedAtomContext ctx);

	/**
	 * Visit a parse tree produced by the {@code DivExpression}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(@NotNull MathLangParser.DivExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MathLangParser#matrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix(@NotNull MathLangParser.MatrixContext ctx);

	/**
	 * Visit a parse tree produced by the {@code SubtractExpression}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractExpression(@NotNull MathLangParser.SubtractExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MathLangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull MathLangParser.PrintContext ctx);

	/**
	 * Visit a parse tree produced by {@link MathLangParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull MathLangParser.ArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link MathLangParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull MathLangParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by the {@code PlainFactor}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainFactor(@NotNull MathLangParser.PlainFactorContext ctx);

	/**
	 * Visit a parse tree produced by the {@code SumExpression}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpression(@NotNull MathLangParser.SumExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MathLangParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull MathLangParser.AtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link MathLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(@NotNull MathLangParser.FactorContext ctx);

	/**
	 * Visit a parse tree produced by the {@code DeterminantExpression}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeterminantExpression(@NotNull MathLangParser.DeterminantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code MultExpression}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(@NotNull MathLangParser.MultExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MathLangParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull MathLangParser.AssignContext ctx);
}