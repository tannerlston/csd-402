import java.util.Scanner;

public class HeatingWaterJoules {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("\nWelcome! This program calculates the energy required to heat liquid water (in Joules).");
        System.out.println("(Valid Range: 0°C to 100°C)\n");

        // Get initial liquid temperature
        double initialTemp = getLiquidTemperature(myObj, "Enter Initial Temperature (Celsius):");

        // Get final liquid temperature (must be higher than initial)
        double finalTemp;
        do {
            finalTemp = getLiquidTemperature(myObj, "Enter Final Temperature (Celsius):");

            if (finalTemp <= initialTemp) {
                System.out.println("Error: The final temperature must be higher than " + initialTemp + "°C to heat the water.\n");
            }
        } while (finalTemp <= initialTemp);

        // Get mass
        System.out.println("Enter water mass in Kilograms:");
        double waterMass = myObj.nextDouble();

        // Calculate and format output
        double joule = (finalTemp - initialTemp) * waterMass * 4184;

        System.out.printf("Energy required: %,.2f Joules%n", joule);

        myObj.close();
    }

    // Validates that input is a number AND between 0 and 100.
    public static double getLiquidTemperature(Scanner sc, String prompt) {
        double input;
        while (true) {
            System.out.println(prompt);

            // Check if input is a valid number
            if (!sc.hasNextDouble()) {
                System.out.println("Error: Please enter a numeric value.\n");
                sc.next(); // Clear invalid input
                continue;
            }

            input = sc.nextDouble();

            // Check if temperature is in the liquid range
            if (input < 0 || input > 100) {
                System.out.println("Error: " + input + "°C is not liquid! Enter a value between 0 and 100.\n");
            } else {
                return input; // Valid liquid temperature
            }
        }
    }
}
