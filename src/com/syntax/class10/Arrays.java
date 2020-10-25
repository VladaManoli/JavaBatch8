package com.syntax.class10;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] grades1 = {'A','B','C', 'D', 'E'};
		System.out.println(grades1[1]);
		
		
		////////////////////////////////////////////////////////
		
		char[] grades2= new char[6];
		grades2 [0]='A';
		grades2 [1]='B';
		grades2 [2]='C';
		grades2 [3]='D';
		grades2 [4]='E';
		grades2 [5]='F';
		
		System.out.println(grades2[1]);
		
		
		/////////////////////////////////////////////////////////
		
		System.out.println("-------Another example----------");
		
		String[] names = {"Vlada","Andrei","Alex"};
		System.out.println(names[0]);
		
		
		////////////////////////////////////////////////////////
		
		System.out.println("-------Another example----------");
		
		String[] words= {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	}

}
