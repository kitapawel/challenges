
package challenges_gs_24;

public class FindSecondSmallestFromUnsortedArray_019 {

	public static void main(String[] args) {

		int[] testArr1 = { 3, 5, 6, 3, 6, 7, 8, 2, 1, 6, 7, 8 };
		int[] testArr2 = { 3115, 436, 5463, 65645, 437, 48, 552 };
		int[] testArr3 = { 3115, 436, 5463, 65645, -437, -48, -552 };

		System.out.println(findSecondSmallestNumber(testArr1));
		System.out.println(findSecondSmallestNumber(testArr2));
		System.out.println(findSecondSmallestNumber(testArr3));

	}

	private static int findSecondSmallestNumber(int[] test) {

		int n = test.length;
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (test[i] < smallest) {
				smallest = test[i];
			}
		}

		for (int i = 0; i < n; i++) {
			if (test[i] < secondSmallest && test[i] > smallest) {
				secondSmallest = test[i];
			}
		}

		return secondSmallest;
	}

}
