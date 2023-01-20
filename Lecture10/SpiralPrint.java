package Lecture10;

public class SpiralPrint {

	public static void main(String[] args) {
		int arr[][] = { { 10, 11, 12, 13 }, { 20, 21, 22, 23 }, { 30, 31, 32, 33 } };
		spiral(arr);
	}

	private static void spiral(int[][] arr) {
		int cmin = 0;
		int rmin = 0;
		int cmax = arr[0].length - 1;
		int rmax = arr.length - 1;
		int total = arr.length*arr[0].length;
		int count = 0;

		while (count < total) {
			for (int i = cmin; i <= cmax && count < total; i++) {
				System.out.print(arr[rmin][i] + " ");
				count++;
			}
			rmin++;
			System.out.println();
			for (int i = rmin; i <= rmax && count < total; i++) {
				System.out.print(arr[i][cmax] + " ");
				count++;
			}
			cmax--;
			System.out.println();
			for (int i = cmax; i >= cmin && count < total; i--) {
				System.out.print(arr[rmax][i] + " ");
				count++;
			}
			rmax--;
			System.out.println();
			for (int i = rmax; i >= rmin && count < total; i--) {
				System.out.print(arr[i][cmin] + " ");
				count++;
			}
			System.out.println();
			cmin++;
		}
	}

}
