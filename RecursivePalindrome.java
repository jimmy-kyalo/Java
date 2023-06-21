import java.util.Scanner;

public class RecursivePalindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.next();
        String t = s.toLowerCase();
        input.close();

        System.out.println("Is " + s + " a palindrome? " + "\n" + isPalindrome(t));
    }

    private static boolean isPalindrome(String s, int low, int high) {
        if (high <= low)
            return true;
        else if (s.charAt(low) != s.charAt(high))
            return false;
        else
            return isPalindrome(s, low + 1, high - 1);
    }

    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }
}