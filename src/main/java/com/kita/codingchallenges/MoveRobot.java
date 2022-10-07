package com.kita.codingchallenges;

import java.util.Arrays;

public class MoveRobot {
	public static void main(String[] args) {
		String inp1 = "UUUL";
		String inp2 = "UUU";
		String inp3 = "UDLRURL";
		
		CalculateRobotDestination(inp1);
		CalculateRobotDestination(inp2);
		CalculateRobotDestination(inp3);
	}
	
	static void CalculateRobotDestination(String inp) {
		int[] move = { 0, 0 };
		int countx = 0;
		int county = 0;

		for (int i = 0; i < inp.length(); i++) {
			if (inp.charAt(i) == 'U') {
				county++;
			} else if (inp.charAt(i) == 'D') {
				county--;
			} else if (inp.charAt(i) == 'R') {
				countx++;
			} else if (inp.charAt(i) == 'L') {
				countx--;
			}
		}
		move[0] = countx;
		move[1] = county;
		System.out.println(Arrays.toString(move));
	}
}
