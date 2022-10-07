package com.kita.codingchallenges;

import java.util.ArrayList;


public class FibonacciNumbers {
	
	public static void main(String[] args) {
	
		int counter = 20;
		
		printFibonacci(counter);
		printFibonacci(5);
		//System.out.println(printFibonacciMethod2(17));
		//System.out.println(printFibonacciMethod2(5));
		
	}
	
	public static void printFibonacci(int c) {
		
		int fibonacciCounter = 2; //because 0 and 1 are preinserted in this sequence
		
		ArrayList<Integer> fibArray = new ArrayList<Integer>();
		
		fibArray.add(0);
		fibArray.add(1);
		
		while (fibonacciCounter < c) {
			int f1 = fibonacciCounter - 1;
			int f2 = fibonacciCounter - 2;
			int newFibNumber = fibArray.get(f1) + fibArray.get(f2);
			fibArray.add(newFibNumber);
			fibonacciCounter++;
		}
		
		
		System.out.println(fibArray);
	}
//
//	public static int printFibonacciMethod2(int n) {
//		 if( n<=1){
//		      return n;
//		    }else{
//		      return n = printFibonacciMethod2(n-2) + printFibonacciMethod2(n-1);
//		    }
//	}
//	

}
