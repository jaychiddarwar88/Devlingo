package runtimeUtility;

import java.util.Objects;

public class AllDatatype {

    private final Object mainObj;

    AllDatatype(Object mainObj) {
        this.mainObj = mainObj;
    }

    public Integer dataAsInteger() {
        return (Integer) mainObj;
    }

    public Boolean dataAsBoolean() {
        return (Boolean) mainObj;
    }

    public String dataAsString() {
        return String.valueOf(mainObj);
    }

    public String getDataType() {
        try {
            int i = (Integer) mainObj;
            return "Integer";
        } catch (ClassCastException e) {
            String strValueOfObj = String.valueOf(mainObj);
            if (strValueOfObj.equals("true") || strValueOfObj.equals("false")) {
                return "Boolean";
            }
            return "String";
        }
    }

    @Override
    public boolean equals(Object objArg) {
        if (this == objArg) return true;
        if (objArg == null || getClass() != objArg.getClass()) return false;
        AllDatatype allDatatype = (AllDatatype) objArg;
        return Objects.equals(mainObj, allDatatype.mainObj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainObj);
    }

    @Override
    public String toString() {
        return mainObj.toString();
    }
}