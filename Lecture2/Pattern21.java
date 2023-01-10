package Lecture2;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp = 2 * n - 3;
		int nst = 1;

		for (int row = 1; row <= n; row++) {

			// stars

			for (int i = 1; i <= nst; i++) {
				System.out.print("* ");
			}

			// spaces
			for (int i = 1; i <= nsp; i++) {
				System.out.print("  ");
			}

			// stars
			if (row == n)
				nst = n - 1;
			for (int i = 1; i <= nst; i++) {
				System.out.print("* ");
			}
			nst++;
			nsp -= 2;
			System.out.println();

		}

	}

}
