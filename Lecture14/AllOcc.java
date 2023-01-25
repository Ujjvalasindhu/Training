package Lecture14;

public class AllOcc {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 5, 2 };
		int item = 2;
		int idx = 0;
		arr = Occ(arr, item, idx, 0);
		for (int k : arr) {
			System.out.print(k + " ");
		}
	}

	private static int[] Occ(int[] arr, int item, int idx, int count) {
		if (idx == arr.length) {
			return new int[count];
		}

		if (arr[idx] == item) {
			count += 1;
		}
		int[] ans = Occ(arr, item, idx + 1, count);

		if (arr[idx] == item) {
			ans[count - 1] = idx;
		}
		return ans;
	}

}
