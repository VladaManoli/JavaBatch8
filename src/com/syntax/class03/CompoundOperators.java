package com.syntax.class03;

public class CompoundOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 100;
		num = num + 10;
		System.out.println(num);

		num = num + 200;
		System.out.println(num);

		int myNumber = 100;
		myNumber += 10; // 110
		System.out.println(myNumber);

		myNumber += 200; // 310
		System.out.println(myNumber);

		myNumber -= 100; // 210
		System.out.println(myNumber);

		myNumber /= 10; // 21
		System.out.println(myNumber);

		myNumber %= 100; // 0
		System.out.println(myNumber);
		System.out.println("Another Example");
		
	//////////////////////////////////////////////////////
	
	boolean isFriday = true;
	int date=4; 

	if(isFriday) {
		if (date==6) {
			System.out.println("I will watch the movie");
	}else {
		System.out.println("I will watch a comedy instead");
	}
	}else {
		System.out.println("Today is not Friday, I am studying");
	}

}
  
}
