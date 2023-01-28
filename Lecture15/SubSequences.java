package Lecture15;

public class SubSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ques="abc";
		Print(ques,"");
	}
	private static void Print(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch =ques.charAt(0);
		Print(ques.substring(1), ans+ch);
		Print(ques.substring(1),ans);	
	}

}
