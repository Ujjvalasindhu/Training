package Lecture1;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		for (int row = 1; row <= n; row++) {

			// spaces
			for (int i = 1; i <= n - row; i++) {
				System.out.print(" ");
			}
			// Stars
			for (int i = 1; i <= row; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
