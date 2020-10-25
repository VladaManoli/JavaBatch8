package com.syntax.class10;

public class HW {

	public static void main(String[] args) {
		// Create an array of animals and store 6 elements into it. Using 2 different
		// loops print all elements from the array.

		String[] animals = { "Lion", "Wolf", "Bear", "Fox", "Cat", "Dog" };

		for (String fauna : animals) {
			System.out.print(fauna + " ");
		}

////////////////////////////////////////////////////////////////////////////
		System.out.println("\n" + "-----------------another way--------------------");
///////////////////////////////////////////////////////////////////////////

		String[] animal = new String[6];

		animal[0] = "Lion";
		animal[1] = "Wolf";
		animal[2] = "Bear";
		animal[3] = "Fox";
		animal[4] = "Cat";
		animal[5] = "Dog";

		for (int i = 0; i < animal.length; i++) {
			System.out.print(animal[i] + " ");
		}


		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
