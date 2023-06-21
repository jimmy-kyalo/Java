
/**
 * Extract the words in a given sentence and
print them, using one line per word.

 */
import java.util.*;

public class ExtractWords {
    public static final char BLANK = ' ';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));

        int index, numberOfChars, beginIndex, endIndex;

        String word, sentence;
        System.out.println("Input: ");
        sentence = scanner.next();

        numberOfChars = sentence.length();
        index = 0;

        while (index < numberOfChars) {
            // ignore leading blank spaces
            while (index < numberOfChars && sentence.charAt(index) == BLANK) {
                index++;
            }
            beginIndex = index;
            // locate the end of the word
            while (index < numberOfChars && sentence.charAt(index) != BLANK) {
                index++;
            }
            endIndex = index;
            if (beginIndex != endIndex) {
                // another word is found, extract it from the sentence and print it out
                word = sentence.substring(beginIndex, endIndex);
                System.out.println(word);
            }
        }
        scanner.close();
    }
}