package Lec_18;

public class String_Rec {
	public static void main(String[] args) {
		String str = "abcdefghi123897120000";
		SubSequence(str, "");

	}

	public static void SubSequence(String str, String soln) {
		if(str.length()==0) {
			System.out.println(soln);
			return;
		}
		char ch = str.charAt(0);
		String remain = str.substring(1);
		SubSequence(remain, soln + ch); // Include
		SubSequence(remain, soln); // Exclude

	}
}
