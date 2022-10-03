package com.kita.codingchallenges;

import java.util.Collections;
import java.util.HashMap;

public class StudentBestAverage {
	
	public static void main(String[] args) {
		
		String[][] gradeLog = {{"Bobby", "87"},
				{"Charles", "100"},
				{"Eric", "64"},
				{"Charles", "22"}};
		
		HashMap<String, Integer> gradeLogAvgMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < gradeLog.length; i++) {
			int counter = 1;
			Integer num = Integer.parseInt(gradeLog[i][1]);
			if (gradeLogAvgMap.containsKey(gradeLog[i][0])) {
				gradeLogAvgMap.put(gradeLog[i][0], gradeLogAvgMap.get(gradeLog[i][0]) + num);
				counter+=1;
			} else {
				gradeLogAvgMap.put(gradeLog[i][0], num);
			}
			gradeLogAvgMap.put(gradeLog[i][0], gradeLogAvgMap.get(gradeLog[i][0]) / counter);
		}
		
		int maxValue = Collections.max(gradeLogAvgMap.values());
		
		System.out.println(maxValue);
		
	}

}