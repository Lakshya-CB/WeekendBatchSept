package Lec_3;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner scn1123 = new Scanner(System.in);
		int marks = scn1123.nextInt();
		
		
		if (marks >= 90) {
			System.out.println("A");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("B");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("C");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("D");
		} else if (marks < 60) {
			System.out.println("F");
		}

	}

}
