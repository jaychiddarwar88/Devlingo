package gen;
// Generated from /Users/manmeet_singh/Desktop/SER502/SER502-Spring2023-Team20/src/main/antlr/DevLingo.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DevLingoParser}.
 */
public interface DevLingoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DevLingoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DevLingoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DevLingoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DevLingoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DevLingoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DevLingoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intAssignment}
	 * labeled alternative in {@link DevLingoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntAssignment(DevLingoParser.IntAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intAssignment}
	 * labeled alternative in {@link DevLingoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntAssignment(DevLingoParser.IntAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolAssignment}
	 * labeled alternative in {@link DevLingoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolAssignment(DevLingoParser.BoolAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolAssignment}
	 * labeled alternative in {@link DevLingoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolAssignment(DevLingoParser.BoolAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAssignment}
	 * labeled alternative in {@link DevLingoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringAssignment(DevLingoParser.StringAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAssignment}
	 * labeled alternative in {@link DevLingoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringAssignment(DevLingoParser.StringAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DevLingoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DevLingoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpressionInBrackets}
	 * labeled alternative in {@link DevLingoParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpressionInBrackets(DevLingoParser.BoolExpressionInBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpressionInBrackets}
	 * labeled alternative in {@link DevLingoParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpressionInBrackets(DevLingoParser.BoolExpressionInBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolIDENOnlyExpression}
	 * labeled alternative in {@link DevLingoParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolIDENOnlyExpression(DevLingoParser.BoolIDENOnlyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolIDENOnlyExpression}
	 * labeled alternative in {@link DevLingoParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolIDENOnlyExpression(DevLingoParser.BoolIDENOnlyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolLogExpression}
	 * labeled alternative in {@link DevLingoParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolLogExpression(DevLingoParser.BoolLogExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolLogExpression}
	 * labeled alternative in {@link DevLingoParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolLogExpression(DevLingoParser.BoolLogExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolCompExpression}
	 * labeled alternative in {@link DevLingoParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolCompExpression(DevLingoParser.BoolCompExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolCompExpression}
	 * labeled alternative in {@link DevLingoParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolCompExpression(DevLingoParser.BoolCompExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveBoolValuesOnly}
	 * labeled alternative in {@link DevLingoParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveBoolValuesOnly(DevLingoParser.PrimitiveBoolValuesOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveBoolValuesOnly}
	 * labeled alternative in {@link DevLingoParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveBoolValuesOnly(DevLingoParser.PrimitiveBoolValuesOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numbCompExpression}
	 * labeled alternative in {@link DevLingoParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumbCompExpression(DevLingoParser.NumbCompExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numbCompExpression}
	 * labeled alternative in {@link DevLingoParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumbCompExpression(DevLingoParser.NumbCompExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberMultDivExpression}
	 * labeled alternative in {@link DevLingoParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumberMultDivExpression(DevLingoParser.NumberMultDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberMultDivExpression}
	 * labeled alternative in {@link DevLingoParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumberMultDivExpression(DevLingoParser.NumberMultDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberIDENOnly}
	 * labeled alternative in {@link DevLingoParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumberIDENOnly(DevLingoParser.NumberIDENOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberIDENOnly}
	 * labeled alternative in {@link DevLingoParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumberIDENOnly(DevLingoParser.NumberIDENOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberADDITIONALSUBTRACTExpression}
	 * labeled alternative in {@link DevLingoParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumberADDITIONALSUBTRACTExpression(DevLingoParser.NumberADDITIONALSUBTRACTExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberADDITIONALSUBTRACTExpression}
	 * labeled alternative in {@link DevLingoParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumberADDITIONALSUBTRACTExpression(DevLingoParser.NumberADDITIONALSUBTRACTExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberOnly}
	 * labeled alternative in {@link DevLingoParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumberOnly(DevLingoParser.NumberOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberOnly}
	 * labeled alternative in {@link DevLingoParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumberOnly(DevLingoParser.NumberOnlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numbBrackExpression}
	 * labeled alternative in {@link DevLingoParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumbBrackExpression(DevLingoParser.NumbBrackExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numbBrackExpression}
	 * labeled alternative in {@link DevLingoParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumbBrackExpression(DevLingoParser.NumbBrackExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(DevLingoParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(DevLingoParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(DevLingoParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(DevLingoParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#else_ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterElse_ifBlock(DevLingoParser.Else_ifBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#else_ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitElse_ifBlock(DevLingoParser.Else_ifBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#else_expr}.
	 * @param ctx the parse tree
	 */
	void enterElse_expr(DevLingoParser.Else_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#else_expr}.
	 * @param ctx the parse tree
	 */
	void exitElse_expr(DevLingoParser.Else_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(DevLingoParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(DevLingoParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#rangedForLoop}.
	 * @param ctx the parse tree
	 */
	void enterRangedForLoop(DevLingoParser.RangedForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#rangedForLoop}.
	 * @param ctx the parse tree
	 */
	void exitRangedForLoop(DevLingoParser.RangedForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#rangeVal}.
	 * @param ctx the parse tree
	 */
	void enterRangeVal(DevLingoParser.RangeValContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#rangeVal}.
	 * @param ctx the parse tree
	 */
	void exitRangeVal(DevLingoParser.RangeValContext ctx);
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(DevLingoParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(DevLingoParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#variable_change_part}.
	 * @param ctx the parse tree
	 */
	void enterVariable_change_part(DevLingoParser.Variable_change_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#variable_change_part}.
	 * @param ctx the parse tree
	 */
	void exitVariable_change_part(DevLingoParser.Variable_change_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#decrement_expression}.
	 * @param ctx the parse tree
	 */
	void enterDecrement_expression(DevLingoParser.Decrement_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#decrement_expression}.
	 * @param ctx the parse tree
	 */
	void exitDecrement_expression(DevLingoParser.Decrement_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#increment_expression}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_expression(DevLingoParser.Increment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#increment_expression}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_expression(DevLingoParser.Increment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(DevLingoParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(DevLingoParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DevLingoParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(DevLingoParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DevLingoParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(DevLingoParser.PrintStatementContext ctx);
}