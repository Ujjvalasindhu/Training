package Lecture20;

import java.util.ArrayList;

public class CombonationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,6,7};
		int target=7;
		int idx=0;
		ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
		ArrayList<Integer>list= new ArrayList<>();
		printCombinations(arr,target,list,idx,ans);
		System.out.println(ans);
		
	}

	private static void printCombinations(int [] arr, int target, ArrayList<Integer> list,int idx,ArrayList<ArrayList<Integer>>ans) {
		// TODO Auto-generated method stub
		if(target==0) {
			ans.add(new ArrayList<>(list));
			return;
		}	
		if(target<0)return;
		for (int i = idx; i < arr.length; i++) {
			list.add(arr[i]);
			printCombinations(arr,target-arr[i], list,i,ans);
			list.remove(list.size()-1);
		}
		
	}

}
