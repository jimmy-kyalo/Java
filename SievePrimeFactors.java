
/** Algorithm of Sieve of Eratosthenes
input: an int n > 1
ouput: each prime numbers from 2 to n

Let A be an array of Boolean values indexed by intergers 2 to n.
    initially all set to true.
    for i = 2,3,4,..., not exceeding ?n do
        ifA[i] is true
            for j = i2, i2+i, i2+2i, i2+3i, ..., not exceeding n do
                A[i]: = false

    return all i such that A[i] is true

 */

import java.util.*;

public class SievePrimeFactors {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        long startTime = System.nanoTime();

        boolean[] bool = new boolean[num];

        for (int i = 0; i < bool.length; i++) {
            bool[i] = true;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (bool[i] == true) {
                for (int j = (i * i); j < num; j += i) {
                    bool[j] = false;
                }
            }
        }
        System.out.println("List of prime numbers upto given number are: ");
        for (int i = 2; i < bool.length; i++) {
            if (bool[i] == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println(executionTime);
        in.close();
    }
}