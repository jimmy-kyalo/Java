import java.util.*;
import java.util.logging.Logger;
import java.math.*;

public class LargeFactorial {

    public static void main(String[] args) {
        Logger l = Logger.getLogger(LargeFactorial.class.getName());
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        l.info(n + "! is \n" + factorial(n));
        input.close();
    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}