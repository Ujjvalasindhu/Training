package Lecture2;

public class InverseNumber {
	public static void main(String[] args) {
		int n = 32145;
		int place = 1;
		int ans = 0;
		while (n != 0) {
			int rem = n % 10;
			int val = place * (int) Math.pow(10, rem-1);
			ans = ans + val;
			n = n / 10;
			place++;
		}
		System.out.println(ans);
	}

}
