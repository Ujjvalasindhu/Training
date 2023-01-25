package Lecture13;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo {
	public static void main(String[] args) {
		ArrayList<Integer>list= new ArrayList<Integer>();
//		System.out.println(list.size());
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(40);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
//		list.add(0, 50);
//		System.out.println(list);
//		System.out.println(list.size());
//		list.add(5,60);
//		System.out.println(list);
//		System.out.println(list.size());
////		list.add(10,100);
//		System.out.println(list);
		
		System.out.println(list.contains(10));
		System.out.println(list.indexOf(30));
		System.out.println(list.remove(3));
		System.out.println(list);
		list.add(0,200);
		System.out.println(list);
		list.set(0, 100);
		System.out.println(list);
		String k=list.toString();
		System.out.println(k.charAt(4));
	}

}
