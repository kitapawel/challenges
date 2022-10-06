package com.kita.codingchallenges;

public class SubArraySumNumber {

	public static void main(String[] args) {		
		
		int[] testCase = {1,2,3,4};
		int input1 = 6;
		int input2 = 12;
		
		System.out.println(calculateSums(testCase, input1));
		System.out.println(calculateSums(testCase, input2));
		
	}
	
	static int calculateSums(int[] arr, int target) {
		
		int counter = 0;
		
		for (int i = 0; i < arr.length; i++) {
			//System.out.println("Checking for array element " + arr[i]);
			int baseNumber = arr[i];
			int z = 0;
			
			while (z < arr.length) {
				int result;
				if (arr[i] != arr[z]) {
					result = baseNumber + arr[z];
					//System.out.println(result);
					if (result == target) {
						counter++;
					}
				}
				z++;
			}
			
		}
		
		if (counter > 0) {
			return counter;
		} else {
			return -1;
		}

	}
	
}
