package Lecture7;

public class Array_Self_Except_Opt {

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
		int product = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			left[i] = left[i] * product;
			product = product * arr[i];
		}
		for (int k : left) {
			System.out.print(k + " ");
		}
	}

}
