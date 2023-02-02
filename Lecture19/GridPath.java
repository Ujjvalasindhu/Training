package Lecture19;

public class GridPath {
	// TODO Auto-generated method stub
	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		System.out.println(printpath(arr, 0, 0, ""));
	}

	private static int printpath(int[][] arr, int row, int col, String ans) {
		// TODO Auto-generated method stub

		if (row == arr.length - 1 && col == arr[0].length - 1) {
			return 1;
		}
		if (row >= arr.length || col >= arr[0].length || col < 0 || row < 0 || arr[row][col] == 1) {
			return 0;
		}

//		int[] r = { 0, 0, 1, -1 };
//		int[] c = { 1, -1, 0, 0 };

		int[] r = { 0, 0, 1, -1, 1, -1, -1, 1 };
		int[] c = { 1, -1, 0, 0, 1, -1, 1, -1 };

		arr[row][col] = 1;
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			count += printpath(arr, row + r[i], col + c[i], ans);
		}
		arr[row][col] = 0;
		return count;

	}

}

//printpath(arr, row, col + 1, ans + "H");
//printpath(arr, row + 1, col, ans + "V");
//printpath(arr, row, col - 1, ans + "H");
//printpath(arr, row - 1, col, ans + "V");