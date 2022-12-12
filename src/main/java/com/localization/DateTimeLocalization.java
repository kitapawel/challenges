package com.localization;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeLocalization {
	
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local date/time in default format: " + localDateTime);
		
		String pattern = "dd-MMM-yyyy HH:mm:ss EEEE";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
		
		System.out.println("\nLocal date/time in format with default language locale: \n" + localDateTime.format(dateTimeFormatter));
		
		dateTimeFormatter = DateTimeFormatter.ofPattern(pattern, new Locale("hi", "IN"));
		
		System.out.println("\nLocal date time in dd-MMMM-yyyy HH:mm:ss EEEE format with locate " 
				+ new Locale("hi", "IN").getDisplayName() 
				+ ": \n" 
				+ localDateTime.format(dateTimeFormatter));
	}

}
