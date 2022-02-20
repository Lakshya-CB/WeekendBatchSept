package Lec_40;

import java.util.Scanner;

public class Genrate_sorted {
	public static void main(String[] args) {
//		for(int i=1;i<=9;i++)
//			lexico(i, 1000);
//		
//		lexico(0, 1000);
		char[] ch_arr = { 'a', 'b', 'c' };
		lexicoCH("", 4, ch_arr);
		// Scanner scn = new Scanner(System.in);
//		int s1 = scn.nextInt();
//		int[] arr1 = new int[s1];
//		int s2 = scn.nextInt();
//		int[] arr2 = new int[s2];
//		for (int i = 0; i < s1; i++) {
//			arr1[i] = scn.nextInt();
//		}
//		for (int i = 0; i < s2; i++) {
//			arr2[i] = scn.nextInt();
//		}
//		sel(true, arr1, -1, arr2, -1, "");
	}

	public static void sel(boolean turnA, int[] arrA, int idxA, int[] arrB, int idxB, String ans) {
		if (turnA) {
			if (ans.length() > 0) {
				System.out.println(ans);
			}
			for (int i = idxA + 1; i < arrA.length; i++) {
				if (idxB == -1 || arrA[i] > arrB[idxB]) {
					sel(false, arrA, i, arrB, idxB, ans + arrA[i] + " ");
				}
			}
		} else {
			for (int i = idxB + 1; i < arrB.length; i++) {
				if (idxA == -1 || arrB[i] > arrA[idxA]) {
					sel(true, arrA, idxA, arrB, i, ans + arrB[i] + " ");
				}
			}

		}
	}

	public static void lexico(int num, int limit) {
		if (limit < num) {
			return;
		}
		System.out.println(num);
		int i = 0;
		if (num == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			lexico(num * 10 + i, limit);
		}
	}

	public static void lexicoCH(String ans, int limit, char[] ch_arr) {
		if (ans.length() > limit) {
			return;
		}
		System.out.println(ans);
		int i = 0;
		for (char ch : ch_arr) {
			lexicoCH(ans + ch, limit, ch_arr);
		}
	}
}
