package challenges_gs_24;

public class JumpingOnClouds_24 {

	public static void main(String[] args) {
		int[] clouds1 = {0,1,0,0,0,1,0};//3
		int[] clouds2 = {0,0,0,0,1,0,1,0,0,1,0};//6

		System.out.println(jump(clouds1));
		System.out.println(jump(clouds2));
		
	}

	private static int jump(int[] clouds) {
		
		int jumps = 0;
		
		int i = 0;
		
		while (i<clouds.length-1) {
			
			if (i+2 == clouds.length || clouds[i+2] == 1) {
				i++;
				jumps+=1;
			} else {
				i+=2;
				jumps+=1;
			}			
			
		}
		
		return jumps;
	}
	
}
