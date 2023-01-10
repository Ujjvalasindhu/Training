package Lecture2;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp = 0;
		int nst = n;

		for (int row = 1; row <= 2 * n - 1; row++) {
			// spaces
			for (int i = 1; i <= nsp; i++) {
				System.out.print("  ");
			}

			// stars
			for (int i = 1; i <= nst; i++) {
				System.out.print("* ");
			}

			if (row < n) {
				nst--;
				nsp += 2;
			} else {
				nst++;
				nsp -= 2;
			}
			System.out.println();

		}
	}

}
