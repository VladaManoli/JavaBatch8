package com.syntax.class05;

import java.util.Scanner;

public class EqualOperators {

	public static void main(String[] args) {
		    
      
		
		Scanner input = new Scanner(System.in);
		int number;
		
		
		System.out.println("Please enter any number");
		number = input.nextInt();
		
		if(number>0 && number<=0) {
			System.out.println("YOu entered small number");
		}else if(number>10 && number <=100) {
			
		}else if(number >100 & number <=1000) {
			System.out.println("You entered large number");
		}
	}

}
