package com.syntax.class11;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?
				// Swap 2 strings without a temporary variable?
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter First number: ");
				double num1 = scan.nextDouble();
				System.out.println("Enter Second number: ");
				double num2 = scan.nextDouble();
				System.out.println("Before Swaping: num1 is " + num1 + " and num2 is " + num2);
				num1 = num1 - num2;//num1= 5.6 - 6.6  = -1
				num2 = num1 + num2;//num2= -1 + 6.6   = 5.6
				num1 = num2 - num1;//num1= 5.6 - (-1)  = 6.6
				System.out.println("After Swaping: num1 is " + num1 + " and num2 is " + num2);
				
				
				
				System.out.println("------------------Exampple String-------------------------");
					
				
				
				System.out.println("Enter a word1 ");
				String word1=scan.next();
				
				System.out.println("Enter a word2 ");
				String word2=scan.next();
				
				System.out.println("Before Swaping: word1 is " + word1 + " and word2 is " + word2);
				
				word1=word1+word2;
				word2=word1.substring(0,word1.length() - word2.length());
				word1=word1.substring(word2.length());
				
				System.out.println("After Swaping: word1 is " + word1 + " and word2 is " + word2);

	}

}
