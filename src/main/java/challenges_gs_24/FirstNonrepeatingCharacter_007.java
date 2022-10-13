package challenges_gs_24;

import java.util.HashMap;
import java.util.Map;

public class FirstNonrepeatingCharacter_007 {

	public static void main(String[] args) {

		String str1 = "apple";
		String str2 = "papaya";
		String str3 = "beeboo";		
		String str4 = "";
		String str5 = "belzeebuub";
		
		System.out.println(firstUniqChar(str1));
		System.out.println(firstUniqChar(str2));
		System.out.println(firstUniqChar(str3));
		System.out.println(firstUniqChar(str4));
		System.out.println(firstUniqChar(str5));
		
	}
	
	public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            System.out.println(map.toString());
        }
        for(int i = 0 ; i < s.length() ; i++){
            if(map.get(s.charAt(i))==1) return i;
        }
        return -1;
    }


}