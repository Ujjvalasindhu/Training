package Lecture4;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = new int[5];
//		int[] brr = { 1, 2, 3, 4 };
//		System.out.println(brr);
		System.out.println(arr);
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
//
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 100;
		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//
//		// For Each Loop
		for (int k : arr) {
			System.out.print(k + " ");
		}
	}

}
