/**
 * Suppose the tuition for a university is KES 50,000 this year and tuition
 * increases 7% every year. In how many years will the tuition be doubled?
 * 
 */
public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 50000;
        int year = 0;
        while (tuition < 100000) {
            tuition *= 1.07;
            year++;
        }
        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be KES %.2f after %1d years.\n", tuition, year);
    }
}