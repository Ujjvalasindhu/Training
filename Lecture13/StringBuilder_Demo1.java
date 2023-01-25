package Lecture13;

public class StringBuilder_Demo1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());

		sb.append("hellobye");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.append("hellobyehey");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("hellobyeheyhellobye");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println(sb.reverse());
		
//		Builder to String
//		String s = sb.toString();
//		String to Builder
//		String s1 = "bye";
//		StringBuilder sb1 = new StringBuilder(s1);
	}

}
