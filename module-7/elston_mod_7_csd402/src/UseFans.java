// Tanner Elston, CSD402, 2/13/26

import java.util.Collection;

public class UseFans {

    // Constant array for speed names
    private static final String[] SPEED_NAMES = {"STOPPED", "SLOW", "MEDIUM", "FAST"};

    // Helper method to convert speed number to name
    private static String getSpeedName(int speed) {
        if (speed >= 0 && speed < SPEED_NAMES.length) {
            return SPEED_NAMES[speed];
        }
        return "SPEED NAME UNKNOWN";
    }

    // Method to display a single Fan instance without using toString()
    public static void displayFan(Fan fan) {
        if (fan == null) {
            System.out.println("Error: Cannot display null fan");
            return;
        }

        System.out.println("Fan Details:");
        System.out.println("  Speed: " + getSpeedName(fan.getSpeed()) + " (" + fan.getSpeed() + ")");
        System.out.println("  On: " + fan.isOn());
        System.out.println("  Radius: " + fan.getRadius());
        System.out.println("  Color: " + fan.getColor());
    }

    // Method to display a collection of Fan instances without using toString()
    public static void displayFans(Collection<Fan> fans) {
        if (fans == null) {
            System.out.println("Error: Cannot display null collection");
            return;
        }

        System.out.println("=== Displaying Collection of Fans ===");
        System.out.println("Total Fans: " + fans.size() + "\n");

        int fanNumber = 1;
        for (Fan fan : fans) {
            System.out.println("--- Fan #" + fanNumber++ + " ---");
            displayFan(fan);
            System.out.println();
        }
    }

}