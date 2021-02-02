import java.text.DecimalFormat;
import java.util.Scanner;

public class GCDMethod {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        long startTime = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer");
        int n1 = input.nextInt();

        System.out.println("Enter the second integer");
        int n2 = input.nextInt();
        long endTime = System.currentTimeMillis();
        double testTime = (endTime - startTime) / 1000.0;

        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd(n1, n2) + "\nProgram took "
                + df.format(testTime) + " seconds");
        input.close();
    }

    public static int gcd(int n1, int n2) {
        int gcd = 1; // initial gcd
        int k = 2; // possible gcd

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k; // update gcd
            k++;
        }

        return gcd;

    }
}