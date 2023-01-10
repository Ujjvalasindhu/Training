package Lecture4;


public class RunningSum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		sum(arr);
		for (int k : arr) {
			System.out.print(k + " ");
		}
	}

	private static void sum(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i] + arr[i - 1];
		}
	}

}
