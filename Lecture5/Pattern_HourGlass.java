package Lecture5;

public class Pattern_HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int nsp = 0;
		int nst = 2 * n + 1;
		int start = n;
		for (int row = 1; row <= 2 * n + 1; row++) {
			// space
			for (int i = 1; i <= nsp; i++) {
				System.out.print("  ");
			}
			// value
			int val = start;
			for (int i = 1; i <= nst; i++) {
				System.out.print(val + " ");
				if (i <= nst / 2) {
					val--;
				} else {
					val++;
				}
			}
			if (row <= n) {
				start--;
				nsp++;
				nst -= 2;
			} else {
				start++;
				nsp--;
				nst += 2;
			}
			System.out.println();

		}

	}

}
