import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program 1: Shopping Cart Menu
 *
 * Requirements demonstrated:
 * 1. ArrayList<String> filled with 10+ item names
 * 2. for-each loop to print the ArrayList collection
 * 3. Ask the user which element they would like to see again
 * 4. try/catch prints the element if valid, or "Out of Bounds" if invalid
 * 5. Autoboxing/Auto-Unboxing used with the user's String input
 */
public class Program1 {

    public static void main(String[] args) {

        // Requirement 1: ArrayList<String> with 10+ item names
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Burger");
        menuItems.add("Pizza");
        menuItems.add("Pasta");
        menuItems.add("Salad");
        menuItems.add("Sushi");
        menuItems.add("Tacos");
        menuItems.add("Sandwich");
        menuItems.add("Soup");
        menuItems.add("Steak");
        menuItems.add("Ice Cream");

        // Requirement 2: for-each loop to print the ArrayList collection
        System.out.println("=== Shopping Cart Menu ===");
        int index = 0;
        for (String item : menuItems) {
            System.out.println("[" + index + "] " + item);
            index++;
        }

        // Requirement 3: Ask the user which element they would like to see again
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index of the item you would like to see again: ");
        String userInput = scanner.nextLine();

        // Src: https://www.w3schools.com/java/java_try_catch.asp
        // Src: https://www.geeksforgeeks.org/java/autoboxing-unboxing-java/

        // Requirement 4: try/catch - display the element or "Out of Bounds"
        try {
            // Requirement 5: Autoboxing - user's String input is parsed to int,
            // then boxed into an Integer object
            Integer boxedIndex = Integer.parseInt(userInput);

            // Requirement 5: Auto-unboxing - Integer -> int to use as ArrayList index
            String selectedItem = menuItems.get(boxedIndex);

            // Display the selected element back to the user
            System.out.println("\nYou selected: " + selectedItem);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Exception thrown: Out of Bounds");
        }
    }
}