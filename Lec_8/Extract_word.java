package Lec_8;

public class Extract_word {
	public static void main(String[] args) {
		String str = "the sky is blue";
		
		while(true) {
			int idx = str.lastIndexOf(' ');
			if(idx==-1) {
				System.out.println(str);
				break;
			}
			String word = str.substring(idx+1);
			System.out.println(word);
			str = str.substring(0,idx);
		}
	}
}
