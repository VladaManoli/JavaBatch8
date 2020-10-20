package com.syntax.class02;

public class Operations {

	public static void main(String[] args) {
		
         // Write a Java program to add, subtract, multiply and divide 2 decimal values. 
		 //Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”

          
		double room = 6.66;
		double room2 = 3.33;
		double sub = room-room2;
		double mult = room+room2;
		double div = room/room2;
		
		System.out.println("The result of 2 numbers " + room + " and " + room2 + " is equal to " + div);
		
		//Write a program to find the square of the number 3.9. 
		 //You program should say “The square of the ____ is ____ ”
		
		double num = 3.9;
		double square = num*2;
		
		System.out.println("The square of the " + num + " is equal to "+ square);
		
		//Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. 
		 //Your program should say. “The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
        //Collapse
		
		int width=5;
		int height=8;
		int perimeter = (2* (width+height));
		int area = (width+height);
		
        System.out.println("The perimeter of a rectangle with width "+ width+ " and height "+ height+ " is equal to "+ perimeter+ " and area is "+ area);		
		
		








	}

}
