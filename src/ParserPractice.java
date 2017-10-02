import jdk.nashorn.internal.runtime.regexp.joni.constants.SyntaxProperties;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.IntervalSet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import java.io.FileInputStream;

public class ParserPractice {
    private String inputFilename, outputFilename;
    private boolean syntaxErrorFound;

    private void setFiles(String inputFilename, String outputFilename){
        this.inputFilename = inputFilename;
        this.outputFilename = outputFilename;
        syntaxErrorFound = false;
    }


    public void generateOutput() throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFilename));
        TclV2Lexer lexer = new TclV2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TclV2Parser parser = new TclV2Parser(tokens);

        final PrintWriter writer = new PrintWriter(outputFilename, "UTF-8");

        parser.setErrorHandler(new DefaultErrorStrategy(){

            protected String elementName(Vocabulary vocabulary, int tokenCode){
                if(tokenCode == -1){
                    return "EOF";
                }
                if(tokenCode == -2){
                    return "EPS";
                }
                return vocabulary.getDisplayName(tokenCode);
            }

            protected String elementName(String name){
                if(name.equals("\'<EOF>\'")){
                    return "\'EOF\'";
                }
                return name;
            }

            private String reportSyntaxError(Token token, Parser recognizer){
                String tokenName = this.getTokenErrorDisplay(token);
                IntervalSet expecting = this.getExpectedTokens(recognizer);
                TreeSet<String> expectedTokens = new TreeSet<>();

                //Adapted from org.antlr.v4.runtime.misc.IntervalSet.toString(Vocabulary)
                if(expecting.getIntervals() != null && !expecting.getIntervals().isEmpty()){
                    Iterator iter = expecting.getIntervals().iterator();
                    while(iter.hasNext()){
                        Interval I = (Interval) iter.next();
                        int a = I.a;
                        int b = I.b;
                        for(int i = a; i <=b; i++){
                            String name = elementName(recognizer.getVocabulary(), i);
                            if(name.indexOf('\'') == -1){
                                if(name.equals("ID")){
                                    name = "identificador";
                                }
                                name = "\'" + name + "\'";
                            }
                            if(name.equals("\'EOF\'"))
                                expectedTokens.add(name);
                            else if(name.equals("\'DOUBLEVALUE\'")) {
                                expectedTokens.add("\'valor_double\'");
                            }
                            else if(name.equals("\'INTEGERVALUE\'")){
                                expectedTokens.add("\'valor_entero\'");
                            }
                            else if(name.equals("\'STRINGVALUE\'")){
                                expectedTokens.add("\'valor_string\'");
                            }
                            else{
                                expectedTokens.add(name);
                            }
                        }
                    }
                }
                StringBuilder expectedBuffer = new StringBuilder();
                boolean comma = false;
                for(String tokenString : expectedTokens){
                    if(comma) expectedBuffer.append(", ");
                    expectedBuffer.append(tokenString);
                    comma = true;
                }

                String msg = "<" + token.getLine() + "," + (token.getCharPositionInLine() + 1) + "> Error sintactico "
                        + "se encontro: " + elementName(tokenName) + "; se esperaba: "
                        + expectedBuffer + ".";

                if(!syntaxErrorFound){
                    syntaxErrorFound = true;
                    writer.print(msg);
                    writer.close();
                }
                return msg;
            }

            private void reportTokens(Parser recognizer){
                if(!this.inErrorRecoveryMode(recognizer)) {
                    this.beginErrorCondition(recognizer);
                    Token token = recognizer.getCurrentToken();
                    String msg = reportSyntaxError(token, recognizer);
                    recognizer.notifyErrorListeners(token, msg, (RecognitionException)null);
                }
            }

            @Override
            protected void reportUnwantedToken(Parser recognizer) {
                reportTokens(recognizer);
            }


            @Override
            protected void reportMissingToken(Parser recognizer) {
                reportTokens(recognizer);
            }

            @Override
            protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
                String msg = reportSyntaxError(e.getOffendingToken(), recognizer);
                recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
            }

            @Override
            protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
                String msg = reportSyntaxError(e.getOffendingToken(), recognizer);
                recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
            }
        });

        parser.tcl();

        if(!syntaxErrorFound){
            writer.print("El analisis sintactico ha finalizado correctamente.");
            writer.close();
        }
    }

    private final static int[] TEST_CASES = {5, 5, 4, 4, 2};

    private final static String directory = "parser-test-cases";
    private final static String samples_directory = "parser-samples";
    private final static String inputPrefix = "in";
    private final static String outputPrefix = "out";
    private final static String extension = ".txt";
    private final static int SAMPLE_NUMBER = 11;


    public static void main(String[] args) throws Exception {
        ParserPractice parserPractice = new ParserPractice();
        parserPractice.setFiles("parser-test-cases/single-input.txt",
                "parser-test-cases/output.txt");
        parserPractice.generateOutput();

        for(int i = 0; i < SAMPLE_NUMBER; i++){
            System.out.println("computing file " + i);
            parserPractice.setFiles(directory + "/" + samples_directory + "/"
                    + inputPrefix + (i < 10 ? "0" : "") + i + extension,
                    directory + "/" + samples_directory + "/"
                            + outputPrefix + (i < 10 ? "0" : "") + i + extension);
            parserPractice.generateOutput();
        }

        for(char c = 'A'; c <= 'E'; c++){
            for(int i = 0; i < TEST_CASES[(int)(c - 'A')]; i++){
                parserPractice.setFiles(directory + "/" + String.valueOf(c) + "/"
                                + inputPrefix + (i < 10 ? "0" : "") + i + extension,
                        directory + "/" + String.valueOf(c) + "/"
                                + outputPrefix + (i < 10 ? "0" : "") + i + extension);
                parserPractice.generateOutput();
            }
        }

    }
}
