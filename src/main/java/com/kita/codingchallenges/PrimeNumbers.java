package com.kita.codingchallenges;

public class PrimeNumbers {

	public static void main(String[] args) {
		checkIfNumberIsPrime(1);
		checkIfNumberIsPrime(2);
		checkIfNumberIsPrime(3);
		checkIfNumberIsPrime(4);
		checkIfNumberIsPrime(5);
		checkIfNumberIsPrime(6);
		checkIfNumberIsPrime(10);
		checkIfNumberIsPrime(11);
		checkIfNumberIsPrime(12);
		checkIfNumberIsPrime(33);
		
	}
	
	static void checkIfNumberIsPrime(int n) {
		int i, m = 0, flag = 0;
		m = n / 2;
		if (n <= 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		}
	}
}
