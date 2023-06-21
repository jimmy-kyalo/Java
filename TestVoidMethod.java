import java.util.Scanner;

public class TestVoidMethod {
    public static void main(String[] args) {
        System.out.println("Enter your score to get your grade:");
        Scanner input = new Scanner(System.in);
        double score = input.nextDouble();
        printGrade(score);
        input.close();
        
    }

    public static void printGrade(double score) {
        

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
            return;
        }
        if (score >= 90.0) {
            System.out.println("A");
        } else if (score >= 80.0) {
            System.out.println("B");
        } else if (score >= 70.0) {
            System.out.println("C");
        } else if (score >= 60.0) {
            System.out.println("D");
        }
        else
        System.out.println("F");
    }
}