import java.io.*;

public class TestFileStream {

    public static void main(String[] args) throws IOException {
        // create an output stream to the file
        try (FileOutputStream output = new FileOutputStream("temp.dat");) {
            // output values to the file
            for (int i = 1; i <= 10; i++) {
                output.write(i);
            }
        }
        // create an input stream for the file
        try (FileInputStream input = new FileInputStream("temp.dat");) {
            // read values from the file
            int value;
            while ((value = input.read()) != -1)
                System.out.print(value + " ");
        }
    }
}