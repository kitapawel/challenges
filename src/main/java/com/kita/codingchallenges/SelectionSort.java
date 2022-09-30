package com.kita.codingchallenges;

public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort object = new SelectionSort();
		Integer[] testArray = { 111,78, 66, 2, 59, 6, 33, 1, 55 };
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

        for (int i = 0; i < n-1; i++) 
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }


}
