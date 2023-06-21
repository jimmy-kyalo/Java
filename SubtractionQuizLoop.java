import java.util.Scanner;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
        // number of questions
        final int NUMBER_OF_QUESTIONS = 5;
        // count number of correct answers
        int correctCount = 0;
        // count number of questions
        int count = 0;
        long startTime = System.currentTimeMillis();
        // output string is initially empty
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            // generate two random double digit integers
            int num1 = (int) (Math.random() * 100);
            int num2 = (int) (Math.random() * 100);

            // if num1 < num2, swap num1 with num2
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.println("What is " + num1 + " - " + num2 + "? ");
            int answer = input.nextInt();

            if (num1 - num2 == answer) {
                System.out.println("You are correct!");
                // increase the correct answer count
                correctCount++;
            } else
                System.out.println("You are wrong.\n" + num1 + " - " + num2 + " should be " + (num1 - num2));
            // increase question count
            count++; // increase control variable

            output += "\n" + num1 + "–" + num2 + "=" + answer + ((num1 - num2 == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println(
                "Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
        input.close();
    }
}