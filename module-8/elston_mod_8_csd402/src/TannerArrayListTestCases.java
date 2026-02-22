// Tanner Elston, CSD402, 2/19/26

import java.util.ArrayList;

public class TannerArrayListTestCases {

    public static void main(String[] args) {

        // Test 1: Empty list should return 0
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println("Empty list returns: " + TannerArrayListTest.max(emptyList));

        // Test 2: Largest value is the first element — should return 50
        ArrayList<Integer> largestFirst = new ArrayList<>();
        largestFirst.add(50);
        largestFirst.add(20);
        largestFirst.add(35);
        largestFirst.add(0);
        System.out.println("Largest first returns: " + TannerArrayListTest.max(largestFirst));
    }
}