package Lecture16;

public class UniquePermutations {
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
			boolean flag=false;
			for (int j = i+1; j < ques.length(); j++) {
				if(ch==ques.charAt(j)) {
					flag=true;
					break;
				}
			}
			if(!flag)
			permu(ques.substring(0,i)+ques.substring(i+1), ans+ch);
	
		}
	}

}
