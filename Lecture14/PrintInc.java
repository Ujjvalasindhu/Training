package Lecture14;

public class PrintInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(5);

	}

	private static void print(int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return;
		}
		System.out.println(n);
		print(n - 1);
		System.out.println(n);

	}

}
