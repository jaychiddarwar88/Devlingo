package compilerDirec;

public class AsmGenCode {

    public String asmGenCode = "";

    public AsmGenCode() {
    }

    public void addAsmGenCode(String code) {
        this.asmGenCode += code + "\n";
    }

    public String getAsmGenCode() {
        return asmGenCode;
    }

    public void setAsmGenCode(String asmGenCode) {
        this.asmGenCode = asmGenCode;
    }

    @Override
    public String toString() {
        return "AsmGenCode{" +
                "asmGenCode='" + asmGenCode + '\'' +
                '}';
    }
}