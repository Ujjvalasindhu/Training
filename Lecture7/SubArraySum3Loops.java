package Lecture7;

public class SubArraySum3Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, -3, 4, 5 };
		System.out.println(maxsum(arr));
	}

	private static int maxsum(int[] arr) {
		// TODO Auto-generated method stub
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}
				ans = Math.max(ans, sum);
			}
		}
		return ans;
	}

}
