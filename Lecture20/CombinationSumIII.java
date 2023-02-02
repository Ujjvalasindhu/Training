package Lecture20;

import java.util.ArrayList;

public class CombinationSumIII {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		int k = 3;
		int n = 7;
		CombSum(k, n, list, ans, 1);
		System.out.println(ans);
	}

	private static void CombSum(int n, int target, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans,
			int idx) {
		// TODO Auto-generated method stub

		if (list.size() == n && target == 0) {
			ans.add(new ArrayList<>(list));
			return;
		}
		if (target < 0)
			return;

		for (int i = idx; i <= 9; i++) {
			list.add(i);
			CombSum(n, target - i, list, ans, i + 1);
			list.remove(list.size() - 1);
		}
	}

}
