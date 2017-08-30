import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by larra on 29/08/2017.
 */


public class LexerPractice {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("lexer-test-cases/in.txt"));
        TclV1 lexer = new TclV1(input);
        for(Token token : lexer.getAllTokens()){
            System.out.println(token.getText());
        }
    }
}
