package IoStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class bufferedInput {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("patika.txt");
            BufferedInputStream buffInput = new BufferedInputStream(fileInput);

            int i = buffInput.read();
            while (i != -1){
                System.out.print ((char)i);
                i = buffInput.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
