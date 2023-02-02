package Lecture20;

import java.util.ArrayList;

public class Combinations {
	public static void main(String[] args) {
		int n=4;
		int k=2;
		int idx=1;
		ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
		ArrayList<Integer>list= new ArrayList<>();
		printCombinations(n,k,list,idx,ans);
		System.out.println(ans);
		
	}

	private static void printCombinations(int n, int k, ArrayList<Integer> list,int idx,ArrayList<ArrayList<Integer>>ans) {
		// TODO Auto-generated method stub
		
		if(k==0) {
			ans.add(new ArrayList<>(list));
			return;
		}
		
		
		for (int i = idx; i <= n; i++) {
			list.add(i);
			printCombinations(n, k-1, list,i+1,ans);
			list.remove(list.size()-1);
			
		}
		
		
	}

}
