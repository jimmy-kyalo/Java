import java.util.*;

public class TranscribeDNA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dna;
        StringBuffer rna;

        int size;
        int base;

        while (true) {
            System.out.println("Next DNA sequence: ");
            dna = scanner.next();

            if (dna.equalsIgnoreCase("STOP"))
                break;

            size = dna.length();
            rna = new StringBuffer();

            // scan thru each letter and replace T with U
            for (int i = 0; i < size; i++) {
                base = dna.charAt(i);
                if (base == 'T') {
                    base = 'U';
                }
                rna.append(base);
            }
            System.out.println("RNA:" + rna.toString());
            System.out.println("");
        }
        scanner.close();
    }
}