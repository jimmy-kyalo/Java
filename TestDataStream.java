import java.io.*;

public class TestDataStream {
    public static void main(String[] args) throws IOException {
        // create an output stream for file temp.dat
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));) {
            // write student test scores to the file
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Jim");
            output.writeDouble(185.5);
            output.writeUTF("George");
            output.writeDouble(105.5);
        }
        // create an input stream for the file temp.dat
        try (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));) {
            // read student test scores from the file
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        }
    }

}