package challenges_gs_24;

//1/2 *(x+3/x)

public class NewtonSqrt__021 {

	public static void main(String[] args) {

		System.out.println(approximateRoot(4,4));
		System.out.println(approximateRoot(10,4));
		System.out.println(approximateRoot(16,4));
		System.out.println("Square root approximation of 100 using Newton's method in 2 iterations is: " + approximateRoot(100,2));
		System.out.println("Square root approximation of 100 using Newton's method in 3 iterations is: " + approximateRoot(100,3));
		System.out.println("Square root approximation of 100 using Newton's method in 8 iterations is: " + approximateRoot(100,5));
		System.out.println("Square root approximation of 100 using Newton's method in 8 iterations is: " + approximateRoot(100,8));
		
		System.out.println("Square root approximation of 387 using Newton's method in 2 iterations is: " + approximateRoot(387,2));
		System.out.println("Square root approximation of 387 using Newton's method in 3 iterations is: " + approximateRoot(387,3));
		System.out.println("Square root approximation of 387 using Newton's method in 6 iterations is: " + approximateRoot(387,6));
		
		System.out.println("Square root approximation of 323187 using Newton's method in 2 iterations is: " + approximateRoot(323187,2));
		System.out.println("Square root approximation of 323187 using Newton's method in 3 iterations is: " + approximateRoot(323187,3));
		System.out.println("Square root approximation of 323187 using Newton's method in 6 iterations is: " + approximateRoot(323187,11));
	}
	
	public static double approximateRoot(double num, int iter) {
				
		double base = num;
		double sqrt = 3;
		int i = iter;
		
		while ( i > 0) {
			
			sqrt = 0.5 * (sqrt + base/sqrt);
			
			i--;
		}
		
		return sqrt;
	}

}
