package Lecture4;

public class ArrayDemo1 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println(arr);
		System.out.println(arr[0] + " " + arr[1]);
		swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);
	}
	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int t = i;
		i = j;
		j = t;
	}

}
