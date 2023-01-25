package Lecture12;

public class PalindromicSubString {
	public static void main(String[] args) {
		String str = "nitin";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String s = str.substring(i, j);
				if (ispalindrom(s)) {
					System.out.println(s);
				}
			}
		}
	}

	private static boolean ispalindrom(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
