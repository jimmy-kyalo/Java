// import java.util.Scanner;

public class Pattern47
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        // Scanner scanner = new Scanner(System.in);
        // Get the number of rows from the user
        System.out.println("Enter the number of rows to print the pattern ");
        // int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 1; i <= 8; i++)
        {
            for (int j = 8; j > i; j--)
            {
                System.out.print("\t");
            }
            int val1 = 1;
            for (int k = 1; k <= i; k++)
            {

                System.out.print(val1 + "\t");
                val1 = val1 * 3;
            }
            val1 /= 3;
            for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(val1 + "\t");
                val1 = val1 / 3;
            }
                        val1 = val1 / 3;

            System.out.println();
            // scanner.close();
        }
    }
}