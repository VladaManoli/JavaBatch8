package com.syntax.class05;

import java.util.Scanner;

public class AndOr {

	public static void main(String[] args) {
		
		//Write a program that will print whether it is a weekend or weekday. 
		//If any day from 1-5 → output “It is a weekday”, 
		//any from 6-7 → output “It is a weekend”, 
		//any other day → output “Invalid day”
	

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
///////////////////////////////////////////////////////////////////////////////////
	
