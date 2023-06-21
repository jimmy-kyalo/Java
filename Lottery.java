import java.util.*;

public class Lottery {
    public static void main(String[] args) {
        // generate a lottery number
        int lottery = (int)(Math.random() * 100);

        // prompt user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick(two digits)");
        int guess = input.nextInt();

        // get digits from lottery number
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        // get digits from user's guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery)
            System.out.println("Exact match. You win KES 10000");
        else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)
            System.out.println("Match all digits. You win KES 3000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit1)
            System.out.println("Match one digit. You win KES 1000");
        else
            System.out.println("Sorry. NO match");
        input.close();

    }    
}