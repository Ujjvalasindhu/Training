package Lecture3;

public class MethodsDemo {
	public static void main(String[] args) {
		int a = 12;
		int b = 13;
		System.out.println(addition(a, b));
//		MethodsDemo m = new MethodsDemo();
//		System.out.println(m.Subtract(a, b));
	}

//	private int Subtract(int a, int b) {
//		return b - a;
//	}

	private static int addition(int a, int b) {
		int c = a + b;
		System.out.println(subtract(a, b));
		return c;

	}

	private static int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;

	}

}
