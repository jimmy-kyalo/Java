import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("[,\n]");

        int[] numbers = new int[3];

        System.out.println("Enter three numbers");
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();

        System.out.println("");

        int sum = numbers[0] + numbers[1] + numbers[2];

        System.out.println("The sum of " + Arrays.toString(numbers) + " is " + sum);
        scanner.close();
    }

}