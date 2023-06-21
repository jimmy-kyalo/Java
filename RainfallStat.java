import java.util.*;

public class RainfallStat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] rainfall = new double[12];
        String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        double annualAvg, sum;
        double[] quarterAvg = new double[4];
        double oddMonthSum, oddMonthAvg, evenMonthSum, evenMonthAvg;

        sum = 0.0;

        for (int i = 0; i < 12; i++) {
            System.out.println("Rainfall for " + monthName[i] + ": ");
            rainfall[i] = scanner.nextDouble();

            sum += rainfall[i];
        }

        annualAvg = sum / 12.0;
        System.out.format("Annual Average Rainfall: %5.2f\n\n", annualAvg);

        oddMonthSum = 0.0;
        evenMonthSum = 0.0;

        // compute the average for the odd months
        for (int i = 0; i < rainfall.length; i += 2) {
            oddMonthSum += rainfall[i];
        }
        oddMonthAvg = oddMonthSum / 6.0;

        // compute the average for the even months
        for (int i = 0; i < rainfall.length; i += 2) {
            evenMonthSum += rainfall[i];
        }
        evenMonthAvg = evenMonthSum / 6.0;

        System.out.format("Odd Month Rainfall Average: %6.2f\n", oddMonthAvg);
        System.out.format("Even Month Rainfall Average: %6.2f\n", evenMonthAvg);

        /** Quarter Averages */
        for (int i = 0; i < 4; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += rainfall[3 * i + j];
            }
            quarterAvg[i] = sum / 3.0;
            System.out.format("Rainfall average Qtr.%3d:%6.2f\n", i + 1, quarterAvg[i]);
        }
        scanner.close();
    }
}
