package com.syntax.class05;

import java.util.Scanner;

public class CommisionHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input;
		double sales;
		double comission;

		input = new Scanner(System.in);

		System.out.println("Please enter sales amount");
		sales = input.nextDouble();

		if (sales >= 10 && sales < 100) {
			comission = (sales * 10) / 100;
		} else if (sales >= 100 && sales < 200) {
			comission = (sales * 20) / 100;
		} else if (sales >= 200 && sales < 500) {
			comission = (sales * 30) / 100;
		} else if (sales >= 500) {
			comission = (sales * 50) / 100;
		} else {
			comission = 0;
		}
		System.out.println("You will get $ " + comission + " comission");
	}

}
