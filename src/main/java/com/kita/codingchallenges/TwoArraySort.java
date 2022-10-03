package com.kita.codingchallenges;

public class TwoArraySort {
	public static void main(String[] args) {
		int[] A = {0,2,5,8};
		int[] B = {1,6,7};
		
		int temp, tempB;
		
		for (int j = 0; j < A.length; j++) {
			for (int i = 0; i < B.length; i++) {
				if (A[j] > B[i]) {
					temp = A[j];
					A[j] = B[i];
					B[i] = temp;
				}
			}
		}
		
		for (int z = 0; z <B.length-1; z++) {
			if(B[z]>B[z+1]) {
				tempB = B[z];
				B[z] = B[z+1];
				B[z+1] = tempB;
			}
		}
		
		System.out.print("A=");
		for (int i:A) {
			System.out.print(i + ",");
		}
		System.out.println();
		System.out.print("B=");
		for (int i:B) {
			System.out.print(i + ",");
		}
	}
}
