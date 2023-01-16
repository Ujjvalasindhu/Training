package Lecture8;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 2, 2, 1, 2, 2 };

		int ans = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int lcount = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					lcount++;
				}
			}
			if (lcount > count) {
				ans = arr[i];
				count = lcount;
			}
		}
		System.out.println(ans);

	}

}
