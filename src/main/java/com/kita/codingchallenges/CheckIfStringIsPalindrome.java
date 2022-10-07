package com.kita.codingchallenges;

public class CheckIfStringIsPalindrome {

	public static void main(String[] args) {
		String input1 = "cbbc";
		String input2 = "kamilœlimak";
		String input3 = "Kamil Œlimak";
		String input4 = "abbcce";
		
		palindromeChecker(input1);
		palindromeChecker(input2);
		palindromeChecker(input3);
		palindromeChecker(input4);
		
	}

	static void palindromeChecker(String inp) {
		char c;
		StringBuffer reversedString = new StringBuffer();
		for (int i = inp.length() - 1; i >= 0; i--) {
			c = inp.charAt(i);
			reversedString.append(c);
		}
		String reversed = reversedString.toString();
		if (reversed.equals(inp)) {
			System.out.println("The input: " + inp + " is a palindrome");
		} else {
			System.out.println("The input: " + inp + " is not a palindrome");
		}
	}
}
