package Lec_7;

import java.util.Scanner;

public class string_demo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		String str = scn.next();
		String str = "ANCD LL POP";
//		int i = scn.nextInt();
//		System.out.println(i);
		char last = str.charAt(str.length()-1); 
		System.out.println(last);
		String part1 = str.substring(0,2);
		String part2 = str.substring(2);
		System.out.println(part1 + "==="+part2);
		
		System.out.println(str.indexOf(' '));
		
		System.out.println(str.lastIndexOf(' '));
		
	}
}
