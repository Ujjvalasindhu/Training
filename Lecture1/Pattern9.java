package Lecture1;

public class Pattern9 {
	public static void main(String[] args) {
		int n=5;
		int nst=1;
		for(int row=1;row<=n;row++) {
			
			//space
			
			for(int i=1;i<=n-row;i++) {
				System.out.print("  ");
			}
			for(int i=1;i<=nst;i++) {
				System.out.print("* ");
			}
			nst=nst+2;
			System.out.println();
			
			
		}
		
	}

}
