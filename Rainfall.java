import java.util.*;

public class Rainfall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] rainfall = new double[12];
        String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        double annualAvg, sum, difference;

        sum = 0.0;

        for (int i = 0; i < 12; i++) {
            System.out.println("Rainfall for " + monthName[i] + ": ");
            rainfall[i] = scanner.nextDouble();

            sum += rainfall[i];
        }

        annualAvg = sum / 12.0;
        System.out.format("Annual Average Rainfall: %5.2f\n\n", annualAvg);

        for (int i = 0; i < 12; i++) {
            System.out.format("%.3s", monthName[i]);
            // avg rainfall for the month
            System.out.format("%15.2f", rainfall[i]);
            // difference btw monthly and annual avgs
            difference = Math.abs(rainfall[i] - annualAvg);
            System.out.format("%15.2f\n", difference);
        }
        scanner.close();
    }
}