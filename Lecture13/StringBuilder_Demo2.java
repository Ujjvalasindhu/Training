package Lecture13;

public class StringBuilder_Demo2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("");
		String s="";
		double start=System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s=s+i;
		}
		double end=System.currentTimeMillis();
		System.out.println(end-start);
		
		start=System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			sb=sb.append(i);
		}
		end=System.currentTimeMillis();
		System.out.println(end-start);
		
	}

}
