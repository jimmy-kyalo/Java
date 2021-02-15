import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal number:");
        int decimal = input.nextInt();

        String hex = "";

        while (decimal != 0) {
            int hexValue = decimal % 16;

            // convert dec value to hex
            char hexDigit = (0 <= hexValue && hexValue <= 9) ? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
            hex = hexDigit + hex;
            decimal = decimal / 16;
        }
        System.out.println("The hex number is " + hex);
        input.close();
    }
}