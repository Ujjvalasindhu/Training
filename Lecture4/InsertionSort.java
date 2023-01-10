package Lecture4;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 4, 3, 2, 1 };

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			j++;
			arr[j] = key;

		}

		for (int k : arr) {
			System.out.print(k + " ");
		}
	}

}
