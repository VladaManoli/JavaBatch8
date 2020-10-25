package com.syntax.class10;

import java.util.Scanner;

public class ArrayWithDouble {

	public static void main(String[] args) {

		// Create an array on double using scanner
		// and calculate the sum of all elements that was stored in an array.

		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter number double value, you want to store");

		int size = scan.nextInt();
		double[] number = new double[size];
		double sum = 0;
		

		System.out.println("Please, enter how many numbers you would like to store");

		for(int i = 0; i<size; i++) {
			System.out.println("Please, enter numbers you would like to store");
			number[i] = scan.nextDouble();
		}
		for(double num: number) {
			sum=sum+num;
		}
		System.out.println("The sum of numbers you entered is " +sum);
	}

}
