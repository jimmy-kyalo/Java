import java.io.*;

public class TestRandomAccessFile {
    public static void main(String[] args) throws IOException {
        // create a random access file
        try (RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw")) {
            // clear the file to destroy old contents
            inout.setLength(0);

            // write new integers to the file
            for (int i = 0; i < 200; i++) {
                inout.writeInt(i);
            }

            // display current length of the file
            System.out.println("Current file length is " + inout.length());

            // retrieve the first number
            inout.seek(0); // move file pointer to 1st number
            System.out.println("The first number is " + inout.readInt());

            // retrieve the second number
            inout.seek(1 * 4); // move the file pointer to the 2nd number
            System.out.println("The second number is " + inout.readInt());

            // retrieve the 10th number
            inout.seek(9 * 4);
            System.out.println("The 10th number is " + inout.readInt());

            // modify the 11th number
            inout.writeInt(555);

            // append a new number
            inout.seek(inout.length()); // move file pointer to the end
            inout.writeInt(999);

            // display the new length
            System.out.println("The new length is " + inout.length());

            // retrieve the 11th number
            inout.seek(10 * 4);
            System.out.println("The eleventh number is " + inout.readInt());
        }
    }

}