package challenges_gs_24;

import java.util.Arrays;

public class FindSecondSmallestFromSortedArray {

	public static void main(String[] args) {
		
		int[] testArr1 = {3,5,6,3,6,7,8,2,1,6,7,8};
		int[] testArr2 = {3115,436,5463,65645,437,48,552};
		int[] testArr3 = {3115,436,5463,65645,-437,-48,-552};
		
		System.out.println(SecondSmallest(testArr1));
		System.out.println(SecondSmallest(testArr2));
		System.out.println(SecondSmallest(testArr3));
				
	}
	
	private static int SecondSmallest(int[] arr) {
		
		Arrays.sort(arr);		
		
		return arr[1];
	}
	
}
