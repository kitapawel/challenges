package challenges_gs_24;

public class Print1234321 {

	public static void main(String[] args) {

		printPattern(4);
		printPattern(8);

	}

	private static void printPattern(int inputParameter) {

		int n = inputParameter;

		for (int i = n; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				int num = j;
				System.out.print(num++);
			}

			for (int k = i - 1; k > 0; --k) {
				int num = k;
				System.out.print(num--);
			}
			System.out.println();
		}
	}
}
