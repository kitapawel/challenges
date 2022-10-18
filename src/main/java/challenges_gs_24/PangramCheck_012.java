package challenges_gs_24;

import java.util.Set;
import java.util.TreeSet;

public class PangramCheck_012 {

	public static void main(String[] args) {
		String testPangram = "The quick brown fox jumps over the lazy dog";
		String testNotPangram = "The quick brown fox jumps over the dog";
		String alphabeth = " abcdefghijklmnopqrstuvwxyz";
		TreeSet alphabethSet = new TreeSet<>();
		for (int i = 0; i < alphabeth.length(); i++) {
			alphabethSet.add(alphabeth.charAt(i));
		}
		//System.out.println(alphabethSet.toString());
		
		System.out.println(isItPangram(testPangram, alphabethSet));
		System.out.println(isItPangram(testNotPangram, alphabethSet));
		System.out.println(isItPangram(alphabeth, alphabethSet));

	}
	
	private static boolean isItPangram(String test, TreeSet referenceSet) {
		
		String testLowerCase = test.toLowerCase();
		
		TreeSet letterSet = new TreeSet<>();
		
		
		for (int i = 0; i < testLowerCase.length(); i++) {
			letterSet.add(testLowerCase.charAt(i));
		}
		
		//System.out.println(letterSet.toString());
		System.out.println("Is the string: " + test + " a pangram?");
		return letterSet.equals(referenceSet);
	}

}
