package challenges_gs_24;

public class IsPowerOf10_009 {

	public static void main(String[] args) {		
		int num1 = 100;
		int num2 = 1000;
		int num3 = 99;
		int num4 = 1;
		int num5 = 50;
		int num6 = 110;
		int num7 = 0;
		int num8 = -100;
		int num9 = 10000;
		int num0 = 1000000000;
		
		System.out.println("Is " + num1 + " power of 10? - " + isPowerOf10(num1));
		System.out.println("Is " + num2 + " power of 10? - " + isPowerOf10(num2));
		System.out.println("Is " + num3 + " power of 10? - " + isPowerOf10(num3));
		System.out.println("Is " + num4 + " power of 10? - " + isPowerOf10(num4));
		System.out.println("Is " + num5 + " power of 10? - " + isPowerOf10(num5));
		System.out.println("Is " + num6 + " power of 10? - " + isPowerOf10(num6));
		System.out.println("Is " + num7 + " power of 10? - " + isPowerOf10(num7));
		System.out.println("Is " + num8 + " power of 10? - " + isPowerOf10(num8));
		System.out.println("Is " + num9 + " power of 10? - " + isPowerOf10(num9));
		System.out.println("Is " + num0 + " power of 10? - " + isPowerOf10(num0));
		
	}
	
	static boolean isPowerOf10(int n) {
	    while(n > 1 && n % 10 == 0){
	        n /= 10;
	        //System.out.println(n);
	    }
	    return n == 1;
	}

}
