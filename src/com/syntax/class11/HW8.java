package com.syntax.class11;

public class HW8 {

	public static void main(String[] args) {
		
		// Create an array of countries: north america countries, south america
				// countries, europe countries, asian countries, african countries.
				// Then print all values from that array using
				// 2 different loops and calculate how many total countries been stored.
				String[] arrayOfCountries = { "North America-Canada", "South America-Brazil", "Europe-France", "Asia-China",
						"Africa-Nigeria" };
				
				System.out.println("------------1st way-----------");
				for (int i = 0; i < arrayOfCountries.length; i++) {
					System.out.println(arrayOfCountries[i] +  " ");
				}
				System.out.println();
				int size = arrayOfCountries.length;
				System.out.println("Size of stored countries = " + size);
				System.out.println("------------2d way-----------");
				for (String array : arrayOfCountries) {
					System.out.println(array + " ");
				}
				System.out.println();
				int size1 = arrayOfCountries.length;
				System.out.println("Size of stored countries = " + size1);

	}

}
