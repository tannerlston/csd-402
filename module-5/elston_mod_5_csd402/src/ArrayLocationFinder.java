// Tanner Elston, CSD402, 2/5/26
// Src: https://www.w3schools.com/java/java_arrays_multi.asp


public class ArrayLocationFinder {

    // Find location of largest element in double array
    public static int[] locateLargest(double[][] arrayParam) {
        return findExtreme(arrayParam, true);
    }

    // Find location of largest element in int array
    public static int[] locateLargest(int[][] arrayParam) {
        return findExtreme(arrayParam, true);
    }

    // Find location of smallest element in double array
    public static int[] locateSmallest(double[][] arrayParam) {
        return findExtreme(arrayParam, false);
    }

    // Find location of smallest element in int array
    public static int[] locateSmallest(int[][] arrayParam) {
        return findExtreme(arrayParam, false);
    }

    // src: https://codehs.com/textbook/apcsa_textbook/8.2

    // Helper method for double arrays
    // Iterate through all elements, compare, and update when condition met
    private static int[] findExtreme(double[][] array, boolean findMax) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return null;
        }

        int[] location = {0, 0};
        double extreme = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((findMax && array[i][j] > extreme) ||
                        (!findMax && array[i][j] < extreme)) {
                    extreme = array[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Helper method for int arrays
    private static int[] findExtreme(int[][] array, boolean findMax) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return null;
        }

        int[] location = {0, 0};
        int extreme = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((findMax && array[i][j] > extreme) ||
                        (!findMax && array[i][j] < extreme)) {
                    extreme = array[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Test the methods
    public static void main(String[] args) {
        int[][] intArray = {
                {23, 45, 12},
                {67, 89, 34},
                {56, 22, 91}
        };

        int[] largestLoc = locateLargest(intArray);
        int[] smallestLoc = locateSmallest(intArray);

        System.out.println("Largest: " + intArray[largestLoc[0]][largestLoc[1]] +
                " at [" + largestLoc[0] + "][" + largestLoc[1] + "]");
        System.out.println("Smallest: " + intArray[smallestLoc[0]][smallestLoc[1]] +
                " at [" + smallestLoc[0] + "][" + smallestLoc[1] + "]");

        double[][] doubleArray = {
                {3.5, 2.1, 8.9},
                {1.2, 9.3, 4.7},
                {6.8, 0.5, 7.4}
        };

        int[] largestLocD = locateLargest(doubleArray);
        int[] smallestLocD = locateSmallest(doubleArray);

        System.out.println("\nLargest: " + doubleArray[largestLocD[0]][largestLocD[1]] +
                " at [" + largestLocD[0] + "][" + largestLocD[1] + "]");
        System.out.println("Smallest: " + doubleArray[smallestLocD[0]][smallestLocD[1]] +
                " at [" + smallestLocD[0] + "][" + smallestLocD[1] + "]");
    }
}