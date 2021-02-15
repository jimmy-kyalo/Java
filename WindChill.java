import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between - 58°F and 41°F:");
        double temp = input.nextDouble();

        System.out.println("Enter the wind speed ( >= 2) in miles per hour:");
        int speed = input.nextInt();

        double windChillTemp = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * temp * Math.pow(speed, 0.16));

        System.out.println("The wind chill index is " + (int)(windChillTemp * 100000) / 100000.0);
        input.close();
    }
}