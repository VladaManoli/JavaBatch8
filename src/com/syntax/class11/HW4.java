package com.syntax.class11;

public class HW4 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
				int largeArray[] = { 8, 11, 12, 13, 2, 25, 65, 34, 54, 99, 76, 87, 10, 54 }; // 14 elements
				int min = largeArray[0];
				int max = largeArray[0];
				for (int i = 0; i <= 13; i++) {
					if (largeArray[i] < min)
						min = largeArray[i];
					if (largeArray[i] > max)
						max = largeArray[i];
				}
				System.out.println("The smallest value in the Array is: " + min);
				System.out.println("The smallest value in the Array is: " + max);
	}

}
