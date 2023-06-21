import java.util.*;

public class CountWords {
    public static final char BLANK = ' ';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));

        int index, wordCount, numberOfChars;

        System.out.println("Enter a sentence: ");
        String sentence = scanner.next();

        numberOfChars = sentence.length();

        index = 0;
        wordCount = 0;

        while (index < numberOfChars) {
            // ignore blank spaces
            while (index < numberOfChars && sentence.charAt(index) == BLANK) {
                index++;
            }
            // locate the end of the word
            while (index < numberOfChars && sentence.charAt(index) != BLANK) {
                index++;
            }
            // another word is found so increment the counter
            wordCount++;
        }
        // display result
        System.out.println("\n input sentence: " + sentence);
        System.out.println("       Word Count: " + wordCount + " words");
        scanner.close();
    }
}