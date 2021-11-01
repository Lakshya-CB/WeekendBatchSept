package Lec_12;

import java.util.ArrayList;

public class ArrayList_demo {
	public static void main(String[] args) {
//Declaration
		ArrayList<Integer> AL;
		AL = new ArrayList<>();
		
		System.out.println(AL);
//		Adding at last
		AL.add(12);
		System.out.println(AL);
		AL.add(100);
		System.out.println(AL);
		AL.add(120);
		System.out.println(AL);
//Size		
		System.out.println(AL.size());

		System.out.println("==========");
		AL.add(120);
		System.out.println(AL);
		System.out.println(AL.size());
		
//		FOr indexing
		System.out.println("==========");
		System.out.println(AL.get(1));
		
// For updation
		AL.set(0,99);
		System.out.println(AL);
		

		System.out.println("==========");
//		Adding at an index
		AL.add(1, 30);
		System.out.println(AL);
		
		System.out.println("==========");
		int out = AL.remove(3);
		System.out.println(out);
		System.out.println(AL);
		
	}
}
