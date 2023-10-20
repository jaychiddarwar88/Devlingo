package compilerDirec;

import gen.DevLingoLexer;
import gen.DevLingoParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;


public class MainCompilationHandler {

    public void programCodeRun(String fileNameRoot) {
        try {

            CommonTokenStream tokens = new CommonTokenStream(new DevLingoLexer(CharStreams.fromFileName(fileNameRoot)));

            DevLingoCompiler devlingoCompilerObj = new DevLingoCompiler();
            devlingoCompilerObj.visit(new DevLingoParser(tokens).program());
            List<String> asmCode = Arrays.asList(devlingoCompilerObj.getOutput().split("\\n"));
            if (asmCode.size() > 0) {

                PrintWriter outputToFile = new PrintWriter(fileNameRoot.replace("dvlg", "dvac"), StandardCharsets.UTF_8);
                for (int i = 0; i < asmCode.size(); ++i) {
                    outputToFile.println(asmCode.get(i));
                }

                outputToFile.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}