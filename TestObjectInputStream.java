import java.io.*;

public class TestObjectInputStream {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        // create an input stream for the file object.dat
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));) {
            // read a string, double value and object from the file
            String name = input.readUTF();
            double score = input.readDouble();
            java.util.Date date = (java.util.Date) (input.readObject());
            System.out.println(name + " " + score + " " + date);
        }
    }

}