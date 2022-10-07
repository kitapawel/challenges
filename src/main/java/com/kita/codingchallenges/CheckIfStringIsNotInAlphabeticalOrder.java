package com.kita.codingchallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIfStringIsNotInAlphabeticalOrder {

	    public static void main(String[] args) {
	        String input = "abycazf";
	        String input2 = "abcdefghi";
	        String input3 = "defgh";
	        
	        System.out.println(checkIfAlfOrder(input));
	        System.out.println(checkIfAlfOrder(input2));
	        System.out.println(checkIfAlfOrder(input3));
	    }

	    static boolean checkIfAlfOrder(String s) {
	    	 {
	    	        // find the length of the string
	    	        int n = s.length();
	    	       
	    	        // create a character array the same length as the string
	    	        char c[] = new char [n];
	    	       
	    	        // assign the string to character array
	    	        for (int i = 0; i < n; i++) {
	    	            c[i] = s.charAt(i);
	    	        }
	    	     
	    	        // sort character array
	    	        Arrays.sort(c);

	    	        // check if character array and string are equal 
	    	        for (int i = 0; i < n; i++)
	    	            if (c[i] != s.charAt(i)) 
	    	                return false;
	    	               
	    	        return true;    
	    	    }
	    }
}
