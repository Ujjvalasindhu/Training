package Lecture16;

public class Permutation {
	public static void main(String[] args) {
		String ques="aba";
		permu(ques,"");	
	}

	private static void permu(String ques, String ans) {
		
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < ques.length(); i++) {
			char ch =ques.charAt(i);
			
			String a=ques.substring(0,i);
			String b=ques.substring(i+1);
			
			permu(a+b, ans+ch);
	
		}
	}

}
