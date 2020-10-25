package com.syntax.class11;

public class HW7 {

	public static void main(String[] args) {
		
		// Create a 2D array to store numbers in 3 rows and 4 columns.
				// Develop a program which will identify/print the even numbers only.
				int[][] values = { 
						{ 5, 2, 3, 4 }, 
						{ 8, 6, 10, 7 }, 
						{ 1, 9, 45, 90 }
				};
				for (int i = 0; i < values.length; i++) {
					for (int j = 0; j < values[i].length; j++) {
						if (values[i][j] % 2 == 0) {
							System.out.println(values[i][j] + " is Even numbers ");
						}else {
							System.out.println(values[i][j] + " is Odd numbers ");
						}
					}
					System.out.println(" ");
				}

	}

}
