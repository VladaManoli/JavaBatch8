package com.syntax.class09;

public class NestedLoops {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) { // outer loop
			System.out.println("Hello");

			for (int y = 0; y < 3; y++) { // inner loop

				System.out.println("Bye");
			}
			System.out.println("----------------");
		}  
		
		for (int i=10; i<=14; i++) {
			System.out.println(i);
			
			for (int j=1; j<=4; j++) {
				System.out.println(j);
			}
			System.out.println("----------");
		}	
		
	}
	

} 
