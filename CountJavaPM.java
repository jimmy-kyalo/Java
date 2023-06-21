
/*
Count the number of times the word 'java' occurs
in input sentence using pattern matching.
 */

import java.util.*;
import java.util.regex.*;

public class CountJavaPM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));

        String document;
        int javaCount;

        Matcher matcher;
        Pattern pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);

        System.out.println("Sentence: ");
        document = scanner.next();

        javaCount = 0;
        matcher = pattern.matcher(document);

        while (matcher.find()) {
            javaCount++;
        }
        System.out.println("The word 'Java' occured " + javaCount + " times.");
        scanner.close();
    }
}