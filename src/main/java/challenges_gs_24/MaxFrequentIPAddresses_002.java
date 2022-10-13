package challenges_gs_24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxFrequentIPAddresses_002 {
	public static void main(String[] args) {		
		
		String[] testString1 = { "10.0.1.45 -/d/intheclass", "10.0.1.45 -/a/facts/final…/bhgahf",
				"10.3.54.123 -/d/xyz/bcc/yes"};
		String[] testString2 = { "10.0.1.45 -/d/intheclass", "10.0.1.45 -/a/facts/final…/bhgahf",
				"10.45.23.34 -/x/new/car/honda", "10.3.54.123 -/d/random/city/lucknow",
				"10.3.54.123 -/d/rich/family/do" };
		
		System.out.println("TestString1 output: ");
		FindMostRepeatingIP(testString1);
		System.out.println("TestString2 output: ");
		FindMostRepeatingIP(testString2);

	}
	
	static void FindMostRepeatingIP(String[] str) {
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < str.length; i++) {
			list.add(str[i].substring(0, str[i].indexOf(" ")));
		}

		HashMap<String, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < list.size(); i++) {
			if (hashMap.containsKey(list.get(i))) {
				int count = hashMap.get(list.get(i));
				hashMap.put(list.get(i), ++count);
			} else {
				hashMap.put(list.get(i), 1);
			}
		}
		//System.out.println(hashMap);

		int maxValueInMap = (Collections.max(hashMap.values()));
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() == maxValueInMap) {
				System.out.println(entry.getKey());

			}
		}
	}
}
