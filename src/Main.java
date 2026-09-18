import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Optional;

enum TokenType{
    _return,
    int_lit,
    semicolon
}

class Token{
    public TokenType type;
    public Optional<String> value;
}

public class Main {
    //lexer function
    public static ArrayList<Token> toTokens(String str){
        for(char c : str.toCharArray())
            System.out.println(c);
        return null;
    }

    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Incorrect usage! - Correct usage samle - oyl <sample.oyl>");
            System.exit(1);
        }
        String contents = Files.readString(Path.of(args[0]));
        toTokens(contents);
        System.exit(0);
    }
}
