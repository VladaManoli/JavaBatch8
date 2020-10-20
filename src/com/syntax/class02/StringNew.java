package com.syntax.class02;

public class StringNew {

	public static void main(String[] args) {
		//
		String name="Olga";
		// I'd like to say "My name is Olga"
		System.out.println("My name is " + name);
		
        // I'd like to print Olga Sorrels
		String lastName = "Sorrels";
		System.out.println(name+ " "+lastName);
		
		String city = "Miami";
		System.out.println(name+ " lives in "+ city);
		
		char grade = 'B';
		System.out.println(name + " " + grade + " student ");
		// to attach/concatenate ANY value (char, int, String, double)
		// to a String we use + (String concatenation operator)
		
		
	}

}
