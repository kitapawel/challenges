package com.kita.codingchallenges;

public class SecondSmallestNumberInArray {

	public static void main(String[] args) {

		Integer[] testArray = { 111, 78, 66, 2, 59, 6, 33, 55, 1024, 1000000, 22, 1214535242 };
		System.out.println("Second smallest number: " + FindSecondSmallestNumber(testArray));

	}

	static int FindSecondSmallestNumber(Integer[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1];// 2nd element because index starts from 0
	}
}
