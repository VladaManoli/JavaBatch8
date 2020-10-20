package com.syntax.class06;

import java.util.Scanner;

public class PracticeforNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Does the store do the sale?(true/false");
		boolean sale = input.nextBoolean();
		double discount;
		double finalPrice;

		if (!sale) {
			System.out.println("No shopping");
		} else {

			System.out.println("Please enter the price");
			double price = input.nextDouble();

			if (price > 10 && price < 50) {
				discount = .10;
			} else if (price >= 50 && price < 100) {
				discount = .20;
			} else if (price >= 100 && price < 500) {
				discount = .40;
			} else if (price > 500) {
				discount = .50;
			} else {
				discount = 0;
			}

			finalPrice = price - discount;
			System.out.println("Your product price is $ " + price + " and you get $ " + discount + " discount"
					+ " and you pay only " + finalPrice);

		}

	}

}
