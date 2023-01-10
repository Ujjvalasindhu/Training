package Lecture1;

public class CheckPrime {
	public static void main(String[] args) {
		int n = 14;

		boolean flag = false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}

	}

}
