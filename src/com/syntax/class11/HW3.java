package com.syntax.class11;

public class HW3 {

	public static void main(String[] args) {
		
		// Write a Java Program to print the
				// first 10 numbers of Fibonacci series.
				// fibonaci series: 0,1,1,2,3,5,8,13...)
				int num1 = 0;
				int num2 = 1;
				int num3;
				int count = 10;
				System.out.print(num1 + " " + num2); // printing 0 and 1
				for (int i = 2; i < count; i++) {
					num3 = num1 + num2;
					System.out.print(" " + num3);
					num1 = num2;
					num2 = num3;
				}

	}

}
