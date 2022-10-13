package challenges_gs_24;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DotProductOfTwoArrays_005 {
	
	public static void main(String[] args) {
		
		int[] vA = {0, 0, 0};
		int[] vB = {0, 0, 0};
		
		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Enter integer values for first Vector");			
			for (int i = 0; i < 3; i++) {
				try {
					vA[i] = sc.nextInt();
				} catch(InputMismatchException exception) {
					System.out.println("InputMismatchException: invalid input string");
				}				
			}	
			System.out.print("Enter integer values for second Vector");
			for (int i = 0; i < 3; i++) {
				try {
					vB[i] = sc.nextInt();
				} catch(InputMismatchException exception) {
					System.out.println("InputMismatchException: invalid input string");
				}				
			}
			
			System.out.println("First vector: " + Arrays.toString(vA));
			System.out.println("Second vector: " + Arrays.toString(vB));
			
			System.out.println("Dot product of both arrays is: " + dotProduct(vA, vB));
			
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }
    }		

	
    static int dotProduct(int[] vectorA, int[] vectorB)
    { 
        int product = 0; 

        for (int i = 0; i < vectorA.length; i++)
            product = product + vectorA[i] * vectorB[i];
        return product;
    }

}
