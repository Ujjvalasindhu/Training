package Lecture1;

public class Pattern2 {
	public static void main(String[] args) {
		int n = 5;

		for (int row = 0; row < n; row++) {

			for (int i = 0; i <= row; i++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

}
