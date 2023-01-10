package Lecture4;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { };
		swap(arr);
		for (int k : arr) {
			System.out.print(k + " ");
		}
	}
	private static void swap(int[] arr) {
		// TODO Auto-generated method stub
		int st = 0;
		int end = arr.length - 1;

		while (st < end) {
			int t = arr[st];
			arr[st] = arr[end];
			arr[end] = t;
			st++;
			end--;
		}
	}

}
