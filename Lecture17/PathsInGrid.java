package Lecture17;

public class PathsInGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[3][3];
		printpath(arr, 0, 0, "");
	}

	private static void printpath(int[][] arr, int row, int col, String ans) {
		// TODO Auto-generated method stub

		if (row == arr.length - 1 && col == arr[0].length - 1) {
			System.out.println(ans);
			return;
		}
		if (row >= arr.length || col >= arr[0].length) {
			return;
		}

		printpath(arr, row, col + 1, ans + "H");
		printpath(arr, row + 1, col, ans + "V");

	}

}
