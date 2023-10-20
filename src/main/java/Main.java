/*
* Author: Jay Sachin Chiddarwar, Manmeet Singh
* Date: 26 April 2023
* */

import compilerDirec.MainCompilationHandler;
import runtimeUtility.GeneratedCodeExecute;

public class Main {

    public static void main(String[] args) {

        try{

            String filePath = args[0];
            MainCompilationHandler compiler = new MainCompilationHandler();
            compiler.programCodeRun(filePath);

            filePath = filePath.substring(0, filePath.length()-5) + ".dvac";

            System.out.println("Compilation done, proceed for handling " +
            "intermediate code\n");
            System.out.println("Generated Code Created\n" );
            GeneratedCodeExecute runtime = new GeneratedCodeExecute();
            runtime.runMain(filePath);

        } catch (Exception exception){
            System.err.println(exception);
        }

    }
}