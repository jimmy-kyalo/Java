import java.util.Scanner;

public class ComputeAndInterpreteBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();

        final double KG_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0245;

        double weightKgs = weight * KG_PER_POUND;
        double heightMeters = height * METERS_PER_INCH;
        double bmi = weightKgs / Math.pow(heightMeters, 2);

        System.out.println("BMI is " + (int)(bmi * 1000) / 1000.0);
        if (bmi < 18.0)
            System.out.println("Underweight");
        else if (bmi < 25.0)
            System.out.println("Normal");
        else if (bmi < 30.0)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

        input.close();
    }
}