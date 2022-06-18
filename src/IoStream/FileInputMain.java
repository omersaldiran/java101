package IoStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileInputMain {
    public static void main(String[] args) {
        Car c1 = new Car("Mercedes","C200");
        FileInputStream inputFile;

        {
            try {
                inputFile = new FileInputStream("araba.txt");
                ObjectInputStream inputStream = new ObjectInputStream(inputFile);
                Car newCar = (Car) inputStream.readObject();
                System.out.println(newCar.getBrand());
                System.out.println(newCar.getModel());

                inputFile.close();
                inputStream.close();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
