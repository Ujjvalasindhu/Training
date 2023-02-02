package Lecture18;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
			
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			int c3=sc.nextInt();
			int c4=sc.nextInt();
			
			int n=sc.nextInt();
			int m=sc.nextInt();

			int [] rik= new int [n];
			for (int i = 0; i < rik.length; i++) {
				rik[i]=sc.nextInt();
			}
			
			int [] cab= new int [m];
			for (int i = 0; i < cab.length; i++) {
				cab[i]=sc.nextInt();
			}
			
			int Rsum=0;
			for (int i = 0; i < n; i++) {
				Rsum+=Math.min(rik[i]*c1, c2);
			}
			Rsum=Math.min(c3, Rsum);
			
			
			int Csum=0;
			for (int i = 0; i < m; i++) {
				Csum+=Math.min(cab[i]*c1, c2);
			}
			Csum=Math.min(c3, Csum);
			
			int ans=Math.min(Rsum+Csum,c4);
			System.out.println(ans);
			
			
		}
		sc.close();

	}

}
