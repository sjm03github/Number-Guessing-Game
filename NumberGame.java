import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean playAgain = true;

        while (playAgain) {
            int tryCount = 0;
            int randomNumber = rand.nextInt(100) + 1;

            while (true) {
                System.out.println("Enter Your Guess between 1 - 100: ");
                int playerGuess = sc.nextInt();
                tryCount++;

                if (playerGuess == randomNumber) {
                    System.out.println("Congratulations! You Guessed it! You Win");
                    System.out.println("Random Number : " + randomNumber + "\t Guessed Number: " + playerGuess);
                    System.out.println("Your Score: " + tryCount);
                    break;
                } else if (randomNumber > playerGuess) {
                    System.out.println("Nope! The Number is Higher. Guess Again");
                } else {
                    System.out.println("Nope! The Number is Lower. Guess Again");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = sc.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        sc.close();
    }
}
