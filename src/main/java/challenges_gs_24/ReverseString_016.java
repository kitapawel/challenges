package challenges_gs_24;

public class ReverseString_016 {


	public static void main(String[] args) {
		String testString = "abcde123";
		String testString2 = "Pawe� Kita";
		System.out.println(ReverseString(testString));
		System.out.println(ReverseString(testString2));
	}


	private static String ReverseString(String s)
    {
        StringBuilder reversedS = new StringBuilder();
        for (Integer i = s.length()-1; i >= 0; i--) {
        	//System.out.println(i);
        	char c = s.charAt(i);
        	reversedS.append(c);
        }
        
        String newString = reversedS.toString();
        return newString;
    }

}
