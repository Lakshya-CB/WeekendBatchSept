package Lec_8;

import java.util.Scanner;

public class Lower_Upper {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		char ch = scn.next().charAt(0);
		String str = scn.next();
		char ch = str.charAt(0);
//		System.out.println((int)ch);
		if(ch>='A'&&ch<='Z') {
			System.out.println("Upper");
		}
		else if(ch>='a'&&ch<='z') {
			System.out.println("Lower");	
		}
		else {
			System.out.println("Me dont know");
		}
		
		
	}
}
