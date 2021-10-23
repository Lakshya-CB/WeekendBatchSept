package Lec_9;

import java.util.Scanner;

public class SubString_Palin {
	public static void main(String[] args) {
		String str = "nitin";
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String temp = str.substring(i, j);
//				System.out.println(str.substring(i, j));
				if(isPalin(temp)) {
					System.out.println(temp);
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static boolean isPalin(String str) {
		int start = 0;
		int end = str.length()-1;
		while(start<end) {
			if(str.charAt(start)==str.charAt(end)) {
				start++;
				end--;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
