import java.util.Scanner;

public class Pass2DArray {
    public static void main(String[] args) {
        int[][] m = getArray();
        // dispay sum of elements
        System.out.println("\nSum of all elements is " + sum(m));
    }

    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);
        // enter array values
        int[][] m = new int[3][4];
        System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextInt();

        input.close();
        return m;
    }

    public static int sum(int[][] m) {
        int total = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                total += m[i][j];
            }
        }
        return total;
    }
}