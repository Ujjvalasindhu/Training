package Lecture10;

public class Transpose {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		display(arr);
		transpose(arr);
		display(arr);
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
