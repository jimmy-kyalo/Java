import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user to enter a string
        System.out.print("Enter a string: ");
        String hex = input.nextLine();

        System.out.println("The decimal value of hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
        input.close();
    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'B')
            return 10 + ch - 'A';
        else
            return ch - 'O';
    }
}