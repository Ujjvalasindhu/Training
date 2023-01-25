package Lecture14;

public class FirstOcc {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,3};
		int item=3;
		System.out.println(Occ(arr,item,0));	
		
	}

	private static int Occ(int[] arr, int item,int idx) {
		// TODO Auto-generated method stub
		
		if(idx==arr.length) {
			return -1;
		}
		
		if(arr[idx]==item) {
			return idx;
		}
		return Occ(arr, item, idx+1);
	}

}
