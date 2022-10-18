package challenges_gs_24;

public class PowerOfANumber_014 {
	
	public static void main(String[] args) {
		System.out.println("0 to the power of 2 equals: " + raiseToThePowerOf(0,2));
		System.out.println("2 to the power of 0 equals: " + raiseToThePowerOf(2,0));
		System.out.println("2 to the power of 1 equals: " + raiseToThePowerOf(2,1));
		System.out.println("2 to the power of -1 equals: " + raiseToThePowerOf(2,-1));
		System.out.println("2 to the power of 2 equals: " + raiseToThePowerOf(2,2));
		System.out.println("2 to the power of 3 equals: " + raiseToThePowerOf(2,3));
		System.out.println("2 to the power of 4 equals: " + raiseToThePowerOf(2,4));
		System.out.println("4 to the power of 4 equals: " + raiseToThePowerOf(4,4));
		System.out.println("10 to the power of 5 equals: " + raiseToThePowerOf(10,5));
	}
	
	private static float raiseToThePowerOf(float base, float exponent) {
		
		float result = base;
		
		if (base == 0) {
			return 0;
		}
		
		if (exponent == 0) {
			return 1;
		}
		
		if (exponent == 1) {
			return base;
		}
		
		if (exponent == -1) {
			return 1/base;
		}
		
		for (long i = 1; i < exponent; i++) {
			result = result * base;
			System.out.println(result);
		}
		
		return result;
	}

}
