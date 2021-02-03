import java.io.*;

public class TestObjectOutputStream {

    public static void main(String[] args) throws IOException {
        // create output stream for file object.dat
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));) {
            // write a string, double value and object to the file
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeObject(new java.util.Date());
        }
    }
}