package Lecture7;

public class StockBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 2, 1, 15, 3, 10 };
		
		int futureprice[] = new int[arr.length];
		futureprice[arr.length - 1] = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {
			futureprice[i] = Math.max(arr[i], futureprice[i + 1]);
		}
		
		for (int k : futureprice) {
			System.out.print(k + " ");
		}
		
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = Math.max(ans, futureprice[i] - arr[i]);
		}
		
		System.out.println();
		System.out.println(ans);

	}

}
