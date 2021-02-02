import java.util.*;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));

        String name, nameUpper;

        int numberOfCharacters, vowelCount = 0;

        char letter;

        System.out.println("What is your name?");
        name = scanner.next();

        numberOfCharacters = name.length();
        nameUpper = name.toUpperCase();

        for (int i = 0; i < numberOfCharacters; i++) {
            letter = nameUpper.charAt(i);
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                vowelCount++;
            }
        }
        System.out.println(name + ", your name has " + vowelCount + " vowels");
        scanner.close();
    }
}