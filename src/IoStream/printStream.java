package IoStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class printStream {
    public static void main(String[] args) {
        try {
            PrintStream output = new PrintStream("patika.txt");
            output.print(23);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
