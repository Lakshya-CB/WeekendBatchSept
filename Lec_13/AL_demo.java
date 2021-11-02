package Lec_13;

import java.util.ArrayList;

public class AL_demo {
	public static void main(String[] args) {
		int a = 10;
		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(10);
		AL.add(20);
		AL.add(30);
		AL.add(40);

		System.out.println(AL.size());

		int s = AL.size();
		System.out.println(s);

		System.out.println(AL.get(3));
		System.out.println(AL.get(AL.size() - 1));
		/////////////////
		AL.add(AL.size(), 100);
		System.out.println(AL);
		/////////////////
		AL.add(AL.size(), 120);
		System.out.println(AL);
		/////////////////
		AL.add(AL.size(), 130);
		System.out.println(AL);
/////////////////
		AL.add(AL.size(), 140);
		System.out.println(AL);
/////////////////
		AL.add(AL.size(), 150);
		System.out.println(AL);
		
		System.out.println("====================");
		AL.set(2, 33);
		System.out.println(AL);
		
		
		System.out.println("====================");
		AL.remove(AL.size()-1);
		System.out.println(AL);
		
		System.out.println("====================");
		AL.remove(-1);
		System.out.println(AL);
	}
}
