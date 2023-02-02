package Lecture18;

public class QueenCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int q=2;
		  boolean [] arr= new boolean[4];
		  combinations(arr,q,"",1);
	}

	private static void combinations(boolean[] arr, int q,String ans,int qp) {
		// TODO Auto-generated method stub
		if(q==0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==false) {
				arr[i]=true;
				combinations(arr,q-1,ans+"B"+i+"Q"+qp,qp+1);
			}
			arr[i]=false;	
		}
		
	}

}
