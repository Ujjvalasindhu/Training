package Lecture12;

public class StringDemo1 {

	public static void main(String[] args) {
		String str="hello";
		System.out.println(str);
//		str=str+"hello";
//		System.out.println(str);
		
		String str1="hello";
		System.out.println(str==str1);
//		
		String s=new String ("hello");
		System.out.println(s==str);
//		
		String s2="hell";
		String s1=s2+"o";
		System.out.println(s1==str);
//		
		String k="hell"+"o";
		System.out.println(k==str);
//		
		System.out.println(s1.equals(str));

	}

}
