package Lecture5;

public class BubleSortOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2,3,4,1,2};

		int val = 1;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length - 1; j++) {
				System.out.println(val++);
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
					flag = false;
				}
			}
			if (flag == true)
				break;
		}

//		for (int k : arr) {
//			System.out.print(k + " ");
//		}
	}

}
