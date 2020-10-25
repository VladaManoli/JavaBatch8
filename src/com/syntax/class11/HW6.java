package com.syntax.class11;

public class HW6 {

	public static void main(String[] args) {
		
		// Create a 2D array to store numbers in 3 rows and 3 columns.
				// Print the sum of all numbers.
				int[][] values = { 
						{ 1, 2, 3 }, 
						{ 1, 2, 3 }, 
						{ 1, 2, 3 }
				};
				int sum = 0;
				for (int i = 0; i < values.length; i++) {
					for (int j = 0; j < values.length; j++) {
						sum += values[i][j];
					}
				}
				System.out.println("The sum is " + sum);

	}

}
