package Lecture15;

public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		climb(n,"");
	}

	private static void climb(int n, String ans) {
		// TODO Auto-generated method stub
		
		if(n==0) {
			System.out.println(ans);
			return;
		}
		if(n<0) return;
		
		
		climb(n-1, ans+"1");
		climb(n-2, ans+"2");
		climb(n-3, ans+"3");
	
	}

}
