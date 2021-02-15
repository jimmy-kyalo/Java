import java.util.Scanner;

public class RecursivePalindromeUsingSubstring {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.next();
        String t = s.toLowerCase();
        input.close();

        System.out.println("Is " + s + " a palindrome? " + "\n" + isPalindrome(t));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1)
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        else
            return isPalindrome(s.substring(1, s.length() - 1));

    }
}