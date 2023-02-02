package Lecture18;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount=10;
		int arr[]= {2,3,5,6};
		change(amount,arr,"");
	}
	private static void change(int amount, int[] arr,String ans) {
		// TODO Auto-generated method stub
		
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		
		if(amount<0)return;
		
		for (int i = 0; i < arr.length; i++) {
//			if(amount-arr[i]>=0)
			change(amount-arr[i], arr,ans+arr[i]);
		}
		
		
	}

}
