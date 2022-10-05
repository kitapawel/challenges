package com.kita.codingchallenges;

import java.util.Optional;

public class ReturnIntegerFromString {
	
	public static void main(String[] args) {
	
		String test = "123aaavb";
		String test2 = "vrs";
		String test3 = "12";
		String test4 = "-023412";
		
		System.out.println(returnIntegerFromString(test3));
		System.out.println(returnIntegerFromString(test2));
		System.out.println(returnIntegerFromString(test));
		System.out.println(returnIntegerFromString(test4));
		
	}
	
	public static boolean isNumericValue (String str) {
		
		int convertedNumber;
		
		try {
			convertedNumber = Integer.parseInt(str);
		} catch (NumberFormatException e) {		    
		    return false;
		}
		
		return true;
	}
	
	public static Integer returnIntegerFromString (String str) {
		Integer convertedNumber = null;
		if (isNumericValue(str)) {
			convertedNumber = Integer.parseInt(str);
		}		
		return convertedNumber;
	}
	
	

}
