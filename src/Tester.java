import java.io.FileNotFoundException;
import java.io.IOException;

public class Tester {

    public static void main(String[] args) throws IOException {

        Lexer analyzer = new Lexer();
        String filePath = args[0];

        if (analyzer.initialize(filePath)) {

            Token token;
            try {
                while ((token = analyzer.nextToken()) != null) {
                    System.out.println(token);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else
            System.out.println("File not found!!");
    }

}