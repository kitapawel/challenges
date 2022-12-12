package com.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class PropertiesLocalization {

	public static void main(String[] args) {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("locale");
		System.out.println("Welocme in English (default):" + resourceBundle.getString("welcome"));
		
		resourceBundle = ResourceBundle.getBundle("locale", Locale.FRANCE);
		System.out.println("Welocme in French (country):" + resourceBundle.getString("welcome"));
		
		resourceBundle = ResourceBundle.getBundle("locale", Locale.FRENCH);
		System.out.println("Welocme in French (language):" + resourceBundle.getString("welcome"));
		
		resourceBundle = ResourceBundle.getBundle("locale", new Locale("hi", "IN"));
		System.out.println("Welocme in Hindi:" + resourceBundle.getString("welcome"));

	}

}
