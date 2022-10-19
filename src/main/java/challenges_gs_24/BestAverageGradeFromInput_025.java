package challenges_gs_24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class BestAverageGradeFromInput_025 {
	
	public static void main(String[] args) {
		String[][] gradeLog1 = {{"Bobby", "87"},
				{"Charles", "100"},
				{"Eric", "64"},
				{"Charles", "22"}};

		String[][] gradeLog2 = {{"Bobby", "87"},
				{"Charles", "100"},
				{"Eric", "90"},
				{"Eric", "90"},
				{"Eric", "90"},
				{"Charles", "22"},
				{"Eric", "90"},
				{"Bobby", "22"}};

		System.out.println(getBestAverage(gradeLog1));
		System.out.println(getBestAverage(gradeLog2));

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
