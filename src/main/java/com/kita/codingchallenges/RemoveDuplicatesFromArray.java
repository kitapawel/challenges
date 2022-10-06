package com.kita.codingchallenges;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
	
	public static void main (String[] args) {
		int[] arr = {1,2,3,3,4,5,6,6,7,6,8,8,9,9,9,9,10, 11, 12};
		
		Set<Integer> hashSet = new HashSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			hashSet.add(arr[i]);
		}
		
		System.out.println(hashSet);

	}

}
