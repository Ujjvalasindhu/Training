package Lecture7;

public class SortColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 0, 1, 2, 0, 1, 2 };
		sort(arr);
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}
	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		int st = 0;
		int mid = 0;
		int end = arr.length - 1;
		while (mid <= end) {
			if (arr[mid] == 0) {
				int t = arr[mid];
				arr[mid] = arr[st];
				arr[st] = t;
				mid++;
				st++;
			} else if (arr[mid] == 2) {
				int t = arr[mid];
				arr[mid] = arr[end];
				arr[end] = t;
				end--;
			} else {
				mid++;
			}

		}

	}

}
