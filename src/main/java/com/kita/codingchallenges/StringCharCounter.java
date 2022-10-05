package com.kita.codingchallenges;

import java.util.Arrays;
import java.util.HashMap;

public class StringCharCounter {

	public static void main(String[] args) {
		String string1 = "";
		String string2 = "a";
		String string3 = "aa";
		String string4 = "aabb";
		String string5 = "aaabb";
		String string6 = "aabbbcddddddffffffffffgggg";

		System.out.println(charCounter(string1));
		System.out.println(charCounter(string2));
		System.out.println(charCounter(string3));
		System.out.println(charCounter(string4));
		System.out.println(charCounter(string5));
		System.out.println(charCounter(string6));

	}

	static String charCounter(String test) {

		HashMap<Character, Integer> charCount = new HashMap<>();
		for (int i = test.length() - 1; i >= 0; i--) {
			if (charCount.containsKey(test.charAt(i))) {
				int count = charCount.get(test.charAt(i));
				charCount.put(test.charAt(i), ++count);
			} else {
				charCount.put(test.charAt(i), 1);
			}
		}
		
		String map1 = charCount.toString();
		StringBuilder temp = new StringBuilder(map1.replace("{", ""));
		String map2 = temp.toString();
		temp.delete(0, temp.length());
		temp.append(map2.replace("=", ""));
		String map3 = temp.toString();
		temp.delete(0, temp.length());
		temp.append(map3.replace(", ", ""));
		String map4 = temp.toString();
		temp.delete(0, temp.length());
		temp.append(map4.replace("}", ""));

		String result = temp.toString();
	    return result;		
	}
}