package Lecture1;

public class FibboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int n = 10;

		for (int i = 1; i <= n; i++) {
			System.out.println(a);
			int sum = a + b;
			a = b;
			b = sum;
		}

	}

}
