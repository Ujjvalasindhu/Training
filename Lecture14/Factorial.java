package Lecture14;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
	}

	private static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		int sp = fact(n - 1);
		int bp = sp * n;
		return bp;

	}

}
