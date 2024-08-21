package FactorialAssignment;

import java.util.Scanner;

public class Factorial {
	
	 public static void main(String[] args) {
	        
		 	// Check if a command-line argument is provided
	        if (args.length == 0) {
	            System.out.println("Please provide a non-negative integer as a command-line argument.");
	            return;
	        }

	        try {
	            // Parse the input from the command-line argument
	            int number = Integer.parseInt(args[0]);

	            // Validate the input
	            if (number < 0) {
	                System.out.println("Factorial is not defined for negative numbers.");
	            } else {
	                // Calculate factorial
	                long factorial = 1;
	                for (int i = 1; i <= number; i++) {
	                    factorial *= i;
	                }

	                // Display the result
	                System.out.println("The factorial of " + number + " is " + factorial);
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input. Please enter a valid non-negative integer.");
	        }
	    }
}