package com.syntax.class03;

public class NestedIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Asghar";
		String pass = "pass123";
		double accountBalance = 10.25;
		double transferAmount = 8;
		boolean transAllowed = true;

		if (pass.equals("pass123")) {
			System.out.println("Welcome to Syntax bank " + name);
			if (transAllowed) {
				System.out.println("Initiating transfer");
				if (transferAmount > accountBalance) {
					System.out.println("Insufficient balance");
				} else {
					System.out.println("ttansfer complete");
				}
			} else {
				System.out.println("You are not allowed to transfer");
			}
		} else {
			System.out.println("Your password is not correct, please try again");
		}

	}

}
