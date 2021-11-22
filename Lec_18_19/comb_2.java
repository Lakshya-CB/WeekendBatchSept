package Lec_18_19;

import java.util.ArrayList;
import java.util.List;

public class comb_2 {
	public List<String> letterCombinations(String str) {
		List<String> ans_List = new ArrayList<String>();
        letterCombinations(str,"",ans_List);
        return ans_List;
        
    }
    public void letterCombinations(String str, String soln,List<String> ans_List) {
//		BS when str is empty and humne sari digits ke liye choice karli

		if (str.isEmpty()) {
//			System.out.println(soln);
            if(!soln.isEmpty())
			    ans_List.add(soln);
			return;
		}
//		extract karo digit as ch
		char ch = str.charAt(0);
		String remain = str.substring(1);
		String options = getComb(ch);
//		Option se map hoga digit , 
//		like if ch is 7 then options is "pqrs"
//		
		for (int i = 0; i < options.length(); i++) {
//			extract char to add
//			from options at index i
			letterCombinations(remain, soln + options.charAt(i),ans_List);
		}
	}

	public static String getComb(char ch) {
		if (ch == '2') {
			return "abc";
		} else if (ch == '3') {

			return "def";
		} else if (ch == '4') {

			return "ghi";
		} else if (ch == '5') {

			return "jkl";
		} else if (ch == '6') {

			return "mno";
		} else if (ch == '7') {

			return "pqrs";
		} else if (ch == '8') {

			return "tuv";
		} else if (ch == '9') {

			return "wxyz";
		}
		return "";
	}
}
