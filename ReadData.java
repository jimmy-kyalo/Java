import java.util.*;
import java.io.*;

public class ReadData {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("scores.txt"));

        while (input.hasNext()) {
            String firstName = input.next();
            String middleName = input.next();
            String lastName = input.next();
            int score = input.nextInt();

            System.out.println(firstName + " " + middleName + " " + lastName + " " + score);
        }

        input.close();
    }
}