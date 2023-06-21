import java.util.*;

public class PalindromeIgnoreNonAlphanumeric {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("Ignoring nonalphanumeric characters, \nis " + s + " a palindrome? " + isPalindrome(s));
        input.close();
    }

    // return true if a string is a palindrome
    public static boolean isPalindrome(String s) {
        // create a new string eliminating nonalphanumeric chars
        String s1 = filter(s);
        // create a new string that is the reversal of s1
        String s2 = reverse(s1);
        // check if recersal is the same as the original string
        return s2.equals(s1);
    }

    // create a new string eliminating nonalphanumeric chars
    public static String filter(String s) {
        // create a string builder
        StringBuilder strBuilder = new StringBuilder();

        // examine each char in the string to skip alphanumeric char
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                strBuilder.append(s.charAt(i));
            }
        }
        // return a new filtered string
        return strBuilder.toString();
    }

    // create a new string by reversing a specified string
    public static String reverse(String s) {
        StringBuilder strBuilder = new StringBuilder(s);
        strBuilder.reverse();
        return strBuilder.toString();
    }
}