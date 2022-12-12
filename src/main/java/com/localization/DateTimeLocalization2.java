package com.localization;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeLocalization2 {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.of(2021, 3, 8, 15, 36, 56);
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		
		System.out.println("Local date and time in format style SHORT localized into default locale "
				+ Locale.getDefault().getDisplayName() + "\n"
				+ localDateTime.format(dateTimeFormatter));
		
		dateTimeFormatter = dateTimeFormatter.withLocale(Locale.FRANCE);
		
		System.out.println("\nLocal date and time in format SHORT localized to "
				+ Locale.FRANCE.getDisplayName() + "\n"
				+ localDateTime.format(dateTimeFormatter));
		
		dateTimeFormatter = dateTimeFormatter.withLocale(new Locale ("hi", "IN"));
		
		System.out.println("\nLocal date and time in format SHORT localized to "
				+ new Locale ("hi", "IN").getDisplayName() + "\n"
				+ localDateTime.format(dateTimeFormatter));

	}

}
