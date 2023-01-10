package Lecture4;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 4, 3, 2, 1 };
		
		for (int i = 0; i < arr.length; i++) {
			int key= i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[key])
					key=j;
			} 
			int t=arr[i];
			arr[i]=arr[key];
			arr[key]=t;
			
		}
		
		
		
		for (int k : arr) {
			System.out.print(k + " ");
		}
	}

}
