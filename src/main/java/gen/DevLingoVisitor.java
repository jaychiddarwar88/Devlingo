package gen;
// Generated from /Users/manmeet_singh/Desktop/SER502/SER502-Spring2023-Team20/src/main/antlr/DevLingo.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DevLingoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DevLingoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DevLingoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DevLingoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DevLingoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAssignment}
	 * labeled alternative in {@link DevLingoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAssignment(DevLingoParser.IntAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolAssignment}
	 * labeled alternative in {@link DevLingoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAssignment(DevLingoParser.BoolAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAssignment}
	 * labeled alternative in {@link DevLingoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAssignment(DevLingoParser.StringAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DevLingoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpressionInBrackets}
	 * labeled alternative in {@link DevLingoParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpressionInBrackets(DevLingoParser.BoolExpressionInBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolIDENOnlyExpression}
	 * labeled alternative in {@link DevLingoParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolIDENOnlyExpression(DevLingoParser.BoolIDENOnlyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolLogExpression}
	 * labeled alternative in {@link DevLingoParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLogExpression(DevLingoParser.BoolLogExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolCompExpression}
	 * labeled alternative in {@link DevLingoParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCompExpression(DevLingoParser.BoolCompExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveBoolValuesOnly}
	 * labeled alternative in {@link DevLingoParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveBoolValuesOnly(DevLingoParser.PrimitiveBoolValuesOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numbCompExpression}
	 * labeled alternative in {@link DevLingoParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumbCompExpression(DevLingoParser.NumbCompExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberMultDivExpression}
	 * labeled alternative in {@link DevLingoParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberMultDivExpression(DevLingoParser.NumberMultDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberIDENOnly}
	 * labeled alternative in {@link DevLingoParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberIDENOnly(DevLingoParser.NumberIDENOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberADDITIONALSUBTRACTExpression}
	 * labeled alternative in {@link DevLingoParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberADDITIONALSUBTRACTExpression(DevLingoParser.NumberADDITIONALSUBTRACTExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberOnly}
	 * labeled alternative in {@link DevLingoParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberOnly(DevLingoParser.NumberOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numbBrackExpression}
	 * labeled alternative in {@link DevLingoParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumbBrackExpression(DevLingoParser.NumbBrackExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(DevLingoParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(DevLingoParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#else_ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_ifBlock(DevLingoParser.Else_ifBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#else_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_expr(DevLingoParser.Else_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(DevLingoParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#rangedForLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangedForLoop(DevLingoParser.RangedForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#rangeVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeVal(DevLingoParser.RangeValContext ctx);
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(DevLingoParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#variable_change_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_change_part(DevLingoParser.Variable_change_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#decrement_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement_expression(DevLingoParser.Decrement_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#increment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement_expression(DevLingoParser.Increment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#ternaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(DevLingoParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DevLingoParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(DevLingoParser.PrintStatementContext ctx);
}