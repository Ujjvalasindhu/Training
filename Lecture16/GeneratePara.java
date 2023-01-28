package Lecture16;

public class GeneratePara {
	public static void main(String[] args) {
		int n=3;
		para(n,"",0,0);
	}

	private static void para(int n, String ans,int open , int close) {
		// TODO Auto-generated method stub
		if(open==n&&close==n) {
			System.out.println(ans);
			return;
		}
		if(open<n) {
			para(n, ans+"(", open+1, close);
		}
		if(close<open) {
			para(n, ans+")", open, close+1);
		}	
	}
}
