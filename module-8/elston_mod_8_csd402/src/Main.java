// Tanner Elston, CSD402, 2/19/26

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers one at a time. Enter 0 to stop.");

        // Collect user input until 0 is entered, adding each value including 0 to the list
        while (true) {
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();
            numbers.add(input);
            if (input == 0) {
                break;
            }
        }

        System.out.println("ArrayList contents: " + numbers);
        System.out.println("Largest value: " + TannerArrayListTest.max(numbers));

        scanner.close();
    }
}