import java.util.*;

public class CountJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int javaCount = 0;

        String word;

        while (true) {
            System.out.print("Next word: ");
            word = scanner.next();

            if (word.equalsIgnoreCase("STOP")) {
                break;
            } else if (word.equalsIgnoreCase("Java")) {
                javaCount++;
            }
        }
        System.out.println("'Java' count: " + javaCount);
        scanner.close();
    }
}