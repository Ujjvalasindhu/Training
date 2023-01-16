package Lecture8;

public class MajorityElementOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 2, 2, 1, 2, 2 };

		int ans = 0;
		int count = 0;
		int i = 0;
		while (i < arr.length) {
			if (count == 0) {
				ans = arr[i];
				count++;
			} else if (arr[i] == ans) {
				count++;
			} else {
				count--;
			}
			i++;
		}
		System.out.println(ans);

	}

}
