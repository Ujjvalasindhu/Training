package Lecture4;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		int brr[] = new int[5];
		for (int i = 0; i < brr.length; i++) {
			arr[i] = i + 10;
		}
		for (int i = 0; i < brr.length; i++) {
			brr[i] = i + 20;
		}
		System.out.println(arr[0] + " " + brr[0]);
		swap(arr, brr);
		System.out.println(arr[0] + " " + brr[0]);
	}

	private static void swap(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int t = arr[0];
		arr[0] = brr[0];
		brr[0] = t;
	}
}
