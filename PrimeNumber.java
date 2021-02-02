public class PrimeNumber {
    public static void main(String[] args) {
        // number of primes to display
        final int NUMBER_OF_PRIMES = 50;
        // display 10 per line
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        // count the number of prime numbers
        int count = 0;
        // number to be tested for primeness
        int number = 2;

        System.out.println("The first 50 prime numbers are: ");

        // repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;

            // test whether number is prime
            for (int divisor = 2; divisor <= number / 2 && isPrime; divisor++)
                if (number % divisor == 0) {
                    isPrime = false;
                }

            // display the prime no, increase the count
            if (isPrime) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // display the number, advance to next line
                    System.out.println(number);
                } else
                    System.out.print(number + " ");
            }
            // check if next number is prime
            number++;
        }
    }
}
