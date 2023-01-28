package Lecture17;

public class MaxPathSum {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 7, 10, 12, 15, 30, 34 };
		int[] brr = { 1, 5, 7, 8, 10, 15, 16, 19 };

		int ans = 0;

		int i = 0;
		int j = 0;
		int p1 = 0;
		int p2 = 0;
		int sum1 = 0;
		int sum2 = 0;

		while (i < arr.length && j < brr.length) {

			if (arr[i] < brr[j]) {
				sum1 += arr[i];
				i++;
			}

			else if (arr[i] > brr[j]) {
				sum2 += brr[j];
				j++;
			} else {
				ans += arr[i];
				ans += Math.max(sum1, sum2);
				sum1 = 0;
				sum2 = 0;
				p1 = i + 1;
				p2 = j + 1;
				i++;
				j++;
			}

		}
		System.out.println(ans);
		sum1=0;
		sum2=0;
		while(p1<arr.length) {
			sum1+=arr[p1];
			p1++;
		}
		
		while(p2<brr.length) {
			sum2+=brr[p2];
			p2++;
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
		ans+=Math.max(sum1, sum2);
		System.out.println(ans);

	}

}
