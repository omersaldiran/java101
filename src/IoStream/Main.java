package IoStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Mercedes","C200");

        try {
            FileOutputStream outputFile = new FileOutputStream("araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputFile);
            output.writeObject(c1);
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
