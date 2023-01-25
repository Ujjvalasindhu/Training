package Lecture12;

public class StringDemo2 {
	public static void main(String[] args) {
		
		// ==(compares address) 
		// equals(compares content)
		
		String str1="hello";
		String str2="hello";
		
		String s1 = new String ("hello");
		String s2 = new String ("hello");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(s1));
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		// compareTo
		
		String k1="abc";
		String k2="Abc";
//		
//		String k1="Abc";
//		String k2="abc";
		
//		String k1="Abc";
//		String k2="Abc";
		
//		String k1="Abcdefghi";
//		String k2="Abcdefghk";
		
		System.out.println(k1.compareTo(k2));
	}

}
