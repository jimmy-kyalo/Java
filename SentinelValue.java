import java.util.Scanner;

/**
 * program that reads and calculates the sum of an unspecified number of
 * integers. The input 0 signifies the end of the input.
 */
public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // read an initial value
        System.out.println("Enter an integer (input ends if it is 0) :");
        int data = input.nextInt();

        // keep reading data until input is 0
        int sum = 0;
        while (data != 0) {
            sum += data;
            // read the next data
            System.out.println("Enter an integer (input ends if it is 0) :");
            data = input.nextInt();
        }   //end of loop
        System.out.println("The sum is " + sum);    //display result
        input.close();
    }
}