package Lec_29;

import java.util.Scanner;

public class Longest_substring_k {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while (T > 0) {
			String in = scn.next();
			int k = scn.nextInt();
			solve(in, k);
			T--;
		}
	}

	public static void solve(String str, int k) {
		int[] batua = new int[26];
		int s = 0;
		int e = 0;
		int score = 0;
		int ans = 0;
		while (true) {
//			System.out.println(str.substring(s, e) + " ; score " + score + "{" + s + "," + e + "}");
			
			if (score <= k) {
//				add the char at index e
				char ch = str.charAt(e);
				batua[ch - 'a']++;
				if (batua[ch - 'a'] == 1) {
					score++;
				}
//				Update the score!!
				e++;
			} else {
				char ch = str.charAt(s);
				batua[ch - 'a']--;
				if (batua[ch - 'a'] == 0) {
					score--;
				}
//				Increase s
				s++;
			}
			if (score <= k) {
//				System.out.println(str.substring(s, e));
				ans = Math.max(ans, e - s);
			}
			if (e == str.length()) {
				break;
			}

		}
		System.out.println(ans);
	}
}
