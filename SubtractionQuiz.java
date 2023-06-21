import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        // generate two random double digit integers
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);

        // if num1 < num2, swap num1 with num2
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        System.out.println("What is " + num1 + " - " + num2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (num1 - num2 == answer)
            System.out.println("You are correct!");
        else{
            System.out.println("You are wrong.");
            System.out.println(num1 + " - " + num2 + " should be " + (num1 - num2));
        }
        input.close();
    }
}