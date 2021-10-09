package com.hsbc.day2;

public class Test {
	public static void main(String[] args) {
		Account acc = new Account("1234556", 900000, "SBI9078");
		Savings s = new Savings("23495849", 400000, "SBI9079", 200000);
		Current c = new Current("9746370", 500000, "SBI9077", "Prakash");
		// System.out.println("-----Account object------");
		// displayTest(acc);
		System.out.println("-----Savings Object------");
		displayTest(s, c);
		System.out.println("-----Current Object------");
		displayTest(s, c);
		System.out.println("----------------------");

	}

	public static void displayTest(Savings sav, Current curr) {
		System.out.println(sav.accountDisplay());
		// System.out.println(curr.accountDisplay());
		/*
		 * System.out.println(acc1.accountDisplay()); if (acc1 instanceof Savings) {
		 * Savings s1=(Savings) acc1; System.out.println(s1.accountDisplay()); } if
		 * (acc1 instanceof Current) { Current c1=(Current) acc1;
		 * System.out.println(c1.accountDisplay()); }
		 */

	}

}

	
