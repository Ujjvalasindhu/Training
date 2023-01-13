package Lecture6;

import java.util.Arrays;

public class RepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 1, 3, 2, 5, 4 };
		findRep1(arr);
		findRep2(arr);
		findRep3(arr);

	}

	private static void findRep3(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length - 1;
		int sum = (n * (n + 1)) / 2;
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total - sum);

	}

	private static void findRep2(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println(arr[i]);
			}
		}
	}

	private static void findRep1(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
