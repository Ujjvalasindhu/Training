package Lecture8;

public class NextPermutation {
	private static void display(int[] arr) {
		// TODO Auto-generated method stub
		for (int k : arr) {
			System.out.print(k + " ");
		}
	}
	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 1, 2 };
		nextpermu(arr);
		display(arr);
	}
	private static void nextpermu(int[] arr) {
		int p = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}
		System.out.println(p);
		int q = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[p] < arr[i]) {
				q = i;
				break;
			}
		}
		System.out.println(q);
		if (p == 0 && q == 0) {
			reverse(arr, 0, arr.length - 1);
			return;
		}
		int t = arr[p];
		arr[p] = arr[q];
		arr[q] = t;
		reverse(arr, p + 1, arr.length - 1);
	}

	private static void reverse(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		while (start < end) {
			int t = arr[start];
			arr[start] = arr[end];
			arr[end] = t;
			start++;
			end--;
		}

	}

}
