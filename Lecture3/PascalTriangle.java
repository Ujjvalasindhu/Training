package Lecture3;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nst = 1;
		for (int row = 0; row <= n; row++) {
			int ncr = 1;
			for (int i = 0; i < nst; i++) {
				System.out.print(ncr+" ");
				ncr = ((row - i) * ncr) / (i + 1);
			}
			nst++;
			System.out.println();
		}

	}

}
