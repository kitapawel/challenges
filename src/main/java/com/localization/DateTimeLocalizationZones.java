package com.localization;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeLocalizationZones {

	public static void main(String[] args) {
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(zonedDateTime);
		
		ZoneId zone = zonedDateTime.getZone();
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
		
		System.out.println ("\nCurrent date time in " + zone + " zone with format style FULL and default locale "
				+ Locale.getDefault().getDisplayName() + "\n"
				+ zonedDateTime.format(dateTimeFormatter));

		dateTimeFormatter = dateTimeFormatter.withLocale(Locale.FRANCE);
		
		System.out.println ("\nCurrent date time in " + zone + " zone with format style FULL and locale "
				+ Locale.FRANCE.getDisplayName() + "\n"
				+ zonedDateTime.format(dateTimeFormatter));
		
		dateTimeFormatter = dateTimeFormatter.withLocale(new Locale("hi", "IN"));
		
		System.out.println ("\nCurrent date time in " + zone + " zone with format style FULL and locale "
				+ new Locale("hi", "IN").getDisplayName() + "\n"
				+ zonedDateTime.format(dateTimeFormatter));
		
	}

}
