package Lecture10;

public class ZaggedArray {
	public static void main(String[] args) {
		
		int[][] arr = new int[4][];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		//Print Length Of Each Array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].length);
		}
		
		//Input
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = j + 1;
			}
		}
		
		System.out.println();
		
		//Print
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
