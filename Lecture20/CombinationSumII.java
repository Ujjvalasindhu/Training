package Lecture20;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,1,2,7,6,1,5};
		Arrays.sort(arr);
		int target=8;
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
//			if(i>idx && arr[i]==arr[i-1]) continue;
			list.add(arr[i]);
			printCombinations(arr,target-arr[i], list,i+1,ans);
			list.remove(list.size()-1);
			while(i<arr.length-1 && arr[i]==arr[i+1]) {
				i++;
			}
		}
	}

}
