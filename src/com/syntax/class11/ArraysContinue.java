package com.syntax.class11;

public class ArraysContinue {

	public static void main(String[] args) {
		// new char[how many rows] [how many columns];

		char[][] $array = new char[3][4];

		// add value to first row
		$array[0][0] = 'A';
		$array[0][1] = 'B';
		$array[0][2] = 'C';
		$array[0][3] = 'D';

		// 2 row
		$array[1][0] = 'W';
		$array[1][1] = 'X';
		$array[1][2] = 'Y';
		$array[1][3] = 'Z';

		// 3row
		$array[2][0] = 'Q';
		$array[2][1] = 'W';
		$array[2][2] = 'B';
		$array[2][3] = 'R';

		System.out.println($array[1][3]); // Z

		System.out.println("-------another way--------");

		for (int row = 0; row < $array.length; row++)
			;// loops through rows
		int row = 0;
		for (int col = 0; col < $array[row].length; col++) {
			System.out.println(($array[row][col] + " "));
		}
		System.out.println();
		/////////////////////////////////////////

		System.out.println("Another way to create  2D Array");

		int[][] array = { { 10, 20, 30 }, { 1, 2, 3 }, { 100, 200, 300 } };

		System.out.println(array[2][1]);// 200
		System.out.println(array[0][0]);// 10

	}

}
