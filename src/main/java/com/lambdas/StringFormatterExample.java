package com.lambdas;

public class StringFormatterExample {

	public static void main(String[] args) {

		
		StringFormatter stringFormatter1 = (s1, s2) -> s1+ " " +s2;
		StringFormatter stringFormatter2 = (s1, s2) -> s1+ " - " +s2;
		StringFormatter stringFormatter3 = (s1, s2) -> s1.toUpperCase()+ " " +s2.toUpperCase();
		
		String a = "Lambda";
		String b = "Expression";
		
		System.out.println(stringFormatter1.format(a, b));
		System.out.println(stringFormatter2.format(a, b));
		System.out.println(stringFormatter3.format(a, b));
		
	}
	
}
