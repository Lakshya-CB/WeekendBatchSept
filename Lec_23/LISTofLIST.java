package Lec_23;

import java.util.ArrayList;

public class LISTofLIST {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> big = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer>AL = new ArrayList<Integer>();
		
		AL.add(10);
		big.add(AL);
		AL.add(20);
		big.add(AL);
		AL.add(30);
		big.add(AL);
		AL.add(40);
		big.add(AL);
		AL.add(50);
		big.add(AL);
		System.out.println(big);
	}
}
