import java.util.Arrays;

public class SingleDimensionalArrays {
    public static void main(String[] args) {

        // Each pre-defined primitive array is a different size
        short[] shortArray = {-32768, 20, 30, 40, 32767};                           // size 5
        int[] intArray = {-2147483648, 6, 9, 12, 15, 18, 21, 2147483647};          // size 8
        long[] longArray = {-9223372036854L, 200L, 300L, 400L, 500L, 600L,
                700L, 800L, 900L, 1000L, 1100L, 9223372036854775807L};           // size 12
        double[] doubleArray = {1.59, 2.65, 3.14};                              // size 3

        // Display arrays and the averages returned from each method
        System.out.println("SHORT ARRAY  (size " + shortArray.length + "): " + Arrays.toString(shortArray));
        System.out.println("Average = " + average(shortArray));
        System.out.println();

        System.out.println("INT ARRAY    (size " + intArray.length + "): " + Arrays.toString(intArray));
        System.out.println("Average = " + average(intArray));
        System.out.println();

        System.out.println("LONG ARRAY   (size " + longArray.length + "): " + Arrays.toString(longArray));
        System.out.println("Average = " + average(longArray));
        System.out.println();

        System.out.println("DOUBLE ARRAY (size " + doubleArray.length + "): " + Arrays.toString(doubleArray));
        System.out.println("Average = " + average(doubleArray));
    }

    // Methods to calculate averages for each primitive array type
    public static short average(short[] array) {

        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short) (sum / array.length); // integer division is expected for short-average
    }

    public static int average(int[] array) {

        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (int) (sum / array.length); // integer division is expected for int-average
    }

    public static long average(long[] array) {

        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length; // integer division is expected for long-average
    }

    public static double average(double[] array) {

        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length; // floating-point division is expected for double-average
    }
}
