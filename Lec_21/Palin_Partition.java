package Lec_21;

import java.util.ArrayList;

public class Palin_Partition {
	static ArrayList<ArrayList<String>> All_ans;

	public static void main(String[] args) {
		All_ans = new ArrayList<ArrayList<String>>();
		Palin_parti("aab", "", new ArrayList<String>());
		System.out.println(All_ans);
//		System.out.println(isPalin("nitoitin"));
	}

	public static void Palin_parti(String str, String soln, ArrayList<String> ans) {
		if (str.isEmpty()) {
			All_ans.add(ans); //this wont work!!
//			All_ans.add(new ArrayList<String>(ans));
			System.out.println(ans);
			return;
		}
		for (int chop = 1; chop <= str.length(); chop++) {
			String chopped = str.substring(0, chop);// from index 0 to chop!!
			String remain = str.substring(chop);// from index chop to end
			if (isPalin(chopped)) {
//			way 1 , Use ArrayList like Strings
//				ArrayList<String> temp = new ArrayList<>(ans);
//				temp.add(chopped);
//				Palin_parti(remain, soln + chopped + "=", temp);
//			way 2 , use explicit backtracking
				 ans.add(chopped);
				 Palin_parti(remain, soln+chopped+"=",ans);
				 ans.remove(ans.size()-1);
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
