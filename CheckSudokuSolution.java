import java.util.Scanner;

public class CheckSudokuSolution {

    public static void main(String[] args) {
        int[][] grid = readSolution();
        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }

    // read a sudoku solution from the console
    public static int[][] readSolution() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt();

        input.close();

        return grid;
    }

    // check whether a solution is valid
    public static boolean isValid(int[][] grid) {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j, grid))
                    return false;

        return true;

    }

    // check whether grid[i][j] is valid in the grid
    public static boolean isValid(int i, int j, int[][] grid) {
        // check whether grid[i][j] is unique in i's row
        for (int column = 0; column < 9; column++) {
            if (column != j && grid[i][column] == grid[i][j])
                return false;
        }
        // check whether grid[i][j] is unique in j's column
        for (int row = 0; row < 9; row++) {
            if (row != i && grid[row][j] == grid[i][j])
                return false;

        }
        // check whether grid[i][j] is unique in the 3x3 box
        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
            for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++) {
                if (!(row == i && col == j) && grid[row][col] == grid[i][j])
                    return false;
            }
        }
        return true;
    }
}

/** Test with sudoku below */

// 1 2 3 4 5 6 7 8 9
// 4 5 6 7 8 9 1 2 3
// 7 8 9 1 2 3 4 5 6
// 5 3 1 2 6 4 8 9 7
// 2 9 7 8 3 1 5 6 4
// 8 6 4 5 9 7 2 3 1
// 3 1 2 6 4 5 9 7 8
// 6 4 5 9 7 8 3 1 2
// 9 7 8 3 1 2 6 4 5
