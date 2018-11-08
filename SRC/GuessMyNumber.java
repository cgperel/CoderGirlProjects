import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String playAgain = " ";
        do {
            int guessThis = (int) (Math.random() * 100) + 1;
            //System.out.println(guessThis);
            int guess = -1;
            System.out.println("Please guess a number between 1 and 100.");
            do {
                guess = keyboard.nextInt();
                if (guess < 1 || guess > 100) {
                    System.out.println("Oops that number isn't between 1 and 100");
                } else if (guess < guessThis) {
                    System.out.println("My number is higher");
                } else if (guess > guessThis) {
                    System.out.println("My number is lower");
                }
            } while (guess != guessThis);
            System.out.println("You guessed my number");
            System.out.println("Do you want to play again?");
            keyboard.skip("\n");
            playAgain = keyboard.nextLine();

//     Random Number = new Random(100);
            //   System.out.println("I'm thinking of a number between 1 and 100. What is it?");
            // System.out.println("Hint: The number is " + Number);

            // System.out.println("Guess:");
            // Scanner keyboard = new Scanner(System.in);
            // int Guess = keyboard.nextInt();

            //if {
            //  Number = Guess

        } while (playAgain.equals("yes"));
    }
}