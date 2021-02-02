import java.text.DecimalFormat;

public class CelsFahrenheit {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");

        double farenheit;
        int cel = 0;

        System.out.println("Celsius     Farenheit");
        while (cel < 101) {
            farenheit = cel * 9.0 / 5.0 + 32;
            System.out.println(cel + "\t\t" + df.format(farenheit));
            cel += 2;
        }

    }
}