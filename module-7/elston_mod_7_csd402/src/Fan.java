// Tanner Elston, CSD402, 2/13/26


public class Fan {
    // Constants for fan speed settings
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields with default values
    private int speed = STOPPED;      // The default speed is STOPPED (0)
    private boolean on = false;        // Default is off
    private double radius = 6.0;       // Default radius is 6
    private String color = "white";    // The default color is white

    // No-argument constructor - sets all fields to default values
    public Fan() {
        // All fields already have default values from the declarations above
        // This constructor exists to provide explicit default initialization
    }

    // Constructor with arguments - sets all fields to specified values
    // Parameters:
    //   speed - the speed setting (should be STOPPED, SLOW, MEDIUM, or FAST)
    //   on - whether the fan is on (true) or off (false)
    //   radius - the radius of the fan
    //   color - the color of the fan
    public Fan(int speed, boolean on, double radius, String color) {
        // Validate and set speed (only accept 0-3)
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;
        }

        this.on = on;

        // Validate and set radius (only accept positive values)
        if (radius > 0) {
            this.radius = radius;
        }

        // Validate and set color (only accept non-null)
        if (color != null) {
            this.color = color;
        }
    }

    // Src: https://www.geeksforgeeks.org/java/getter-and-setter-in-java/

    // Getter method for speed
    // Returns: the current speed setting
    public int getSpeed() {
        return this.speed;
    }

    // Setter method for speed
    // Parameter: speed - the new speed setting (should be 0-3)
    public void setSpeed(int speed) {
        // Only accept valid speed values (0-3)
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;
        }
    }

    // Getter method for on status
    // Returns: true if fan is on, false if off
    public boolean isOn() {
        return this.on;
    }

    // Setter method for on status
    // Parameter: on - true to turn fan on, false to turn off
    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter method for radius
    // Returns: the radius of the fan
    public double getRadius() {
        return this.radius;
    }

    // Setter method for radius
    // Parameter: radius - the new radius value
    public void setRadius(double radius) {
        // Only accept positive radius values
        if (radius > 0) {
            this.radius = radius;
        }
    }

    // Getter method for color
    // Returns: the color of the fan
    public String getColor() {
        return this.color;
    }

    // Setter method for color
    // Parameter: color - the new color
    public void setColor(String color) {
        // Only accept non-null color values
        if (color != null) {
            this.color = color;
        }
    }

    // Src: https://www.geeksforgeeks.org/java/overriding-in-java/

    // toString method - returns a string description of the fan's current state
    // Returns: a formatted string with all fan properties
    @Override
    public String toString() {
        // Convert speed number to readable string
        String speedString = switch (this.speed) {
            case STOPPED -> "STOPPED";
            case SLOW -> "SLOW";
            case MEDIUM -> "MEDIUM";
            case FAST -> "FAST";
            default -> "UNKNOWN";
        };

        // Build and return the description string
        return "Fan Status:\n" +
                "  Speed: " + speedString + " (" + this.speed + ")\n" +
                "  On: " + this.on + "\n" +
                "  Radius: " + this.radius + "\n" +
                "  Color: " + this.color;
    }
}