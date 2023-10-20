package runtimeUtility;

import java.util.*;

import static runtimeUtility.GenUseConst.*;

public class GeneratedCodeRuntime {
    private int progItr = 0;
    private String genOutput = "";
    private List<String> generatedCode;
    private Stack<HashMap<String, AllDatatype>> prStack = new Stack<>();

    public GeneratedCodeRuntime(String generatedCode) {
        this.generatedCode = Arrays.asList(generatedCode.split("\\n"));
    }

    public void mainLogicStck() throws Exception {
        baseInstialize();

        while (progItr < generatedCode.size()) {
            progItr = runGenCodeHandler(generatedCode.get(progItr), progItr) + 1;
        }
    }

    private void baseInstialize() {
        prStack.push(new HashMap<>());
    }

    private int runGenCodeHandler(String instVal, int intArg) throws Exception {

        String[] arrInst = instVal.split("\\s");
        String instVar = arrInst[0];

        switch (instVar) {
            case LOAD_IO_INST -> instValHandler(arrInst);
            case PRINT_IO_INST -> printStatementHandler(arrInst);
            case ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION -> arithmaticLogic(arrInst);
            case GREATER_THAN, GREATER_THAN_OR_EQUAL, LESS_THAN, LESS_THAN_OR_EQUAL, EQUAL_TO, NOT_EQUAL_TO -> boolCompOprLogic(arrInst);
            case IF_IC_CONST -> intArg = ifBlockHandler(++intArg);
            case ELIF_ST_CONST -> intArg = elifBlockHandler(++intArg);
            case EL_START_CONST -> intArg = elseBlockHandler(++intArg);
            case WHILE_ST_CONST -> intArg = whileBlockHandler(++intArg);
            case FOR_ST_CONST -> intArg = forBlockHandler(++intArg);
            case UNARY_CONST -> subInstHandler(arrInst);
            case OR, AND -> boolInstHandler(arrInst);
        }
        return intArg;
    }

    private void arithmaticLogic(String[] instArr) throws Exception {

        AllDatatype lftOpr = getDataValue(instArr[2]);
        AllDatatype rgtOpr = getDataValue(instArr[3]);
        String lfDtType = lftOpr != null ? lftOpr.getDataType() : null;
        String rgDtType = rgtOpr != null ? rgtOpr.getDataType() : null;

        if (!lfDtType.equals(rgDtType)) {
            throw new Exception("Mismatch Error for data");
        } else if (!lfDtType.equalsIgnoreCase("integer")) {
            throw new Exception("boolean value not allowed");
        } else {
            int leftOperand = lftOpr.dataAsInteger();
            int rightOperand = rgtOpr.dataAsInteger();

            switch (instArr[0]) {
                case ADDITION -> setValue(instArr[1], new AllDatatype(leftOperand + rightOperand));
                case SUBTRACTION -> setValue(instArr[1], new AllDatatype(leftOperand - rightOperand));
                case MULTIPLICATION -> setValue(instArr[1], new AllDatatype(leftOperand * rightOperand));
                case DIVISION -> setValue(instArr[1], new AllDatatype(leftOperand / rightOperand));
            }
        }
    }

    private void boolCompOprLogic(String[] instArr) throws Exception {

        AllDatatype lfOpr = getDataValue(instArr[2]);
        AllDatatype rgtOpr = getDataValue(instArr[3]);
        String lfDtTpe = lfOpr != null ? lfOpr.getDataType() : null;
        String rgtDtType = rgtOpr != null ? rgtOpr.getDataType() : null;

        if (!lfDtTpe.equals(rgtDtType)) {
            throw new Exception("Mismatch Error for data");
        } else if (!lfDtTpe.equalsIgnoreCase("integer")) {
            boolean leftOperand = getValue(instArr[2]).dataAsBoolean();
            boolean rightOperand = getValue(instArr[3]).dataAsBoolean();
            switch (instArr[0]) {
                case EQUAL_TO -> setValue(instArr[1], new AllDatatype(leftOperand == rightOperand));
                case NOT_EQUAL_TO -> setValue(instArr[1], new AllDatatype(leftOperand != rightOperand));
                default -> throw new Exception("Type Error Raise");
            }
        } else {
            int lftOpr = getValue(instArr[2]).dataAsInteger();
            int rgtOPr2 = getValue(instArr[3]).dataAsInteger();

            switch (instArr[0]) {
                case GREATER_THAN -> setValue(instArr[1], new AllDatatype(lftOpr > rgtOPr2));
                case GREATER_THAN_OR_EQUAL -> setValue(instArr[1], new AllDatatype(lftOpr >= rgtOPr2));
                case LESS_THAN -> setValue(instArr[1], new AllDatatype(lftOpr < rgtOPr2));
                case LESS_THAN_OR_EQUAL -> setValue(instArr[1], new AllDatatype(lftOpr <= rgtOPr2));
                case EQUAL_TO -> setValue(instArr[1], new AllDatatype(lftOpr == rgtOPr2));
                case NOT_EQUAL_TO -> setValue(instArr[1], new AllDatatype(lftOpr != rgtOPr2));
            }
        }
    }

    private int blockLogicHandler(int progItr, String endCond, boolean tempSkipCheck) throws Exception {

        while (progItr >= 0) {
            String instVar = generatedCode.get(progItr);
            if (!instVar.equals(endCond)) {
                if (!tempSkipCheck) {
                    progItr = runGenCodeHandler(instVar, progItr);
                }
                progItr++;
            } else {
                break;
            }
        }
        return progItr;
    }

