import java.util.Scanner;

public class QuotientWithMethod {

    public static int quotient(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Divisor cannot be zero");
            System.exit(1);
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int result = quotient(num1, num2);
        System.out.println(num1 + " / " + num2 + " is " + result);
    }
}