// Tanner Elston, CSD402, 2/13/26

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a collection to hold Fan instances
        ArrayList<Fan> fanCollection = new ArrayList<>();

        // Add fans using both constructors and setters to demonstrate functionality

        // Default fan (no-arg constructor)
        fanCollection.add(new Fan());

        // Large blue fan at fast speed (parameterized constructor)
        fanCollection.add(new Fan(Fan.FAST, true, 10.0, "blue"));

        // Medium red fan (parameterized constructor)
        fanCollection.add(new Fan(Fan.MEDIUM, true, 7.5, "red"));

        // Small green fan that's off (parameterized constructor)
        fanCollection.add(new Fan(Fan.STOPPED, false, 5.0, "green"));

        // Custom fan built with setters
        Fan customFan = new Fan();
        customFan.setSpeed(Fan.FAST);
        customFan.setOn(true);
        customFan.setRadius(12.0);
        customFan.setColor("yellow");
        fanCollection.add(customFan);

        // Display all fans in the collection
        UseFans.displayFans(fanCollection);
    }
}