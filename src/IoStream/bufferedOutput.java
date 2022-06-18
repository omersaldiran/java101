package IoStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferedOutput {
    public static void main(String[] args) {
        String data = "Java 102 Data";

        try {
            FileOutputStream fileOutput = new FileOutputStream("patika.txt");
            BufferedOutputStream buffOut = new BufferedOutputStream(fileOutput);
            byte[] byteArr = data.getBytes();
            buffOut.write(byteArr);
            buffOut.close();


        } catch (IOException e) {
           e.printStackTrace();
        }

    }
}
