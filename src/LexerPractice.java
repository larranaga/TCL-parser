import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by larra on 29/08/2017.
 */


public class LexerPractice {

    private Set<String> keywords;
    private Map<String, String> operators;
    private Map<String, String> otherTokens;
    private String inputFilename, outputFilename;

    private static final int EOF_TYPE = -1;

    private void fillKeywords(){
        keywords = new TreeSet<>();
        keywords.add("set");
        keywords.add("puts");
        keywords.add("gets");
        keywords.add("stdin");
        keywords.add("if");
        keywords.add("then");
        keywords.add("else");
        keywords.add("elseif");
        keywords.add("switch");
        keywords.add("default");
        keywords.add("while");
        keywords.add("expr");
        keywords.add("continue");
        keywords.add("break");
        keywords.add("for");
        keywords.add("incr");
        keywords.add("array");
        keywords.add("exists");
        keywords.add("size");
        keywords.add("proc");
    }

    private void fillOperators(){
        operators = new TreeMap<>();
        operators.put("{", "token_llave_izq");
        operators.put("}", "token_llave_der");
        operators.put("[", "token_cor_izq");
        operators.put("]", "token_cor_der");
        operators.put("(", "token_par_izq");
        operators.put(")", "token_par_der");
        operators.put("$", "token_dollar");
        operators.put(";", "token_pyc");
        operators.put(">", "token_mayor");
        operators.put("<", "token_menor");
        operators.put(">=", "token_mayor_igual");
        operators.put("<=", "token_menor_igual");
        operators.put("eq", "token_igual_str");
        operators.put("==", "token_igual_num");
        operators.put("ne", "token_diff_str");
        operators.put("!=", "token_diff_num");
        operators.put("&&", "token_and");
        operators.put("||", "token_or");
        operators.put("!", "token_not");
        operators.put("+", "token_mas");
        operators.put("-", "token_menos");
        operators.put("*", "token_mul");
        operators.put("/", "token_div");
        operators.put("%", "token_mod");
        operators.put("**", "token_pot");
    }

    private void fillExtraTokens(){
        otherTokens = new TreeMap<>();
        otherTokens.put("INTEGERVALUE", "token_integer");
        otherTokens.put("DOUBLEVALUE", "token_double");
        otherTokens.put("STRINGVALUE", "token_string");
        otherTokens.put("ID", "id");
    }

    private String getToken(String str) throws Exception{
        if(otherTokens.containsKey(str))
            return otherTokens.get(str);
        throw new Exception("Undefined token, impossible to parse " + str);
    }

    private String identify(int type, Map<String, Integer> tokenType) throws Exception{
        for(Map.Entry<String, Integer> e: tokenType.entrySet()){
            if(type == e.getValue()){
                return getToken(e.getKey());
            }
        }
        return "eof";
    }

    private void setFiles(String inputFilename, String outputFilename){
        this.inputFilename = inputFilename;
        this.outputFilename = outputFilename;
    }

    public LexerPractice(){
        fillKeywords();
        fillOperators();
        fillExtraTokens();
    }

    public String generateRandomString(){
        Random gen = new Random();
        StringBuilder builder = new StringBuilder();
        int size = gen.nextInt(50);
        for(int i = 0; i < size; i++)
            builder.append(" ");
        builder.append("\"");
        size = gen.nextInt(100);
        for(int i = 0; i < size; i++){
            int r = gen.nextInt(90);
            if(r != 2 && r != 60)
                builder.append((char)(r + 32));
        }
        return builder.toString();
    }

    public void printRandomStrings(int size){
        for(int i = 0; i < size; i++)
            System.out.println(generateRandomString() + "\"" );
    }

    public void generateOutput() throws Exception{
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFilename));
        TclV1 lexer = new TclV1(input);


        StringBuilder output = new StringBuilder();
        Token token;
        while((token = lexer.nextToken()).getType() != EOF_TYPE ){
            if(token.getType() == EOF_TYPE)
                break;
            String lexema = token.getText();
            if(keywords.contains(lexema)){
                output.append("<").append(lexema);
            }
            else if(operators.containsKey(lexema)){
                output.append("<").append(operators.get(lexema));
            }
            else{
                try{
                    String tokenType = identify(token.getType(), lexer.getTokenTypeMap());
                    output.append("<")
                            .append(tokenType)
                            .append(",")
                            .append((tokenType.equals("token_string") ? lexema.replaceAll("\"", "") : lexema  ));
                } catch (Exception e){
                    output.append(">>> Error lexico (")
                            .append("linea: ")
                            .append(token.getLine())
                            .append(", posicion: ")
                            .append(token.getCharPositionInLine() + 1)
                            .append(")\n");

                    PrintWriter writer = new PrintWriter(outputFilename, "UTF-8");
                    writer.print(output);
                    writer.close();
                    return;
                }
            }
            output.append(",")
                    .append(token.getLine())
                    .append(",")
                    .append(token.getCharPositionInLine() + 1)
                    .append(">")
                    .append("\n");
        }
        PrintWriter writer = new PrintWriter(outputFilename, "UTF-8");
        writer.print(output);
        writer.close();
    }

    public static void main(String[] args) throws Exception {
        final int[] SAMPLES = {5, 5, 4, 4, 8};
        final int NUMBER_OF_EXAMPLES = 7;
        final String directory = "lexer-test-cases/";
        final String samples_directory = "lexer-samples/";
        final String inputPrefix = "in0";
        final String outputPrefix = "out0";
        final String extension = ".txt";

        LexerPractice lexerPractice = new LexerPractice();

        lexerPractice.setFiles("lexer-test-cases/single-input.txt", "lexer-test-cases/output.txt");
        lexerPractice.generateOutput();

        for(char c = 'A'; c <= 'E'; c++){
            for(int i = 0 ; i < SAMPLES[(int)(c - 'A')]; i++){
                lexerPractice.setFiles(directory + "/" + String.valueOf(c) + "/"
                                         + inputPrefix + i + extension,
                                        directory + "/" + String.valueOf(c) + "/"
                                         + outputPrefix + i + extension);
                lexerPractice.generateOutput();
            }
        }
    }
}
