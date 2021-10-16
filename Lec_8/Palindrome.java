package Lec_8;

public class Palindrome {
	public static void main(String[] args) {
		String str = "nitoptin";
		System.out.println(isPalin(str));
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
