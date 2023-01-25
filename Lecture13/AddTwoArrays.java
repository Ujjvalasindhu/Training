package Lecture13;

import java.util.ArrayList;

public class AddTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {9,9,9};
		int [] brr= {9,9,9};
		
		ArrayList<Integer>list= new ArrayList<>();
		int i=arr.length-1;
		int j=brr.length-1;
		int carry=0;
		while(i>=0 || j>=0) {
			int sum=carry;
			if(i>=0) {
				sum+=arr[i];
				i--;
			}
			if(j>=0) {
				sum+=brr[j];
				j--;
			}
			carry=sum/10;
			list.add(0,sum%10);
		}
		if(carry>0) {
			list.add(0,carry);
		}
		System.out.println(list);

	}

}
