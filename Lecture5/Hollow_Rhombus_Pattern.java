package Lecture5;

public class Hollow_Rhombus_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp = n - 1;
		for (int row = 1; row <= n; row++) {
			// spaces
			for (int i = 1; i <= nsp; i++) {
				System.out.print(" ");
			}

			// stars
			if (row == 1 || row == n)
				for (int i = 1; i <= n; i++) {
					System.out.print("*");
				}

			// Star
			if (row > 1 && row < n) {
				System.out.print("*");
			}

			// Space
			if (row > 1 && row < n)
			for (int i = 1; i <= n - 2; i++) {
				System.out.print(" ");
			}

			// Star
			if (row > 1 && row < n) {
				System.out.print("*");
			}
			nsp = nsp - 1;
			System.out.println();

		}
	}
}