package com.syntax.class06;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner (System.in);
		String grade;
		System.out.println("Please enter a grade");
		grade=in.nextLine();
		
		switch(grade) {
		case "A":
			grade="Excellent";
			break;
		case "B":
			grade="Good";
			break;	
		case "C":
			grade="Average";
			break;
		case "D":
			grade="Bad";
			break;
		default:
			grade="Not Acceptable";
		}
		System.out.println(grade);
	}

}
