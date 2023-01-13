package Lecture7;

public class ReverseArrayOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 10;
		reverse(arr, k);
	}

	private static void reverse(int[] arr, int k) {
		// TODO Auto-generated method stub
		k = k % arr.length;
		// step1
		reverse(arr, 0, arr.length - 1 - k);
		// step2
		reverse(arr, arr.length - k, arr.length - 1);
		// step3
		reverse(arr, 0, arr.length - 1);

		for (int k1 : arr) {
			System.out.print(k1+" ");
		}
	}

	private static void reverse(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		while (start < end) {
			int t = arr[start];
			arr[start] = arr[end];
			arr[end] = t;
			start++;
			end--;
		}

	}

}
