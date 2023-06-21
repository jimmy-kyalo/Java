import java.io.*;

public class WriteData {

    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        try (
                // create a file
                PrintWriter output = new PrintWriter(file);) {

            // write formatted output to the file
            output.print("Jimmy K Wambua ");
            output.println(90);
            output.print("John D Doe ");
            output.println(85);
        }
    }
}