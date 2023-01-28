package Lecture16;

public class CountWays {
	public static void main(String[] args) {
		int n = 4;
		System.out.println(climb(n));
	}

	private static int climb(int n) {
		// TODO Auto-generated method stub

		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		
		int a = climb(n - 1);
		int b = climb(n - 2);
		int c = climb(n - 3);
		
		return a + b + c;
	}

}
