package challenges_gs_24;

//	   1 
//    1 1 
//   1 2 1 
//  1 3 3 1 
// 1 4 6 4 1 
//1 5 10 10 5 1

public class PascalsTriangle_013 {

	public static void main(String[] args) {
		
		printPascal(20);	

	}

	public static void printPascal(int n) {
		for (int line = 1; line <= n; line++) {
			for (int j = 0; j <= n - line; j++) {

				// for left spacing
				System.out.print(" ");
			}

			// used to represent C(line, i)
			int number = 1;
			for (int i = 1; i <= line; i++) {

				// The first value in a line is always 1
				System.out.print(number + " ");
				number = number * (line - i) / i;
			}
			System.out.println();
		}
	}

}
