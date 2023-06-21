import java.util.*;

public class ReverseDNA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dna;
        StringBuffer result;

        while (true) {
            System.out.println("Next DNA sequence: ");
            dna = scanner.next();

            if (dna.equalsIgnoreCase("STOP"))
                break;

            result = new StringBuffer(dna);
            result.reverse();

            System.out.println("RNA: " + result.toString());
            System.out.println("");
        }

        scanner.close();
    }
}