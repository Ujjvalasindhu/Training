package Lecture10;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		display(arr);
		transpose(arr);
		reverse(arr);
		display(arr);
	}

	private static void reverse(int[][] arr) {
 		for (int i = 0; i < arr.length; i++) {
			int start = 0;
			int end = arr[0].length - 1;
			while (start < end) {
				int t = arr[i][start];
				arr[i][start] = arr[i][end];
				arr[i][end] = t;
				start++;
				end--;
			}
		}

	}

	private static void transpose(int[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				int t = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = t;
			}
		}
	}
	private static void display(int[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
