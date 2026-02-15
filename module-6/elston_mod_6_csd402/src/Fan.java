// Tanner Elston, CSD402, 2/6/26


public class Fan {
    // Constants for fan speed settings
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields with default values
    private int speed = STOPPED;      // Default speed is STOPPED (0)
    private boolean on = false;        // Default is off
    private double radius = 6.0;       // Default radius is 6
    private String color = "white";    // Default color is white

    // No-argument constructor - sets all fields to default values
    public Fan() {
        // All fields already have default values from declarations above
        // This constructor exists to provide explicit default initialization
    }

    // Constructor with arguments - sets all fields to specified values
    // Parameters:
    //   speed - the speed setting (should be STOPPED, SLOW, MEDIUM, or FAST)
    //   on - whether the fan is on (true) or off (false)
    //   radius - the radius of the fan
    //   color - the color of the fan
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Src: https://www.geeksforgeeks.org/java/getter-and-setter-in-java/

    // Getter method for speed
    // Returns: the current speed setting
    public int getSpeed() {
        return speed;
    }

    // Setter method for speed
    // Parameter: speed - the new speed setting (should be 0-3)
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter method for on status
    // Returns: true if fan is on, false if off
    public boolean isOn() {
        return on;
    }

    // Setter method for on status
    // Parameter: on - true to turn fan on, false to turn off
    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter method for radius
    // Returns: the radius of the fan
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    // Parameter: radius - the new radius value
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter method for color
    // Returns: the color of the fan
    public String getColor() {
        return color;
    }

    // Setter method for color
    // Parameter: color - the new color
    public void setColor(String color) {
        this.color = color;
    }

    // Src: https://www.geeksforgeeks.org/java/overriding-in-java/

    // toString method - returns a string description of the fan's current state
    // Returns: a formatted string with all fan properties
    @Override
    public String toString() {
        // Convert speed number to readable string
        String speedString;
        switch (speed) {
            case STOPPED:
                speedString = "STOPPED";
                break;
            case SLOW:
                speedString = "SLOW";
                break;
            case MEDIUM:
                speedString = "MEDIUM";
                break;
            case FAST:
                speedString = "FAST";
                break;
            default:
                speedString = "UNKNOWN";
        }

        // Build and return the description string
        return "Fan Status:\n" +
                "  Speed: " + speedString + " (" + speed + ")\n" +
                "  On: " + on + "\n" +
                "  Radius: " + radius + "\n" +
                "  Color: " + color;
    }

    // Test code in main method
    public static void main(String[] args) {
        System.out.println("=== Testing Fan Class ===\n");

        // Create first fan using default (no-argument) constructor
        System.out.println("Creating Fan 1 with default constructor:");
        Fan fan1 = new Fan();
        System.out.println(fan1);
        System.out.println();

        // Create second fan using argument constructor
        // Speed = FAST (3), On = true, Radius = 10, Color = blue
        System.out.println("Creating Fan 2 with argument constructor:");
        System.out.println("  (speed=FAST, on=true, radius=10, color=blue)");
        Fan fan2 = new Fan(FAST, true, 10.0, "blue");
        System.out.println(fan2);
        System.out.println();

        // Demonstrate setter methods on fan1
        System.out.println("=== Testing Setter Methods on Fan 1 ===\n");

        System.out.println("Setting fan1 speed to MEDIUM...");
        fan1.setSpeed(MEDIUM);

        System.out.println("Turning fan1 on...");
        fan1.setOn(true);

        System.out.println("Setting fan1 radius to 8...");
        fan1.setRadius(8.0);

        System.out.println("Setting fan1 color to red...");
        fan1.setColor("red");

        System.out.println("\nFan 1 after modifications:");
        System.out.println(fan1);
        System.out.println();

        // Demonstrate getter methods on fan2
        System.out.println("=== Testing Getter Methods on Fan 2 ===\n");
        System.out.println("fan2.getSpeed(): " + fan2.getSpeed());
        System.out.println("fan2.isOn(): " + fan2.isOn());
        System.out.println("fan2.getRadius(): " + fan2.getRadius());
        System.out.println("fan2.getColor(): " + fan2.getColor());
        System.out.println();

        // Demonstrate changing fan2 settings
        System.out.println("=== Modifying Fan 2 ===\n");

        System.out.println("Changing fan2 speed to SLOW...");
        fan2.setSpeed(SLOW);

        System.out.println("Turning fan2 off...");
        fan2.setOn(false);

        System.out.println("\nFan 2 after modifications:");
        System.out.println(fan2);
        System.out.println();

        // Final comparison
        System.out.println("=== Final State of Both Fans ===\n");
        System.out.println("Fan 1:");
        System.out.println(fan1);
        System.out.println();
        System.out.println("Fan 2:");
        System.out.println(fan2);
    }
}