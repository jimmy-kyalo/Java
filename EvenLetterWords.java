
/**
 * Constructs a new sentence from input words
 * that hava an even nuber of letters
 */
import java.util.Scanner;

public class EvenLetterWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean repeat = true;

        String word;

        StringBuffer tempStringBuffer = new StringBuffer("");

        while (repeat) {
            System.out.println("Next word: ");
            word = scanner.next();

            if (word.equalsIgnoreCase("STOP")) {
                repeat = false;
            } else if (word.length() % 2 == 0) {
                tempStringBuffer.append(word + " ");
            }
        }
        System.out.println("Output: " + tempStringBuffer);
        scanner.close();
    }
}