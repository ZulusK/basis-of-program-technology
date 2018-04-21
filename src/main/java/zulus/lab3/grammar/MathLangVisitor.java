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
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MathLangParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MathLangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link MathLangParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MathLangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionSubtract}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSubtract(MathLangParser.ExpressionSubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionDiv}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDiv(MathLangParser.ExpressionDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionMul}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMul(MathLangParser.ExpressionMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlainSignedAtom}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainSignedAtom(MathLangParser.PlainSignedAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionPlus}
	 * labeled alternative in {@link MathLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPlus(MathLangParser.ExpressionPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlainValue}
	 * labeled alternative in {@link MathLangParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainValue(MathLangParser.PlainValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvertSign}
	 * labeled alternative in {@link MathLangParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvertSign(MathLangParser.InvertSignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathLangParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(MathLangParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathLangParser#matrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix(MathLangParser.MatrixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathLangParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(MathLangParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MathLangParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(MathLangParser.ScientificContext ctx);
}