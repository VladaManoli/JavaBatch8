package com.syntax.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		//1
		// create variable; assign a value
		// declare variable=initializing
		double $num=12.99;
		
        //2
		// declare a variable
		// initializing or assign a value
		
		int myBox; // we declare a variable only once 
		
		myBox=135; // assigning the value
		System.out.println(myBox);
		
		myBox=155; // reassigning the value
		System.out.println(myBox);
		
		//3
		int num1;
		int num2;
		int num3;
		// int num1, num2, num3; -is also working
		 num1=10;
		 num2=20;
		 num3=30;
		 
		 // what will be the output?
		 
		 char char1='C';
		 char char2='D';
		 char char3=char1;
		 System.out.println(char3); //'C'
		 
	}

}
