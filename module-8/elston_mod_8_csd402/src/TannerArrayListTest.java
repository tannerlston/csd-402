// Tanner Elston, CSD402, 2/19/26


// src: https://www.w3schools.com/java/java_arraylist.asp
import java.util.ArrayList;

public class TannerArrayListTest {

        // Returns the largest Integer in the ArrayList.
        // Returns 0 if the ArrayList is empty.
        public static Integer max(ArrayList list) {
            if (list == null || list.isEmpty()) {
                return 0;
            }

            Integer largest = (Integer) list.get(0);

            // Iterate through the list and update largest when a bigger value is found
            for (int i = 1; i < list.size(); i++) {
                Integer current = (Integer) list.get(i);
                if (current > largest) {
                    largest = current;
                }
            }

            return largest;
        }

}