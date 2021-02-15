/**
 * Let the two input integers be n1 and n2. You know that number 1 is a common divisor, but
it may not be the greatest common divisor. Therefore, you can check whether k (for k = 2,
3, 4, and so on) is a common divisor for n1 and n2, until k is greater than n1 or n2. Store the
common divisor in a variable named gcd. Initially, gcd is 1. Whenever a new common divisor
is found, it becomes the new gcd. When you have checked all the possible common divisors
from 2 up to n1 or n2, the value in variable gcd is the greatest common divisor.

 */
import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int n1 = input.nextInt();
        System.out.println("Enter the second integer:");
        int n2 = input.nextInt();

        // initial gcd is 1
        int gcd = 1;
        // possible gcd
        int k = 2;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k ==0) {
                gcd = k;
            }
            k++;
        }
        System.out.println("The GCD of " + n1 + " & " + n2 + " is " + gcd);
        input.close();
    }
}