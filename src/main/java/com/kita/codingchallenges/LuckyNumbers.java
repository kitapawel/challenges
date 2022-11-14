package com.kita.codingchallenges;

public class LuckyNumbers {

	public static void main(String[] args) {

		checkLuckyNumber(1623);
		checkLuckyNumber(19);
		checkLuckyNumber(1292);

	}

	private static boolean checkLuckyNumber(Integer number) {
		
		String s = number.toString();
		int squaredSum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int count = i+1;
			if(count % 2 == 0) {				
				char a = s.charAt(i);
				int n = Character.getNumericValue(a);
				squaredSum += n*n;
			}

		}
		
		if (squaredSum % 9 == 0) {
			System.out.println(number + " is a Lucky number.");
			return true;
		} else {
			System.out.println(number + " is not a Lucky number.");
			return false;
		}		

	}
	
}
