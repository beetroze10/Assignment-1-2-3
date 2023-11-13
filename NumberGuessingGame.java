import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Code for reading input.
        Random random = new Random();
        // The 'Random' class is imported from the 'java.util' package.
       // It is used here to generate a random number for the guessing game.
      // The 'nextInt(21)' method generates a random integer between 0 (inclusive) and 21 (exclusive).

        int maxAttempts = 5;
        int randomNumber = random.nextInt(21);  // Generates a random number between 0 and 20
        int userGuess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 0 and 20.");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Enter your guess (Attempt " + attempt + "): ");
            userGuess = scanner.nextInt();

            if (userGuess < 0 || userGuess > 20) {
                System.out.println("Invalid number. Please enter a number between 0 and 20.");
                attempt--;  // Decrement attempt to allow the user to try again without consuming the attempt
            } else {
                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number. You win!");
                    
                } else {
                    System.out.println("Incorrect guess. Try again.");
                }
            }

            if (attempt == maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
            }
        }

        scanner.close();
        // Closing the Scanner to release associated resources.
    }
}
