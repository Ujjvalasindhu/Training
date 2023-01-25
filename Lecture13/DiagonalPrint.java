package Lecture13;

import java.util.ArrayList;

public class DiagonalPrint {
	public static void main(String[] args) {
		int [][] arr= {{1, 2, 3, 4},
					   {5, 6 ,7, 8},
				       {9, 10,11,12},
				       {13,14,15,16}
				       };
		ArrayList<ArrayList<Integer>>ans= new ArrayList<>();
		Print(arr,ans);
	}

	private static void Print(int[][] arr, ArrayList<ArrayList<Integer>> ans) {
		int cmin=0;
//		int rmin=0;
		int rmax=arr.length-1;
		int cmax=arr[0].length-1;
		
		for (int col = cmin; col <= cmax; col++) {
			ArrayList<Integer>list= new ArrayList<>();
			int r=0;
			int c=col;
			while(c>=0) {
				if(col%2==0) {
					list.add(0,arr[r][c]);
				}else {
					list.add(arr[r][c]);
				}
				c--;
				r++;
			}
			ans.add(list);
		}
		for (int row = 1; row <= rmax; row++) {
			ArrayList<Integer>list= new ArrayList<>();
			int r=row;
			int c=cmax;
			while(r<=rmax) {
				if(row%2!=0) {
					list.add(0,arr[r][c]);
				}else {
					list.add(arr[r][c]);
				}
				c--;
				r++;
			}
			ans.add(list);
		}
		System.out.println(ans);
		
	}

}
