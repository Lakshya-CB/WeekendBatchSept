package Lec_16;

public class Palin_substring {

	public static void main(String[] args) {
		String str = "nittin";
		int count = 0;
		for (int c = 0; c < str.length(); c++) {
//			String word = str.charAt(c)+"";
//			System.out.println("This is a palindrome = "+ word);

			for (int r = 0; c - r >= 0 && c + r < str.length(); r++) {
				int idx1 = c - r;
				int idx2 = c + r;
//				word = str.charAt(idx1)+word+str.charAt(idx2);
				if (str.charAt(idx1) == str.charAt(idx2)) {
//					System.out.println("This is a palindrome = "+ word);
					count++;
				} else {
					break;
				}
			}
		}
		for (double c = 0.5; c < str.length(); c++) {
			String word = "";
			for (double r = 0.5; c - r >= 0 && c + r < str.length(); r++) {
				int idx1 = (int) (c - r);
				int idx2 = (int) (c + r);
				word = str.charAt(idx1) + word + str.charAt(idx2);

				if (str.charAt(idx1) == str.charAt(idx2)) {
					System.out.println("This is a palindrome = " + word);
					count++;
				} else {
					break;
				}
			}
		}
		System.out.println(count);
	}

}
