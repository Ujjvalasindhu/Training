package Lecture11;

import java.util.Arrays;

public class AGGCOW {
	public static void main(String[] args) {
		int noc = 3;
		int nos = 5;
		int[] stalls = { 1, 2, 4, 8, 9 };
		Arrays.sort(stalls);
		System.out.println(MaxDistance(noc, nos, stalls));
	}

	private static int MaxDistance(int noc, int nos, int[] stalls) {
		int ans = 0;
		int start=stalls[0];
		int end=stalls[stalls.length-1];
		while(start<=end) {
			int mid=(start+end)/2;
			if(isitpossible(mid,noc,stalls)) {
				ans=mid;
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return ans;
	}

	private static boolean isitpossible(int mid, int noc, int[] stalls) {
		// TODO Auto-generated method stub
		int cp=1;
		int lastplaced=stalls[0];
		
		for (int i = 1; i < stalls.length; i++) {
			if((stalls[i]-lastplaced)>=mid) {
				cp++;
				lastplaced=stalls[i];
			}
		}
		if(cp>=noc) return true;
		return false;
	}

}
