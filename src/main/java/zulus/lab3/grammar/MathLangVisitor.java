// Generated from /home/zulus/projects/basis-of-program-technology/src/main/antlr4/MathLang.g4 by ANTLR 4.7

    package zulus.lab3.grammar;

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
	 * Visit a parse tree produced by {@link MathLangParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(MathLangParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathLangParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MathLangParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathLangParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(MathLangParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathLangParser#matrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix(MathLangParser.MatrixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathLangParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(MathLangParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlainAtom}
	 * labeled alternative in {@link MathLangParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainAtom(MathLangParser.PlainAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvertSignedAtom}
	 * labeled alternative in {@link MathLangParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvertSignedAtom(MathLangParser.InvertSignedAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MathLangParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubtractExpression}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractExpression(MathLangParser.SubtractExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModuleExpression}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleExpression(MathLangParser.ModuleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulTExpression}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulTExpression(MathLangParser.MulTExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlainFactor}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainFactor(MathLangParser.PlainFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumExpression}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpression(MathLangParser.SumExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivExpression}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(MathLangParser.DivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeterminantExpression}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeterminantExpression(MathLangParser.DeterminantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathLangParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MathLangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathLangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MathLangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathLangParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(MathLangParser.InitContext ctx);
}