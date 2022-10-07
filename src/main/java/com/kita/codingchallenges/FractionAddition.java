package com.kita.codingchallenges;

public class FractionAddition {
	public static void main(String[] args) {
	
		
		addFractions(1,2,1,4);
		addFractions(2,5,5,6);
		addFractions(1,4,2,3);

	}
	
	static void addFractions(int num1, int den1, int num2, int den2) {
		int denominator, numerator, x;

		if (den1 == den2) {
			numerator = num1 + num2;
			denominator = den1;
		} else {
			denominator = den1 * den2;
			numerator = den1 * num2 + den2 * num1;
		}
		if (numerator > denominator) {
			x = numerator;
		} else {
			x = denominator;
		}
		for (int i = 1; i <= x; i++) {
			if (numerator % i == 0 && denominator % i == 0) {
				numerator = numerator / i;
				denominator = denominator / i;
			}
		}
		System.out.println(
				"fraction 1: " + num1 + "/" + den1 + " + fraction 2: " + num2 + "/" + den2 + " equals " + numerator + "/" + denominator);
	}
	
}
