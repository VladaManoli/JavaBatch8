package com.syntax.class05;

import java.util.Scanner;

public class operatorsANDOR {

	public static void main(String[] args) {
		// Prompt the user to enter person heights in inches. Person should be
		// classified as one of the following:
		// short (under 60 inch)
		// medium(between 60 -72 inch)
		// tall (over 72 inch)

		// Write a program that will print whether it is a weekend or weekday.
		// If any day from 1-5 → output “It is a weekday”, from 6-7 → output “It
		// is a weekend”, any other day → output “Invalid day”

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter height in inches");
		int height = scan.nextInt();

		if (height < 60) {
			System.out.println("Short");
		} else if (height >= 60 || height <= 72) {
			System.out.println("Medium");
		} else if (height > 72) {
			System.out.println("Tall");
		}

	}

}
