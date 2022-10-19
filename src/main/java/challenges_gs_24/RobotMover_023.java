package challenges_gs_24;

import java.util.Arrays;

public class RobotMover_023 {

	public static void main(String[] args) {
		
		String str1 = "UUU";
		String str2 = "UDLRURL";
		String str3 = "UUUELLLRA";
		
		
		System.out.println(str1 + ": " + Arrays.toString(MoveRobot(str1)));
		System.out.println(str2 + ": " + Arrays.toString(MoveRobot(str2)));
		System.out.println(str3 + ": " + Arrays.toString(MoveRobot(str3)));

	}
	
	private static int[] MoveRobot (String instructions) {
		
		int[] coords = {0,0};
		
		char[] instrArr = instructions.toCharArray();
		
		for (char c : instrArr) {
			
			if (c == 'U') {				
				coords[1] += 1;
			}
			if (c == 'D') {				
				coords[1] -= 1;
			}
			if (c == 'L') {				
				coords[0] -= 1;
			}
			if (c == 'R') {				
				coords[0] += 1;
			}			
		}
		
		return coords;
	}

}
