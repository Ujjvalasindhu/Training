package Lecture5;

import java.util.Scanner;

public class OddEvenBackInDelhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.close();
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			check(n);
			t--;
		}
	}

	private static void check(int n) {
		// TODO Auto-generated method stub
		int oddsum = 0;
		int evensum = 0;
		while (n != 0) {
			int rem = n % 10;
			if (rem % 2 == 0) {
				evensum += rem;
			} else {
				oddsum += rem;
			}
			n = n / 10;
		}
		if (oddsum % 3 == 0 || evensum % 4 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
