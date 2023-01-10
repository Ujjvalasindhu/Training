package Lecture3;

public class VariablesDemo2 {

	static int val = 100;

	public static void main(String[] args) {
		System.out.println("hey");
		int x = 60;
		System.out.println(val);
		fun(x);
		System.out.println(val);
	}

	public static void fun(int x) {
		System.out.println(x);
//		int val = 19;
		val = 120;
		System.out.println(val);
	}

}
