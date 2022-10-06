package com.kita.codingchallenges;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StudentBestAverage {
	
	public static void main(String[] args) {
		
		String[][] gradeLog = {{"Bobby", "87"},
				{"Charles", "100"},
				{"Eric", "90"},
				{"Eric", "90"},
				{"Eric", "90"},
				{"Charles", "22"},
				{"Eric", "90"},
				{"Bobby", "22"}};
		
//		HashMap<String, Integer> gradeLogAvgMap = new HashMap<String, Integer>();
//		
//		for (int i = 0; i < gradeLog.length; i++) {
//			int counter = 1;
//			Integer num = Integer.parseInt(gradeLog[i][1]);
//			if (gradeLogAvgMap.containsKey(gradeLog[i][0])) {
//				gradeLogAvgMap.put(gradeLog[i][0], gradeLogAvgMap.get(gradeLog[i][0]) + num);
//				counter+=1;
//			} else {
//				gradeLogAvgMap.put(gradeLog[i][0], num);
//			}
//			gradeLogAvgMap.put(gradeLog[i][0], gradeLogAvgMap.get(gradeLog[i][0]) / counter);
//		}
//		
//		int maxValue = Collections.max(gradeLogAvgMap.values());
//		
		System.out.println(getBestAverage(gradeLog));		
	}
	
	static int getBestAverage(String[][] studentGrades) {
		Map<String, int[]> map = new HashMap<>();
		int bestAverage = -1;
		
		for (String[] item : studentGrades) {
			String name = item[0];
			int grade = Integer.parseInt(item[1]);
			if(!map.containsKey(name)) {
				map.put(name, new int[] {1, grade});
			} else {
				map.get(name)[0]++;
				map.get(name)[1]+=grade;
			}
		}
		
		for (int[] score : map.values()) {
			bestAverage = Math.max(bestAverage, score[1]/score[0]);
		}
		
		return bestAverage;
	}

}