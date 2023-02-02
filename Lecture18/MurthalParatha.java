package Lecture18;

import java.util.Scanner;

public class MurthalParatha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int l = sc.nextInt();
		int[] rank = new int[l];
		for (int i = 0; i < rank.length; i++) {
			rank[i] = sc.nextInt();
		}

		int start = 0;
		int end = 0;
		int k = 1;
		for (int i = 0; i < p; i++) {
			end += rank[rank.length - 1] * k;
			k++;
		}
		int ans = 0;
		while (start <= end) {
			int mid = (start + end) / 2;

			if (isitpossible(mid, p, rank)) {
				ans = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		System.out.println(ans);
		sc.close();
	}

	private static boolean isitpossible(int mid, int p, int[] rank) {
		
		int tnp=0;
		for (int i = 0; i < rank.length; i++) {
			int r=rank[i];
			int nop=0;
			int k=1;
			int time=0;
			while(time+r*k<=mid) {
				time+=r*k;
				nop++;
				k++;
			}
			tnp+=nop;
		}
		if(tnp>=p)
			return true;
		
		
		return false;
	}

}
