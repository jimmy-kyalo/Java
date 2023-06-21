import java.util.Scanner;

public class ComputeFibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonnaci number: ");
        int index = input.nextInt();
        input.close();

        // find and display the Fibonacci number
        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
    }

    public static long fib(int index) {
        if (index == 0)
            return 0;
        else if (index == 1)
            return 1;
        else
            return fib(index - 1) + fib(index - 2);
    }
}