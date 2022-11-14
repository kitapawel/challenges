package challenges_gs_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnagramSet_008 {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>();
		
		words.add("cat");
		words.add("dog");
		words.add("god");
		words.add("cat");
		words.add("a man");
		words.add("mana");
		words.add("donkey");
		words.add("aman");
		
		printAnagram(words);
		
		//System.out.println("Are cat and cat an anagram? - " + checkIfTwoWordsAreAnAnagram("cat", "cat"));
		//System.out.println("Are god and dog an anagram? - " + checkIfTwoWordsAreAnAnagram("dog", "god"));
		//System.out.println("Are a man and mana an anagram? - " + checkIfTwoWordsAreAnAnagram("a man", "mana"));
	}
	
	static void printAnagram(ArrayList<String> al) {
		
		Set<String> anagramSet = new HashSet<String>();
		
		for (String s : al) {
			for (String ss : al) {
				if (checkIfTwoWordsAreAnAnagram(s,ss)) {
					anagramSet.add(s);
					anagramSet.add(ss);
				} 
			}
		}		

		System.out.println("These are anagrams: " + anagramSet);
		
	}
	
	static boolean checkIfTwoWordsAreAnAnagram(String a, String b) {
		
		if (a.equals(b)) {
			return false;
		}

		//char[] word1 = a.replaceAll("[\\s]", "").toCharArray();
		//char[] word2 = b.replaceAll("[\\s]", "").toCharArray();
		char[] word1 = a.toCharArray();
		char[] word2 = b.toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		return Arrays.equals(word1, word2);
	}	
}
