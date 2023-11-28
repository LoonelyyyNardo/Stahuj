import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class VypisDoSouboru {
    static String soubor = "text.txt";
    public static void main(String[] args) {
        try (PrintWriter writter = new PrintWriter(new BufferedWriter(new FileWriter(soubor)))){
            writter.println("Hello Martin Rygulski!");
        }

         catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
