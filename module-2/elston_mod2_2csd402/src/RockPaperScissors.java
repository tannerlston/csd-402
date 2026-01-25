import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Initialize scanner for user input and random number generator
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate computer's choice (1, 2, or 3)
        int computerChoice = random.nextInt(3) + 1;
        int userChoice = 0;
        boolean validInput = false;

        // Loop until user enters valid input
        while (!validInput) {
            System.out.print("Enter your choice (1 = Rock, 2 = Paper, 3 = Scissors): ");
            try {
                // Attempt to read user's integer input
                userChoice = scanner.nextInt();
                // Check if input is within valid range
                if (userChoice >= 1 && userChoice <= 3) {
                    validInput = true;
                } else {
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }
            } catch (InputMismatchException e) {
                // Handle non-numeric input
                System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
                scanner.next(); // Clear the invalid input from scanner
            }
        }

        // Convert numeric choices to readable names
        String computerName = choiceName(computerChoice);
        String userName = choiceName(userChoice);

        // Display both choices and the result
        System.out.println("Computer chose: " + computerName);
        System.out.println("You chose: " + userName);
        System.out.println(resultMessage(computerChoice, userChoice));

        // Close scanner to free resources
        scanner.close();
    }

    // Converts numeric choice (1, 2, 3) to corresponding name (Rock, Paper, Scissors)
    private static String choiceName(int choice) {
        return switch (choice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissors";
            default -> "Invalid";
        };
    }

    // Determines and returns the game result based on both players' choices
    private static String resultMessage(int computerChoice, int userChoice) {
        // Validate user choice is within range
        if (userChoice < 1 || userChoice > 3) {
            return "Invalid choice. Please run again and enter 1, 2, or 3.";
        }
        // Check for tie
        if (computerChoice == userChoice) {
            return "Result: It's a tie.";
        }

        // Determine if user wins based on game rules
        // Rock beats Scissors, Paper beats Rock, Scissors beats Paper
        boolean userWins =
                (userChoice == 1 && computerChoice == 3)
                        || (userChoice == 2 && computerChoice == 1)
                        || (userChoice == 3 && computerChoice == 2);
        return userWins ? "Result: You win." : "Result: Computer wins.";
    }
}