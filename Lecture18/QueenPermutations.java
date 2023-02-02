package Lecture18;

public class QueenPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int q=2;
		  boolean [] arr= new boolean[4];
		  Permutations(arr,q,"",1,0);
	}

	private static void Permutations(boolean[] arr, int q,String ans,int qp,int li) {
		// TODO Auto-generated method stub
		if(q==0) {
			System.out.println(ans);
			return;
		}
		for (int i = li; i < arr.length; i++) {
			if(arr[i]==false) {
				arr[i]=true;
				Permutations(arr,q-1,ans+"B"+i+"Q"+qp,qp+1,i);
			}
			arr[i]=false;	
		}
		
	}

}
