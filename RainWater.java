package Lecture8;

public class RainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(WaterStored(arr));
//		display(arr);

	}

	private static int WaterStored(int[] arr) {
		// TODO Auto-generated method stub
		int water = 0;
		int[] leftmax = new int[arr.length];
		leftmax[0] = arr[0];
		int[] rightmax = new int[arr.length];
		rightmax[rightmax.length - 1] = arr[arr.length - 1];

		for (int i = 1; i < leftmax.length; i++) {
			leftmax[i] = Math.max(leftmax[i - 1], arr[i]);
		}
		display(leftmax);
		
		for(int i=rightmax.length-2;i>=0;i--) {
			rightmax[i]=Math.max(arr[i], rightmax[i+1]);
		}
		System.out.println();
		display(rightmax);
		for(int i=0;i<arr.length;i++) {
			water+=Math.min(leftmax[i], rightmax[i])-arr[i];
		}
		System.out.println();
		return water;
	}

	private static void display(int[] arr) {
		// TODO Auto-generated method stub
		for (int k : arr) {
			System.out.print(k + " ");
		}

	}

}
