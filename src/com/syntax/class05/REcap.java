package com.syntax.class05;

import java.util.Scanner;

public class REcap {

	public static void main(String[] args) {
	
    Scanner scan = new Scanner(System.in);
    
	// I want to capture sentence:
    System.out.println("Please entr any sentence");
    String sentence = scan.nextLine();
    System.out.println("You entered sentence: "+sentence);
    
    // I want to capture number:
    System.out.println("Please entr any number");
    int number = scan.nextInt();
    System.out.println("You entered number: "+number);
    
    // I want to 1 character:
    System.out.println("Please entr any 1 character");
    char singleCharacter = scan.next().charAt(0);
    System.out.println("You entered number: "+singleCharacter);
    
    // I want to 1 word:
    System.out.println("Please entr any word");
    String word = scan.next();
    System.out.println("You entered word: "+word);
    
    
	}
}
   
           
