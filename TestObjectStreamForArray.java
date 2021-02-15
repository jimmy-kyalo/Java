import java.io.*;

public class TestObjectStreamForArray {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        int[] numbers = { 1, 2, 3, 4, 5 };
        String[] strings = { "John", "Simon", "Peter" };

        // create an output stream for the file array.dat
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("array.bat"));) {
            // write arrays to the object output stream
            output.writeObject(numbers);
            output.writeObject(strings);
        }

        // create an input stream for array.dat
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("array.bat"));) {
            int[] newNumbers = (int[]) (input.readObject());
            String[] newStrings = (String[]) (input.readObject());

            // display arrays
            for (int i = 0; i < newNumbers.length; i++)
                System.out.print(newNumbers[i] + " ");
            System.out.println();

            for (int j = 0; j < newStrings.length; j++)
                System.out.print(newStrings[j] + " ");
        }
    }
}