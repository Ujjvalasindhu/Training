package Lecture1;

public class Pattern13 {
	public static void main(String[] args) {
		int n = 5;
		int nst = 1;
		for (int row = 1; row <= 2 * n - 1; row++) {

			for (int i = 1; i <= nst; i++) {
				System.out.print("* ");
			} 

			if (row < n) {
				nst += 1;
			} else {
				nst -= 1;
			}
			System.out.println();

		}
	}

}
