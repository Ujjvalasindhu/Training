package Lecture7;

public class Array_Self_Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 };
		int[] left = new int[arr.length];
		left[0] = 1;
		int sum = 1;
		for (int i = 0; i < left.length; i++) {
			left[i] = sum;
			sum *= arr[i];
		}
		int[] right = new int[arr.length];
		sum = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			right[i] = sum;
			sum = sum * arr[i];
		}
		for (int i = 0; i < right.length; i++) {
			right[i]=right[i]*left[i];
		}
		for (int k : right) {
			System.out.print(k+" ");
		}

	}

}
