package Lecture17;

public class NokiaKeypad {
	static String arr[] = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ques = "12";
		combinations(ques, "");
	}
	private static void combinations(String ques, String ans) {
		// TODO Auto-generated method stub

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		int idx = ch - '0'; // ch-48
		String str = arr[idx];
		for (int i = 0; i < str.length(); i++) {
			combinations(ques.substring(1), ans + str.charAt(i));

		}
	}

}
