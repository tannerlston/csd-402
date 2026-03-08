import java.util.Scanner;

/**
 * Main entry point. Prompts the user to launch either:
 * - The Shopping Cart (Program1)
 * - The Random Number File Generator (Program2)
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome ===");
        System.out.println("[1] Shopping Cart");
        System.out.println("[2] Random Number File Generator");
        System.out.print("\nWhich program would you like to run? (1 or 2): ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println("\nLaunching Shopping Cart...\n");
                Program1.main(args);
                break;
            case "2":
                System.out.println("\nLaunching Random Number File Generator...\n");
                Program2.main(args);
                break;
            default:
                System.out.println("Invalid selection. Please enter 1 or 2.");
        }

        scanner.close();
    }
}