package Lecture19;

public class MergTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 5, 11, 15, 17 };
		int[] brr = { 3, 6, 9, 14, 21 };
		int[] ans = new int[arr.length + brr.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr.length && j < brr.length) {

			if (arr[i] < brr[j]) {
				ans[k] = arr[i];
				i++;
				k++;
			} else {
				ans[k] = brr[j];
				j++;
				k++;
			}
		}

		while (i < arr.length) {
			ans[k] = arr[i];
			i++;
			k++;
		}

		while (j < brr.length) {
			ans[k] = brr[j];
			j++;
			k++;
		}
		for (int k1 : ans) {
			System.out.print(k1 + " ");
		}

	}

}
