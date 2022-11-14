package com.kita.codingchallenges;

public class ArmstrongNumber {

	public static void main(String[] args) {

		//checkArmstrongNumber(153);
		//checkArmstrongNumber(143);
		
		int counter = 0;
		
		while (counter < 1000000) {
			checkArmstrongNumber(counter);
			counter++;
		}
		
	}
	
	private static boolean checkArmstrongNumber(Integer number) {
		
		String s = number.toString();
		
		int squaredSum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			int n = Character.getNumericValue(a);			
			squaredSum += n*n*n;
		}
		
		if (squaredSum == number) {
			System.out.println(number + " is an Armstrong number.");
			return true;
		} else {
			//System.out.println(number + " is not an Armstrong number.");
			return false;
		}		

	}

}
