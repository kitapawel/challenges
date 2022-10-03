package com.kita.codingchallenges;

public class FindMinMax {

	public static void main(String[] args) {
		FindMinMax object = new FindMinMax();
		Integer[] testArray = { 111,78, 66, 2, 59, 6, 33, 1, 55, 1024, 1000000, 22, -1, -66, 1214535242 };
		object.FindMinimum(testArray);
		object.FindMaximum(testArray);
	}

	
	void FindMinimum(Integer arr[])
    {   
		int n = arr.length;
		Integer min = arr[0];
        
		for (int i = 0; i < n; i++) {
			
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum value: " + min);
    }
	
	void FindMaximum(Integer arr[])
    {   
		int n = arr.length;
		Integer max = arr[0];
        
		for (int i = 0; i < n; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum value: " + max);
    }
}
