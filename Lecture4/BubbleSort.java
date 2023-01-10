package Lecture4;


public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1-i; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}

		for (int k : arr) {
			System.out.print(k + " ");
		}

	}

}
