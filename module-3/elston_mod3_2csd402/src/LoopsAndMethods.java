public class LoopsAndMethods {
    public static void main(String[] args) {
        int rows = 7;
        printPyramid(rows);
    }

    // Prints a pyramid pattern with powers of 2
    // Each row contains ascending then descending powers, followed by @
    public static void printPyramid(int rows) {
        for (int i = 0; i < rows; i++) {
            printSpaces(rows - i - 1);
            printAscendingPowers(i);
            printDescendingPowers(i);
            System.out.println("@");
        }
    }

    // Prints the specified number of 4-character spaces for alignment
    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("    ");
        }
    }

    // Prints powers of 2 from 2^0 up to 2^maxPower in ascending order
    public static void printAscendingPowers(int maxPower) {
        for (int j = 0; j <= maxPower; j++) {
            System.out.print(powerOfTwo(j) + " ");
        }
    }

    // Prints powers of 2 from 2^(maxPower-1) down to 2^0 in descending order
    public static void printDescendingPowers(int maxPower) {
        for (int j = maxPower - 1; j >= 0; j--) {
            System.out.print(powerOfTwo(j) + " ");
        }
    }

    // Calculates and returns 2 raised to the given exponent
    public static int powerOfTwo(int exponent) {
        return (int) Math.pow(2, exponent);
    }
}