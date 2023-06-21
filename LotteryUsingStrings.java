import java.util.Scanner;

public class LotteryUsingStrings {
    public static void main(String[] args) {
        String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery picks (two digits)");
        String guess = input.nextLine();

        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        System.out.println("The lottery number is " + lottery);

        if (guess.equals(lottery))
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