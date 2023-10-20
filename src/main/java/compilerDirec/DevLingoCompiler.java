/*
* Author : Jay Sachin Chiddarwar, Manmeet Singh
*/

package compilerDirec;

import gen.DevLingoBaseVisitor;
import gen.DevLingoParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import runtimeUtility.GenUseConst;

import java.util.ArrayList;

public class DevLingoCompiler extends DevLingoBaseVisitor<Object> {

    private ArrayList<String> varStoreObj;
    private AsmGenCode asmCode;

    public DevLingoCompiler(){
        varStoreObj = new ArrayList<>();
        asmCode = new AsmGenCode();

    }
    public DevLingoCompiler(ArrayList<String> varStoreObj) {
        this.varStoreObj = varStoreObj;
    }

    public String getOutput() {
        return asmCode.getAsmGenCode();
    }

    public void addVariableToList(String namedVariable) {
        varStoreObj.add(namedVariable);
    }

    public boolean doesVariableExist(String namedVariable) {
        return varStoreObj.contains(namedVariable);
    }

    public void missingVariableError(String identifier) {
        System.out.println("Compilation Error: Variable not found ->" + identifier );
        System.exit(1);
    }



    @Override
    public Object visitPrintStatement(DevLingoParser.PrintStatementContext arg) {
        String wrtInst = GenUseConst.PRINT_IO_INST + " ";


        if (arg.STRING() != null) {
            if (arg.getText().contains(",") && arg.IDEN() != null) {
                visit(arg.STRING(0));
                asmCode.addAsmGenCode(wrtInst + arg.STRING(0).getText());
            } else if (arg.STRING(0) != null) {
                asmCode.addAsmGenCode(wrtInst + arg.STRING(0).getText());
            }
        }

        if (arg.IDEN() != null) {
            if (doesVariableExist(arg.IDEN().getText())) {
                asmCode.addAsmGenCode(wrtInst + arg.IDEN().getText());
            } else {
                missingVariableError(arg.IDEN().getText());
            }
        } else if (arg.DIGITS() != null) {
            asmCode.addAsmGenCode(wrtInst + arg.DIGITS().getText());
        } else if (arg.BOOLEAN() != null) {
            asmCode.addAsmGenCode(wrtInst + arg.BOOLEAN().getText());
        } else if (arg.mathematicalExpression() != null) {
            visit(arg.mathematicalExpression());
            asmCode.addAsmGenCode(wrtInst + GenUseConst.REG_ACCUM1);
        } else if (arg.logicalExpression() != null) {
            visit(arg.logicalExpression());
            asmCode.addAsmGenCode(wrtInst + GenUseConst.REG_ACCUM1);
        }

        return null;
    }

    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Object visitNumberOnly(DevLingoParser.NumberOnlyContext arg) {

        if (arg.DIGITS() != null && arg.DIGITS().getText() != null) {
            String value = arg.DIGITS().getText();
            int intVal = Integer.parseInt(value);
            if (arg.SUBTRACT() != null) {
                intVal *= -1;
            }
            String visTemp =
                    GenUseConst.LOAD_IO_INST + " " + GenUseConst.REG_ACCUM1 + " " + intVal;
            asmCode.addAsmGenCode(visTemp);
        }

        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Object defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public ArrayList<String> getVarStoreObj() {
        return varStoreObj;
    }

    public void setVarStoreObj(ArrayList<String> varStoreObj) {
        this.varStoreObj = varStoreObj;
    }

    @Override
    public Object visitProgram(DevLingoParser.ProgramContext arg) {
        return super.visitChildren(arg);
    }

    @Override
    public Object visitStatement(DevLingoParser.StatementContext arg) {
        return super.visitChildren(arg);
    }

    @Override
    public Object visitBlock(DevLingoParser.BlockContext arg) {
        return super.visitChildren(arg);
    }



    @Override
    public Object visitBoolAssignment(DevLingoParser.BoolAssignmentContext arg) {
        String idenText = arg.IDEN().getText();

        if (arg.getText().contains("boolean")) {
            addVariableToList(idenText);
        } else if (!doesVariableExist(idenText)) {
            missingVariableError(idenText);
        }

        if (arg.EQUALS() != null) {
            if (arg.getText().contains("?") ) {
                if (arg.getText().contains(":")) {
                    visit(arg.ternaryExpression());
                }
            } else {
                visit(arg.logicalExpression());
            }
        } else {
            String temp = GenUseConst.LOAD_IO_INST + " " +
                    GenUseConst.REG_ACCUM1 + " " + GenUseConst.FALSE_CONST;
            asmCode.addAsmGenCode(temp);
        }

        String temp = GenUseConst.LOAD_IO_INST + " " +
                idenText + " " + GenUseConst.REG_ACCUM1;

        asmCode.addAsmGenCode(temp);

        return null;
    }

    @Override
    public Object visitStringAssignment(DevLingoParser.StringAssignmentContext arg) {
        String idenText = arg.IDEN().getText();

        if (arg.getText().contains("string")) {
            addVariableToList(idenText);
        } else if (!doesVariableExist(idenText)) {
            missingVariableError(idenText);
        }

        if (arg.EQUALS() != null) {
            if (arg.getText().contains("?") ) {
                if (arg.getText().contains(":")){
                    visit(arg.ternaryExpression());
                }
            } else {
                String temp = GenUseConst.LOAD_IO_INST + " " +
                        GenUseConst.REG_ACCUM1 + " " + arg.STRING().getText();
                asmCode.addAsmGenCode(temp);
            }
        } else {
            String temp = GenUseConst.LOAD_IO_INST + " " +
                    GenUseConst.REG_ACCUM1 + " " + GenUseConst.EMPTY_QUOTE;
            asmCode.addAsmGenCode(temp);
        }

        String temp = GenUseConst.LOAD_IO_INST + " " +
                idenText + " " + GenUseConst.REG_ACCUM1;
        asmCode.addAsmGenCode(temp);

        return null;
    }

    @Override
    public Object visitExpression(DevLingoParser.ExpressionContext arg) {
        visit(arg.mathematicalExpression());
        visit(arg.logicalExpression());
        return null;
    }

    @Override
    public Object visitBoolExpressionInBrackets(DevLingoParser.BoolExpressionInBracketsContext arg) {
        visit(arg.logicalExpression());
        return null;
    }

    @Override
    public Object visitBoolIDENOnlyExpression(DevLingoParser.BoolIDENOnlyExpressionContext arg) {

        String idenText = arg.IDEN().getText();

        if (doesVariableExist(idenText)) {
            String temp =
                    GenUseConst.LOAD_IO_INST + " " + GenUseConst.REG_ACCUM1 + " " + idenText;
            asmCode.addAsmGenCode(temp);
        } else {
            missingVariableError(idenText);
        }
        return null;
    }

    @Override
    public Object visitIntAssignment(DevLingoParser.IntAssignmentContext arg) {


        String idenText = (String) arg.IDEN().getText();

        if (arg.getText().contains("int") == true) {
            addVariableToList(idenText);
        } else if (doesVariableExist(idenText) == false) {
            missingVariableError(idenText);
        }

        if (arg.EQUALS() != null) {
            if (arg.getText().contains("?") ) {
                if (arg.getText().contains(":")) {
                    visit(arg.ternaryExpression());
                }
            } else {
                visit(arg.mathematicalExpression());
            }
        } else {
            String temp = GenUseConst.LOAD_IO_INST + " " +
                    GenUseConst.REG_ACCUM1 + " " + GenUseConst.ZERO_CONST;
            asmCode.addAsmGenCode(temp);
        }
        String temp = GenUseConst.LOAD_IO_INST + " " +
                idenText + " " + GenUseConst.REG_ACCUM1;
        asmCode.addAsmGenCode(temp);

        return null;
    }

    @Override
    public Object visitPrimitiveBoolValuesOnly(DevLingoParser.PrimitiveBoolValuesOnlyContext arg) {
        String temp =
                GenUseConst.LOAD_IO_INST + " " + GenUseConst.REG_ACCUM1 + " " + arg.BOOLEAN().getText();
        asmCode.addAsmGenCode(temp);
        return null;
    }

    @Override
    public Object visitBoolLogExpression(DevLingoParser.BoolLogExpressionContext arg) {

        visit(arg.logicalExpression(0));
        String logExp1 = GenUseConst.LOAD_IO_INST + " "
                + GenUseConst.REG_CONST_B + " "
                + GenUseConst.REG_ACCUM1;
        asmCode.addAsmGenCode(logExp1);
        visit(arg.logicalExpression(1));
        String logExp2 = GenUseConst.LOAD_IO_INST + " "
                + GenUseConst.REG_CONST_C + " "
                + GenUseConst.REG_ACCUM1;
        asmCode.addAsmGenCode(logExp2);

        String andCase = GenUseConst.AND + " "
                + GenUseConst.REG_ACCUM1 + " "
                + GenUseConst.REG_CONST_B + " "
                + GenUseConst.REG_CONST_C;

        String orCase = GenUseConst.OR + " "
                + GenUseConst.REG_ACCUM1 + " "
                + GenUseConst.REG_CONST_B + " "
                + GenUseConst.REG_CONST_C;

        String isEqualCase = GenUseConst.EQUAL_TO + " "
                + GenUseConst.REG_ACCUM1 + " "
                + GenUseConst.REG_CONST_B + " "
                + GenUseConst.REG_CONST_C;

        String notEqualCase = GenUseConst.NOT_EQUAL_TO + " "
                + GenUseConst.REG_ACCUM1 + " "
                + GenUseConst.REG_CONST_B + " "
                + GenUseConst.REG_CONST_C;

        switch (arg.op.getType()) {
            case DevLingoParser.AND -> asmCode.addAsmGenCode(andCase);
            case DevLingoParser.OR -> asmCode.addAsmGenCode(orCase);
            case DevLingoParser.IS_EQUAL_TO -> asmCode.addAsmGenCode(isEqualCase);
            case DevLingoParser.NOT_EQUAL_TO -> asmCode.addAsmGenCode(notEqualCase);
        }
        return null;
    }



    @Override
    public Object visitNumberMultDivExpression(DevLingoParser.NumberMultDivExpressionContext arg) {

        String regConst1 = GenUseConst.REG_CONST_B;
        String regConst2 = GenUseConst.REG_CONST_C;
        int regVal1 = 0;
        int regVal2 = 1;

        if(arg.mathematicalExpression(1).getChildCount() > arg.mathematicalExpression(0).getChildCount()) {
            regVal1 = 1; regVal2 = 0;
        }

        if(!((arg.mathematicalExpression(1).getChildCount() > 2) && (arg.mathematicalExpression(0).getChildCount() > 2))) {
            regConst1 = GenUseConst.REG_CONST_C;
            regConst2 = GenUseConst.REG_CONST_D;
        }

        visit(arg.mathematicalExpression(regVal1));
        String mathExp1 = GenUseConst.LOAD_IO_INST + " "
                + regConst1 + " " + GenUseConst.REG_ACCUM1;
        asmCode.addAsmGenCode(mathExp1);
        visit(arg.mathematicalExpression(regVal2));
        String mathExp2 = GenUseConst.LOAD_IO_INST + " "
                + regConst2 + " " + GenUseConst.REG_ACCUM1;
        asmCode.addAsmGenCode(mathExp2);

        String multExp1 = GenUseConst.MULTIPLICATION + " "
                + GenUseConst.REG_ACCUM1 + " " + regConst1 + " " + regConst2;

        String divExp1 = GenUseConst.DIVISION + " "
                + GenUseConst.REG_ACCUM1 + " " + regConst1 + " " + regConst2;

        switch (arg.op.getType()) {
            case DevLingoParser.MULTIPLY -> asmCode.addAsmGenCode(multExp1);
            case DevLingoParser.DIVISION -> asmCode.addAsmGenCode(divExp1);
        }

        return null;
    }

    @Override
    public Object visitRangedForLoop(DevLingoParser.RangedForLoopContext arg) {
        String idenText = arg.IDEN().getText();
        addVariableToList(idenText);
        visit(arg.rangeVal(0));
        String asmStr = GenUseConst.LOAD_IO_INST + " "
                + idenText + " " + GenUseConst.REG_ACCUM1;
        asmCode.addAsmGenCode(asmStr);
        asmCode.addAsmGenCode(GenUseConst.FOR_ST_CONST);
        asmCode.addAsmGenCode(GenUseConst.START_CONST);

        String limitRng;
        if(arg.rangeVal(1).IDEN() != null){
            limitRng = arg.rangeVal(1).IDEN().getText();
        } else {
            limitRng = arg.rangeVal(1).DIGITS().getText();
        }
        updateIdentifierInFor(GenUseConst.LESS_THAN, idenText, limitRng);
        asmCode.addAsmGenCode(GenUseConst.END_CONST);
        updateIdentifierInFor(GenUseConst.ADDITION, arg.IDEN().getText(), "1");
        String asmText = GenUseConst.LOAD_IO_INST + " " +
                arg.IDEN().getText() + " " + GenUseConst.REG_ACCUM1;
        asmCode.addAsmGenCode(asmText);
        visit(arg.statement());
        asmCode.addAsmGenCode(GenUseConst.FOR_END_CONST);

        return null;
    }

    @Override
    public Object visitNumberADDITIONALSUBTRACTExpression(DevLingoParser.NumberADDITIONALSUBTRACTExpressionContext arg) {

        String regConst1 = GenUseConst.REG_CONST_B;
        String regConst2 = GenUseConst.REG_CONST_C;
        int regVal1 = 0;
        int regVal2 = 1;

        if(arg.mathematicalExpression(0).getChildCount() < arg.mathematicalExpression(1).getChildCount()) {
            regVal2 = 0;
            regVal1 = 1;
        }

        if(!(arg.mathematicalExpression(1).getChildCount() > 2) ) {
            if ((arg.mathematicalExpression(0).getChildCount() > 2)) {
                regConst2 = GenUseConst.REG_CONST_D;
                regConst1 = GenUseConst.REG_CONST_C;
            }
        }

        visit(arg.mathematicalExpression(regVal1));
        String mathExp1 = GenUseConst.LOAD_IO_INST + " "
                + regConst1 + " " + GenUseConst.REG_ACCUM1;
        asmCode.addAsmGenCode(mathExp1);
        visit(arg.mathematicalExpression(regVal2));
        String mathExp2 = GenUseConst.LOAD_IO_INST + " "
                + regConst2 + " " + GenUseConst.REG_ACCUM1;
        asmCode.addAsmGenCode(mathExp2);

        String addCase = GenUseConst.ADDITION + " "
                + GenUseConst.REG_ACCUM1 + " " + regConst1 + " " + regConst2;
        String subCase = GenUseConst.SUBTRACTION + " "
                + GenUseConst.REG_ACCUM1 + " " + regConst1 + " " + regConst2;

        switch (arg.op.getType()) {
            case DevLingoParser.ADDITIONAL -> asmCode.addAsmGenCode(addCase);
            case DevLingoParser.SUBTRACT -> asmCode.addAsmGenCode(subCase);
        }
        return null;
    }

    @Override
    public Object visitBoolCompExpression(DevLingoParser.BoolCompExpressionContext arg) {
        visit(arg.comparisonExpression());
        return null;
    }

    @Override
    public Object visitNumbCompExpression(DevLingoParser.NumbCompExpressionContext arg) {
        visit(arg.mathematicalExpression(0));
        String mathExp1 = GenUseConst.LOAD_IO_INST + " "
                + GenUseConst.REG_CONST_C + " "
                + GenUseConst.REG_ACCUM1;
        asmCode.addAsmGenCode(mathExp1);
        visit(arg.mathematicalExpression(1));
        String mathExp2 = GenUseConst.LOAD_IO_INST + " "
                + GenUseConst.REG_CONST_D + " "
                + GenUseConst.REG_ACCUM1;
        asmCode.addAsmGenCode(mathExp2);

        String gtThanCase = GenUseConst.GREATER_THAN + " "
                + GenUseConst.REG_ACCUM1 + " "
                + GenUseConst.REG_CONST_C + " "
                + GenUseConst.REG_CONST_D;
        String ltThanCase = GenUseConst.LESS_THAN + " "
                + GenUseConst.REG_ACCUM1 + " "
                + GenUseConst.REG_CONST_C + " "
                + GenUseConst.REG_CONST_D;
        String gtEqualCase = GenUseConst.GREATER_THAN_OR_EQUAL + " "
                + GenUseConst.REG_ACCUM1 + " "
                + GenUseConst.REG_CONST_C + " "
                + GenUseConst.REG_CONST_D;
        String lsEqualCase = GenUseConst.LESS_THAN_OR_EQUAL + " "
                + GenUseConst.REG_ACCUM1 + " "
                + GenUseConst.REG_CONST_C + " "
                + GenUseConst.REG_CONST_D;
        String isEqualCase = GenUseConst.EQUAL_TO + " "
                + GenUseConst.REG_ACCUM1 + " "
                + GenUseConst.REG_CONST_C + " "
                + GenUseConst.REG_CONST_D;
        String notEqualCase = GenUseConst.NOT_EQUAL_TO + " "
                + GenUseConst.REG_ACCUM1 + " "
                + GenUseConst.REG_CONST_C + " "
                + GenUseConst.REG_CONST_D;

        switch (arg.op.getType()) {
            case DevLingoParser.GREATER_THAN -> asmCode.addAsmGenCode(gtThanCase);
            case DevLingoParser.LESS_THAN -> asmCode.addAsmGenCode(ltThanCase);
            case DevLingoParser.GREATER_THAN_OR_EQUAL -> asmCode.addAsmGenCode(gtEqualCase);
            case DevLingoParser.LESS_THAN_OR_EQUAL -> asmCode.addAsmGenCode(lsEqualCase);
            case DevLingoParser.IS_EQUAL_TO -> asmCode.addAsmGenCode(isEqualCase);
            case DevLingoParser.NOT_EQUAL_TO -> asmCode.addAsmGenCode(notEqualCase);
        }
        return null;
    }

    @Override
    public Object visitNumberIDENOnly(DevLingoParser.NumberIDENOnlyContext arg) {

        String idenText = arg.IDEN().getText();

        if (doesVariableExist(idenText)) {
            String idenStr =
                    GenUseConst.LOAD_IO_INST + " " + GenUseConst.REG_ACCUM1 + " " + idenText;
            asmCode.addAsmGenCode(idenStr);
            if (arg.SUBTRACT() != null) {
                String subStr =
                        GenUseConst.UNARY_CONST + " " + GenUseConst.REG_ACCUM1;
                asmCode.addAsmGenCode(subStr);
            }
        } else {
            missingVariableError(idenText);
        }

        return null;
    }

    @Override
    public Object visitNumbBrackExpression(DevLingoParser.NumbBrackExpressionContext arg) {
        visit(arg.mathematicalExpression());
        return null;
    }



    @Override
    public Object visitConditionalExpression(DevLingoParser.ConditionalExpressionContext arg) {
        asmCode.addAsmGenCode(GenUseConst.START_CONST);
        visit(arg.logicalExpression());
        asmCode.addAsmGenCode(GenUseConst.END_CONST);
        return null;
    }

    @Override
    public Object visitIfBlock(DevLingoParser.IfBlockContext arg) {

        asmCode.addAsmGenCode(GenUseConst.IF_EL_ST_CONST);
        asmCode.addAsmGenCode(GenUseConst.IF_IC_CONST);
        visit(arg.conditionalExpression());
        visit(arg.statement());
        asmCode.addAsmGenCode(GenUseConst.IF_IC_END);
        for (int itr = 0; itr < arg.else_ifBlock().size(); itr = itr + 1) {
            visit(arg.else_ifBlock(itr));
        }
        if (arg.else_expr() != null) {
            visit(arg.else_expr());
        }
        asmCode.addAsmGenCode(GenUseConst.IF_EL_END_CONST);

        return null;
    }

    @Override
    public Object visitElse_ifBlock(DevLingoParser.Else_ifBlockContext arg) {
        asmCode.addAsmGenCode(GenUseConst.ELIF_ST_CONST);
        visit(arg.conditionalExpression());
        visit(arg.statement());
        asmCode.addAsmGenCode(GenUseConst.ELIF_END_CONST);
        return null;
    }

    @Override
    public Object visitElse_expr(DevLingoParser.Else_exprContext arg) {
        asmCode.addAsmGenCode(GenUseConst.EL_START_CONST);
        visit(arg.statement());
        asmCode.addAsmGenCode(GenUseConst.EL_END_CONST);
        return null;
    }

    @Override
    public Object visitWhileLoop(DevLingoParser.WhileLoopContext arg) {
        asmCode.addAsmGenCode(GenUseConst.WHILE_ST_CONST);
        visit(arg.conditionalExpression());
        visit(arg.statement());
        asmCode.addAsmGenCode(GenUseConst.WHILE_END_CONST);
        return null;
    }



    @Override
    public Object visitRangeVal(DevLingoParser.RangeValContext ctx) {
        String valTemp = "0";
        if (ctx.IDEN() != null){//check for here
            valTemp = ctx.IDEN().getText();
        } else if(ctx.DIGITS() != null) {
            valTemp = ctx.DIGITS().getText();
        }

        asmCode.addAsmGenCode(GenUseConst.LOAD_IO_INST + " "
                + GenUseConst.REG_ACCUM1 + " " + valTemp);
        return null;
    }

    @Override
    public Object visitForLoop(DevLingoParser.ForLoopContext arg) {
        visit(arg.assignmentExpression());
        asmCode.addAsmGenCode(GenUseConst.FOR_ST_CONST);
        asmCode.addAsmGenCode(GenUseConst.START_CONST);
        visit(arg.logicalExpression());
        asmCode.addAsmGenCode(GenUseConst.END_CONST);
        visit(arg.statement());
        visit(arg.variable_change_part());
        asmCode.addAsmGenCode(GenUseConst.FOR_END_CONST);
        return null;
    }

    @Override
    public Object visitVariable_change_part(DevLingoParser.Variable_change_partContext arg) {

        if(arg.increment_expression() != null){
            visit(arg.increment_expression());
        }else if(arg.decrement_expression() != null){
            visit(arg.decrement_expression());
        }


        return null;
    }

    @Override
    public Object visitDecrement_expression(DevLingoParser.Decrement_expressionContext arg) {
        updateIdentifierInFor(GenUseConst.SUBTRACTION, arg.IDEN().getText(), "1");
        String instTemp =
                GenUseConst.LOAD_IO_INST + " " + arg.IDEN().getText() + " " + GenUseConst.REG_ACCUM1;
        asmCode.addAsmGenCode(instTemp);
        return null;
    }

    @Override
    public Object visitIncrement_expression(DevLingoParser.Increment_expressionContext ctx) {
        updateIdentifierInFor(GenUseConst.ADDITION, ctx.IDEN().getText(), "1");
        String incInstTemp =
                GenUseConst.LOAD_IO_INST + " " + ctx.IDEN().getText() + " " + GenUseConst.REG_ACCUM1;
        asmCode.addAsmGenCode(incInstTemp);
        return null;
    }

    public void updateIdentifierInFor(String oprArg, String idenText, String constArg){

        String atr1 = GenUseConst.LOAD_IO_INST + " " +
                GenUseConst.REG_ACCUM1 + " " + idenText;
        String atr2 = GenUseConst.LOAD_IO_INST + " "
                + GenUseConst.REG_CONST_D + " " + GenUseConst.REG_ACCUM1;
        String atr3 = GenUseConst.LOAD_IO_INST + " "
                + GenUseConst.REG_ACCUM1 + " " + constArg;
        String atr4 = GenUseConst.LOAD_IO_INST + " "
                + GenUseConst.REG_CONST_E + " " + GenUseConst.REG_ACCUM1;
        String atr5 = oprArg + " " + GenUseConst.REG_ACCUM1 + " "
                + GenUseConst.REG_CONST_D + " " + GenUseConst.REG_CONST_E;

        asmCode.addAsmGenCode(atr1);
        asmCode.addAsmGenCode(atr2);
        asmCode.addAsmGenCode(atr3);
        asmCode.addAsmGenCode(atr4);
        asmCode.addAsmGenCode(atr5);
    }





    @Override
    public Object visitTernaryExpression(DevLingoParser.TernaryExpressionContext arg) {

        asmCode.addAsmGenCode(GenUseConst.IF_EL_ST_CONST);
        asmCode.addAsmGenCode(GenUseConst.IF_IC_CONST);
        visit(arg.conditionalExpression());

        ternaryBlock(arg, 0);
        asmCode.addAsmGenCode(GenUseConst.IF_IC_END);
        asmCode.addAsmGenCode(GenUseConst.EL_START_CONST);

        ternaryBlock(arg, 1);
        asmCode.addAsmGenCode(GenUseConst.EL_END_CONST);
        asmCode.addAsmGenCode(GenUseConst.IF_EL_END_CONST);
        return null;
    }

    public void ternaryBlock(DevLingoParser.TernaryExpressionContext ctx, int index){
        if (ctx.expression(index) != null){
            asmCode.addAsmGenCode(GenUseConst.LOAD_IO_INST + " "
                    + GenUseConst.REG_ACCUM1 + " " +ctx.expression(index).getText());
        } else if (ctx.BOOLEAN(index) != null){
            asmCode.addAsmGenCode(GenUseConst.LOAD_IO_INST + " "
                    + GenUseConst.REG_ACCUM1 + " " +ctx.BOOLEAN(index).getText());
        } else if (ctx.STRING(index) != null){
            asmCode.addAsmGenCode(GenUseConst.LOAD_IO_INST + " "
                    + GenUseConst.REG_ACCUM1 + " " +ctx.STRING(index).getText());
        }
    }


}