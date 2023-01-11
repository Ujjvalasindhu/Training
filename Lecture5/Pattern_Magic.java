package Lecture5;

public class Pattern_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 9;
		int nst = n;
		int nsp = -1;
		for (int row = 1; row <= 2 * n - 1; row++) {

			// stars
			for (int i = 1; i <= nst; i++) {
				System.out.print("*");
			}
			// spaces
			for (int i = 1; i <= nsp; i++) {
				System.out.print(" ");
			}
			// stars
			int i = 1;
			if (row == 1 || row == 2 * n - 1) {
				i = 2;
			}
			for (; i <= nst; i++) {
				System.out.print("*");
			}
			if (row < n) {
				nst -= 1;
				nsp += 2;
			} else {
				nst += 1;
				nsp -= 2;
			}
			System.out.println();

		}

	}

}
