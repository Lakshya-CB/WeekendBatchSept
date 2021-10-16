package Lec_8;

import java.util.Scanner;

public class simple_string {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
//		int i =0;
//		while(i<str.length()) {
//			System.out.println(str.charAt(i));
//			i++;
//		}
		
		for(int i=0; i<str.length(); ) {
			System.out.println(str.charAt(i));	
		}
		System.out.println(2+"\t"+3);
	}
}
