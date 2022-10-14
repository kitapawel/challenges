package challenges_gs_24;

import java.util.Arrays;

public class LongestUniformSubstring {

	public static void main(String[] args) {
		String test = "";
		String test1 = "10000111";
		String test2 = "aabbbbbcc";
		String test3 = "aabbcddeef";
		String test4 = "aabbcaaeefaa";

		System.out.println(Arrays.toString(repeatedSubstring(test)));
		System.out.println(Arrays.toString(repeatedSubstring(test1)));
		System.out.println(Arrays.toString(repeatedSubstring(test2)));
		System.out.println(Arrays.toString(repeatedSubstring(test3)));
		System.out.println(Arrays.toString(repeatedSubstring(test4)));

	}

	public static int[] repeatedSubstring(String s) {
		if (s.length() == 0)
			return new int[] { -1, 0 };
		if (s.length() == 1)
			return new int[] { 0, 1 };
		int index = -1;
		int maxCharCount = 0;
		int count = 1;
		int i;
		for (i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				if (count > maxCharCount) {
					maxCharCount = count;
					index = i - count;
				}
				count = 1;
			}
		}
		if (count > maxCharCount) {
			maxCharCount = count;
			index = i - count;
		}
		return new int[] { index, maxCharCount };
	}
}
