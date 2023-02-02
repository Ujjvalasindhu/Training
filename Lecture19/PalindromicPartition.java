package Lecture19;

import java.util.ArrayList;

public class PalindromicPartition {
	public static void main(String[] args) {
		String s = "aab";
		ArrayList<ArrayList<String>> ans = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		partition(s, list, 0, ans);
		System.out.println(ans);
	}

	private static void partition(String s, ArrayList<String> list, int i, ArrayList<ArrayList<String>> ans) {
		if (i == s.length()) {
//			System.out.println(list);
			ans.add(new ArrayList<>(list));
//			System.out.println(ans);
			return;
		}

		for (int j = i; j < s.length(); j++) {
			String r = s.substring(i, j + 1);
			if (ispalindrom(r)) {
				list.add(r);
				partition(s, list, j + 1, ans);
				list.remove(list.size() - 1);
			}
		}

	}

	private static boolean ispalindrom(String s) {
		// TODO Auto-generated method stub
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
