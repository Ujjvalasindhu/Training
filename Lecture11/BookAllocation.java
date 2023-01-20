package Lecture11;

public class BookAllocation {
	public static void main(String[] args) {
		int nob = 4;
		int nos = 2;
		int[] books = { 12, 34, 67, 90 };
		System.out.println(maxPages(nob, nos, books));
	}

	private static int maxPages(int nob, int nos, int[] books) {
		int ans = 0;
		int start = 0;
		int end = 0;
		for (int k : books) {
			end += k;
		}
		while (start <= end) {
			int mid = (start + end) / 2;
			if (isitpossible(mid, nos, books)) {
				ans = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}

	private static boolean isitpossible(int mid, int nos, int[] books) {
		// TODO Auto-generated method stub
		int st = 1;
		int pr = 0;
		int i = 0;
		while (i < books.length) {
			if (books[i] + pr <= mid) {
				pr += books[i];
				i++;
			} else {
				st++;
				pr = 0;
			}
			if (st > nos)
				return false;
		}
		return true;
	}

}