    private int ifBlockHandler(int progItr) throws Exception {

        progItr = blockLogicHandler(progItr, END_CONST, false);
        if (getValue(REG_ACCUM1).dataAsBoolean()) {
            progItr = blockLogicHandler(progItr, IF_IC_END, false);
            progItr = blockLogicHandler(progItr, IF_EL_END_CONST, true);
        } else {
            progItr = blockLogicHandler(progItr, IF_IC_END, true);
        }
        return progItr;
    }


    private int elseBlockHandler(int progItr) throws Exception {
        progItr = blockLogicHandler(progItr, EL_END_CONST, false);
        return progItr;
    }


    private int elifBlockHandler(int progItr) throws Exception {
        progItr = blockLogicHandler(progItr, END_CONST, false);
        if (getValue(REG_ACCUM1).dataAsBoolean()) {
            progItr = blockLogicHandler(progItr, ELIF_END_CONST, false);
            progItr = blockLogicHandler(progItr, IF_EL_END_CONST, true);
        } else {
            progItr = blockLogicHandler(progItr, ELIF_END_CONST, true);
        }
        return progItr;
    }

    private void instValHandler(String[] instArr) {
        if (instArr[1].equals(REG_ACCUM1)) {
            setValue(REG_ACCUM1, getDataValue(instArr[2]));
        } else {
            setValue(instArr[1], getValue(instArr[2]));
        }
    }

    private void printStatementHandler(String[] instArr) {
        AllDatatype valToPrint = getDataValue(instArr[1]);

        if (valToPrint != null) {
            try {
                outputSummer(valToPrint.toString());
            } catch (Exception exception) {
                System.err.println(exception);
            }
        }
    }

    private void outputSummer(String ansTemp) {
        this.genOutput += ansTemp + "\n";
    }

    private int whileBlockHandler(int whileItrCount) throws Exception {
        int locCounter;
        do {
            locCounter = blockLogicHandler(whileItrCount, END_CONST, false);
            if (getValue(REG_ACCUM1).dataAsBoolean()) {
                locCounter = blockLogicHandler(locCounter, WHILE_END_CONST, false);
            } else {
                locCounter = blockLogicHandler(locCounter, WHILE_END_CONST, true);
                break;
            }
        } while (true);

        return locCounter;
    }

    public String getOutputData() {
        return this.genOutput;
    }

    private AllDatatype getDataValue(String value) {
        if (value.equals("NULL")) {
            return null;
        } else if (isInt(value)) {
            return new AllDatatype(Integer.parseInt(value));
        } else if (isBoolean(value)) {
            return new AllDatatype(Boolean.parseBoolean(value));
        } else if (isString(value)) {
            return new AllDatatype(cleanString(value));
        } else {
            return getValue(value);
        }
    }

    private String cleanString(String value) {
        int length = value.length();
        return value.substring(1, length - 1);
    }

    private boolean isInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void boolInstHandler(String[] instArr) throws Exception {

        AllDatatype lftOpr = getDataValue(instArr[2]);
        AllDatatype rghOpr = getDataValue(instArr[3]);
        String lftdtVal = lftOpr.getDataType();
        String rgtDtval = rghOpr.getDataType();

        if (lftdtVal != rgtDtval) {
            throw new Exception("Wrong data type");
        } else if (lftdtVal == rgtDtval && !lftdtVal.equalsIgnoreCase("integer")) {
            boolean rightB = rghOpr.dataAsBoolean();
            boolean leftB = lftOpr.dataAsBoolean();

            switch (instArr[0]) {
                case AND -> setValue(instArr[1], new AllDatatype(leftB && rightB));
                case OR -> setValue(instArr[1], new AllDatatype(leftB || rightB));
            }
        }
    }

    private boolean isBoolean(String value) {
        try {
            boolean b = Boolean.parseBoolean(value);
            return b || value.equalsIgnoreCase("FALSE");
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isString(String value) {
        return value.startsWith("\"") && value.endsWith("\"");
    }


    private AllDatatype getValue(String identifier) {
        HashMap<String, AllDatatype> hashMap = prStack.peek();
        return hashMap.get(identifier);
    }

    private void setValue(String identifier, AllDatatype value) {
        HashMap<String, AllDatatype> hashMap = prStack.peek();
        hashMap.put(identifier, value);
    }

    private void subInstHandler(String[] instArr) throws Exception {
        AllDatatype oprndTemp = getDataValue(instArr[1]);
        String operandDatatype = oprndTemp.getDataType();
        if (operandDatatype.equalsIgnoreCase("INTEGER")) {
            setValue(instArr[1], new AllDatatype(-1 * oprndTemp.dataAsInteger()));
        } else {
            throw new Exception("Datatype mismatch");
        }
    }

    private int forBlockHandler(int forItrCount) throws Exception {
        int locCounter;
        do {
            locCounter = blockLogicHandler(forItrCount, END_CONST, false);
            if (getValue(REG_ACCUM1).dataAsBoolean()) {
                locCounter = blockLogicHandler(locCounter, FOR_END_CONST, false);
            } else {
                locCounter = blockLogicHandler(locCounter, FOR_END_CONST, true);
                break;
            }
        } while (true);

        return locCounter;
    }

    @Override
    public String toString() {
        return "GeneratedCodeRuntime{" +
                "progItr=" + progItr +
                ", genOutput='" + genOutput + '\'' +
                ", generatedCode=" + generatedCode +
                ", prStack=" + prStack +
                '}';
    }

    public int getProgItr() {
        return progItr;
    }

    public void setProgItr(int progItr) {
        this.progItr = progItr;
    }
}