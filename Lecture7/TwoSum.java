package Lecture7;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 9;
		arr = pair(arr, target);
		for (int k : arr) {
			System.out.print(k + " ");
		}
	}

	private static int[] pair(int[] arr, int target) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					int a[] = { i, j };
					return a;
				}
			}
		}
		return arr;

	}

}
