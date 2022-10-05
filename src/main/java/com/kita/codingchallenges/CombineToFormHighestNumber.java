package com.kita.codingchallenges;

import java.util.*;

//Form the largest possible number from a given set of numbers

public class CombineToFormHighestNumber {

	static void createLargest(Vector<String> arr)
    {
 
        Collections.sort(arr, new Comparator<String>()
        {
            @Override 
            public int compare(String X, String Y)
            {

                String XY = X + Y;
 
                String YX = Y + X;

                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });
 
        Iterator it = arr.iterator();
 
        while (it.hasNext())
            System.out.print(it.next());
    }


	public static void main(String[] args) {
		Vector<String> arr = new Vector<>();
		arr.add("10");
		arr.add("68");
		arr.add("75");
		arr.add("7");
		arr.add("21");
		arr.add("12");

		createLargest(arr);

	}

}
