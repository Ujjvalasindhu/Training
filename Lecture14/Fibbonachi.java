package Lecture14;

public class Fibbonachi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fibbo(n));
	}

	private static int fibbo(int n) {
		// TODO Auto-generated method stub
		if (n == 0 || n == 1)
			return n;

		int a = fibbo(n - 1);
		int b = fibbo(n - 2);
		return a + b;

	}

}
