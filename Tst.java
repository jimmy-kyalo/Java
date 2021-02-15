public class Tst {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextInt();
                System.out.print(matrix[row][col] + " ");
                total += matrix[row][col];
            }
            System.out.println();
        }
        System.out.println(total);
        input.close();
    }
}