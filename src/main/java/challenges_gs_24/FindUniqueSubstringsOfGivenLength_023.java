package challenges_gs_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindUniqueSubstringsOfGivenLength_023 {

	public static void main(String[] args) {
		String test1 = "abbccde";
		
		System.out.println((splitInParts(test1, 2)));
		System.out.println((splitInParts(test1, 3)));
		System.out.println((splitInParts(test1, 4)));

	}

	public static List<String> splitInParts(String s, int partLength) {
		int length = s.length();
		List<String> parts = new ArrayList<>();
		int partLimit = partLength - 1;
		
		for (int i = 0; i < length -1; i++) {
			if (i == length-partLimit) {
				break;
			}
			
			int counter = 0;
			StringBuilder substring = new StringBuilder();
			
			while (counter < partLength) {				
				substring.append(s.charAt(i+counter));
				counter++;				
			}
			
			String result = substring.toString();			
			parts.add(result);
		}
		
		System.out.println(parts);
		return parts;
	}

}
