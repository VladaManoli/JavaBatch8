package com.syntax.class11;

public class HW5 {

	public static void main(String[] args) {
		
		// Write a java program to find
				// the second largest number in the array
				int largest = 0;
				int secondLargest = 0;
				int[] array = { 9, 2, 1, 60, 47 };
				for (int i = 0; i < array.length; i++) {
					if (array[i] > largest) {
						secondLargest = largest;
						largest = array[i];
					} else if (array[i] > secondLargest) {
						secondLargest = array[i];
					}
				}
				System.out.println("The largest number is " + largest);
				System.out.println("The second largest number is " + secondLargest);

	}

}
