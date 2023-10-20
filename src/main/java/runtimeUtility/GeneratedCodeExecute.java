package runtimeUtility;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class GeneratedCodeExecute {

    public void runMain(String filePath) {
        try {
            // Gets the generated code from .dvac file
            CharStream intermediateCode = CharStreams.fromFileName(filePath);

            // File output saved on file filename.op
            PrintWriter pw = new PrintWriter(filePath.replace("dvac", "op"), StandardCharsets.UTF_8);

            // Generated code to runtime class
            GeneratedCodeRuntime runtime = new GeneratedCodeRuntime(intermediateCode.toString().replaceAll("\r", ""));
            runtime.mainLogicStck();
            // Storing result in Outupt
            String output = runtime.getOutputData();
            System.out.println("Output:\n" + output);

            pw.println("Output \n");
            pw.println(runtime.getOutputData());
            pw.close();
        } catch (Exception exeception) {
            System.err.println(exeception);
        }
    }
}