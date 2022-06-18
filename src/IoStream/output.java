package IoStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class output {
    public static void main(String[] args) {
        String yazi = "Output Stream Öğreniyorum!\npatika.dev";

        try {
            FileOutputStream output = new FileOutputStream("patika.txt",true);
            byte[] yaziByte = yazi.getBytes();
            output.write(yaziByte);
            output.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
