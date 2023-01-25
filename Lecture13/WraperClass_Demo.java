package Lecture13;

public class WraperClass_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1=12;
		int a2=13;
		Integer b1= 22;
		Integer b2= 23;
		b1=a1;
		System.out.println(b1);
		a2=b2;
		System.out.println(a2);
		
		Integer d1=67;
		Integer d2=67;
		System.out.println(d1==d2);
		
		Integer e1=267;
		Integer e2=267;
		System.out.println(e1==e2);
		
	}

}
