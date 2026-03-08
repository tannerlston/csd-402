// Tanner Elston, CSD 402, 2/26/26

// Src: https://www.tutorialspoint.com/java/io/index.htm
// Src: https://www.geeksforgeeks.org/java/generating-random-numbers-in-java/
import java.io.*;
import java.util.Random;

/**
 * Program 2: Create/append to data.file with 10 random integers,
 * then reopen and display the contents.
 */
public class Program2 {

    public static void main(String[] args) {

        String fileName = "data.file";
        Random random = new Random();

        // --- Step 1: Create the file if it does not exist, then write or append ---
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File does not exist. Creating new file: " + fileName);
        } else {
            System.out.println("File already exists. Appending 10 new random numbers to: " + fileName);
        }

        // Src: https://www.geeksforgeeks.org/java/file-handling-java-using-filewriter-filereader/
        // FileWriter with append=true: creates the file if it doesn't exist, appends if it does
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                int randomNum = random.nextInt(1000); // random number 0-999
                sb.append(randomNum);
                if (i < 9) {
                    sb.append(" "); // separate each integer with a space
                }
            }
            bw.write(sb.toString());
            bw.newLine(); // each batch of 10 on its own line

            System.out.println("Successfully wrote 10 random numbers to " + fileName);

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
            return;
        }

        // --- Step 2: Reopen the file, read the data, and display it ---
        System.out.println("\n=== Contents of " + fileName + " ===");

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}