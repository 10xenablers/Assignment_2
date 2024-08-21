package SearchHiLo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MinMaxFinder 
{
	public static void main(String[] args) {

		// Specify the input and output file paths
        
		String inputFile = "D:\\Ness Batch\\BackendDemos\\Assignment_2\\src\\SearchHiLo\\input";  // File containing the list of numbers
        String outputFile = "D:\\Ness Batch\\BackendDemos\\Assignment_2\\src\\SearchHiLo\\output"; // File to write the results

        // Initialize variables to store the highest and lowest numbers
        int min = 0;
        int max = 0;

        // Read numbers from the input file
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    // Parse the number and update min and max
                    int number = Integer.parseInt(line.trim());
                    if (number < min) {
                        min = number;
                    }
                    if (number > max) {
                        max = number;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid number: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the input file: " + e.getMessage());
            return;
        }

        // Write the results to the output file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write("Highest number: " + max + "\n");
            bw.write("Lowest number: " + min + "\n");
        } catch (Exception e) {
            System.out.println("Error writing to the output file: " + e.getMessage());
        }

        System.out.println("Processing complete. Results written to " + outputFile);
    }
}
