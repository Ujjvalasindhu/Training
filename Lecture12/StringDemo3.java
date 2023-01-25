package Lecture12;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		
//		System.out.println(str.charAt(0));
//		
//		System.out.println(str.indexOf('e', 0));
//		System.out.println(str.indexOf('e', 3));
//		
//		System.out.println(str.concat("abc"));
////		str=str.concat("abc");
//		System.out.println(str);
//		
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());

		
//		System.out.println(str);
//		System.out.println(str.substring(0));
//		System.out.println(str.substring(0, 3));
//		System.out.println(str.substring(0, str.length()));

		
		//All SubStrings
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
			System.out.println();
		}

	}

}
