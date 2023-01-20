package Lecture10;

public class MatrixSearch {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int target = 17;
		Search(arr, target);
		SearchOpt(arr, target);
	}

	private static void SearchOpt(int[][] arr, int target) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = arr[0].length - 1;
		int flag = 0;
		while (j >= 0 && i < arr.length) {
			if (arr[i][j] == target) {
				flag++;
				break;
			} else if (arr[i][j] < target) {
				i++;
			} else {
				j--;
			}
		}
		if (flag == 1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

	private static void Search(int[][] arr, int target) {
		// TODO Auto-generated method stub
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == target) {
					flag++;
				}
			}
		}
		if (flag == 0) {
			System.out.println("False");
		} else {
			System.out.println("True");
		}

	}

}
