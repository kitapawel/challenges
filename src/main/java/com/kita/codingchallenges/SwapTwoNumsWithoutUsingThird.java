package com.kita.codingchallenges;

public class SwapTwoNumsWithoutUsingThird {
	
	public static void main(String[] args) {

		SwapTwoNumbers(3,1);
		SwapTwoNumbers(12,-6);
		SwapTwoNumbers(5432,345676);
		

	}
	
	static void SwapTwoNumbers(int x, int y) {
		System.out.println("Old value of x is: "+ x + " and old value of y is: " + y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("New value of x is: "+ x + " and new value of y is: " + y);
	}

}
