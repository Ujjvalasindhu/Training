package Lecture12;

public class GoodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="cbaeicdeaiou";
		int ans=0;
		int count=0;
		int i=0;
		while(i<s.length()) {
			char ch =s.charAt(i);
			if(isVovel(ch)) {
				count++;
			}else {
				ans=Math.max(ans, count);
				count=0;
			}
			i++;
		}
		ans=Math.max(ans, count);
		System.out.println(ans);

	}

	private static boolean isVovel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}

		return false;
	}

}
