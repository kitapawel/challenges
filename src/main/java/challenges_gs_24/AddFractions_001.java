package challenges_gs_24;

//Add two fractions where each fraction is an array

public class AddFractions_001 {
	public static void main(String[] args) {
		
		int[] fraction1a = {1,2};
		int[] fraction1b = {1,4};
		int[] fraction2a = {2,5};
		int[] fraction2b = {5,6};
		int[] fraction3a = {1,4};
		int[] fraction3b = {2,3};
		
		addFractions(fraction1a, fraction1b);
		addFractions(fraction2a, fraction2b);
		addFractions(fraction3a, fraction3b);

	}

	static void addFractions(int[] f1, int[] f2) {
		int denominator, numerator, x;

		int num1 = f1[0];
		int den1 = f1[1];
		int num2 = f2[0];
		int den2 = f2[1];
		
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
		System.out.println("fraction 1: " + num1 + "/" + den1 + " + fraction 2: " + num2 + "/" + den2 + " equals "
				+ numerator + "/" + denominator);
	}

}
