package Lecture4;

public class ArrayDemo3 {
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

	private static void swap(int[] a, int[] b) {
		// TODO Auto-generated method stub
		
		int[] t = a;
		a = b;
		b = t;
//		a[0]=10000;
	}
}
