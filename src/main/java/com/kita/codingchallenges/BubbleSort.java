package com.kita.codingchallenges;

public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort object = new BubbleSort();
		Integer[] testArray = { 111,78, 66, 2, 59, 6, 33, 1, 55, 1024, 1000000, -1, 22 };
		object.Sort(testArray);
		object.PrintArray(testArray);
	}

	public void PrintArray(Integer[] array) {
		for (Integer i : array) {
			System.out.println(i);
		}
	}
	
	void Sort(Integer arr[])
    {
        int n = arr.length;
        
        for (int i = 0; i < n-1; i++) {
        	
        	for (int j = i+1; j < n; j++) {
        		if (arr[i] > arr [j]) {
        			int temp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = temp;
        		}
        		
        	}
        }

    }
}

