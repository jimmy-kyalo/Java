public class PrimeNumbersMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are: ");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0; // count no of prime numbers
        int num = 2; // num to be tested for primeness

        // repeatedly find prime numbers
        while (count < numberOfPrimes) {
            if (isPrime(num)) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
                    System.out.printf("%-8d\n", num);
                else
                    System.out.printf("%-8d", num);
            }
            // check whether the next num is prime
            num++;
        }
    }

    // check whether a number is prime
    public static boolean isPrime(int num) {
        for (int divisor = 2; divisor <= num / 2; divisor++) {
            if (num % divisor == 0) { // if true num is not prime
                return false; // num is not prime
            }
        }
        return true; // num is prime
    }
}
