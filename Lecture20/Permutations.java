package Lecture20;

import java.util.ArrayList;

public class Permutations {
	public static void main(String[] args) {
		int[] arr = { 42, 43, 44 };
		ArrayList<Integer> list = new ArrayList<>();
		print(arr, list,0);
	}

	private static void print(int[] arr, ArrayList<Integer> list, int idx) {
		// TODO Auto-generated method stub
		if(list.size()==arr.length) {
			System.out.println(list);
			return;
		}
		
		
//		for (int i = 0; i < arr.length; i++) {
//			if(!list.contains(arr[i])) {
//				list.add(arr[i]);
//				print(arr, list);
//				list.remove(list.size()-1);	
//			}
//		}
		
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]!='*') {
//				list.add(arr[i]);
//				int k=arr[i];
//				arr[i]='*';
//				print(arr, list);
//				list.remove(list.size()-1);	
//				arr[i]=k;
//			}
//		}
		
// we can use visited array also.

		
		for (int i = idx; i < arr.length; i++) {
				list.add(arr[i]);
				swap(arr,i,idx);
				print(arr, list,idx+1);
				swap(arr,i,idx);
				list.remove(list.size()-1);	
			}
		}

	private static void swap(int[] arr, int i, int idx) {
		// TODO Auto-generated method stub
		int t=arr[i];
		arr[i]=arr[idx];
		arr[idx]=t;
		
	}
		
		
	}


