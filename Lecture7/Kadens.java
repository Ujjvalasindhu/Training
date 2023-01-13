package Lecture7;

public class Kadens {
	public static void main(String[] args) {
		int arr[] = { 1, 2, -3, 4, 5 };
		System.out.println(maxsum(arr));
	}

	private static int maxsum(int[] arr) {
		// TODO Auto-generated method stub
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0)
				sum = 0;
		}
		return ans;
	}

}
