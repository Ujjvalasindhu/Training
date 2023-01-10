package Lecture3;

public class Pattern25 {
	public static void main(String[] args) {
		int n = 5;
		int nst = 1;
		int val = 1;
		for (int row = 1; row <= n; row++) {
			// Space
			for (int i = 1; i <= n - row; i++) {
				System.out.print("  ");
			}
			//Value
			for (int i = 1; i <= nst; i++) {
				System.out.print(val + " ");
				val++;

			}
			nst = nst + 2;
			System.out.println();
		}
	}

}
