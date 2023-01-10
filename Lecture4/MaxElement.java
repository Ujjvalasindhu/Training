package Lecture4;

public class MaxElement {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 3, 90, 40, 3, 6 };
		System.out.println(max(arr));
	}

	private static int max(int[] arr) {
		// TODO Auto-generated method stub
		int ans = 0;

		for (int i = 0; i < arr.length; i++) {
			if (ans < arr[i])
				ans = arr[i];
		}

		return ans;
	}

}
