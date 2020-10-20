package com.syntax.class05;

import java.util.Scanner;

public class AndOrTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Scanner scan = new Scanner(System.in);
        
		System.out.println("Please enter a number");
		int day = scan.nextInt();

		if (day > 0 && day <= 5) {
			System.out.println(day + "Weekday");
		} else if (day == 6 || day == 7) {
			System.out.println(day + " Weekend");
		} else {
			System.out.println("Invalid number");
		}
	}

}
