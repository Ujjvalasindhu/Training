package Lecture12;
public class CBNumber {
	public static void main(String[] args) {
		String str = "81615";
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int si = 0; si <= str.length() - len; si++) {
				int ei = si + len;
				String s = str.substring(si, ei);
				if (isCbNumber(Long.parseLong(s)) && checkvisited(visited, si, ei)) {
					count++;
					for (int i = si; i < ei; i++) {
						visited[i] = true;
					}
				}
			}
		}
		System.out.println(count);
	}

	private static boolean checkvisited(boolean[] visited, int si, int ei) {
		for (int i = si; i < ei; i++) {
			if (visited[i] == true)
				return false;
		}
		return true;
	}

	private static boolean isCbNumber(long val) {
 
		// Point 1
		if (val == 1 || val == 0)
			return false;

		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		
		// Point 2
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val)
				return true;
		}

		// Point 3
		for (int i = 0; i < arr.length; i++) {
			if (val % arr[i] == 0)
				return false;
		}

		return true;
	}

}
