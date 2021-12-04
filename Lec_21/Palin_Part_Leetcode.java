package Lec_21;

import java.util.ArrayList;
import java.util.List;

public class Palin_Part_Leetcode {

	public static void main(String[] args) {
		List<List<String>> All_ans = new ArrayList<List<String>>();
		Palin_parti("aab", "", new ArrayList<String>(), All_ans);
		System.out.println(All_ans);
	}

	public static void Palin_parti(String str, String soln, ArrayList<String> ans, List<List<String>> All_ans) {
		if (str.isEmpty()) {
			All_ans.add(new ArrayList<String>(ans));
//			System.out.println(ans);
			return;
		}
		for (int chop = 1; chop <= str.length(); chop++) {
			String chopped = str.substring(0, chop);// from index 0 to chop!!
			String remain = str.substring(chop);// from index chop to end
			if (isPalin(chopped)) {
				ans.add(chopped);
				Palin_parti(remain, soln + chopped + "=", ans, All_ans);
				ans.remove(ans.size() - 1);
			}
		}
	}

	public static boolean isPalin(String ss) {
		int s = 0;
		int e = ss.length() - 1;
		while (s < e) {
			if (ss.charAt(s) != ss.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;

	}
}
