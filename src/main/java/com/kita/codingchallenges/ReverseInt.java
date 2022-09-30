package com.kita.codingchallenges;

public class ReverseInt {

	public static void main(String[] args) {
		ReverseInt object = new ReverseInt();
		int testNumber = 1234567;
		int testNumber2 = 113459561;
		System.out.println(object.ReverseInt(testNumber));
		System.out.println(object.ReverseInt(testNumber2));
	}


	private int ReverseInt(Integer num)
    {
        String n = num.toString();
        StringBuilder reversedN = new StringBuilder();
        for (Integer i = n.length()-1; i >= 0; i--) {
        	//System.out.println(i);
        	char c = n.charAt(i);
        	reversedN.append(c);
        }
        
        n = reversedN.toString();
        int reversedNumber = Integer.parseInt(n);
        return reversedNumber;
    }
}
