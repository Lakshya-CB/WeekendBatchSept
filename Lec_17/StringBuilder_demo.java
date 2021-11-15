package Lec_17;

public class StringBuilder_demo {
	public static void main(String[] args) {
//		create String Builder
		StringBuilder sb = new StringBuilder("Hello");
		
//		print
		System.out.println(sb);
		
//		access char
		System.out.println(sb.charAt(0));
//		SubString
		System.out.println(sb.substring(1));

		
//		sb.delete(including,excluding);
//
//		sb.toString();

//		append
		sb.append("_Bye");
		System.out.println(sb);

//		Insert like AL
		sb.insert(1, "LOL");
		System.out.println(sb);

//		change char at a position?! O(1)
		sb.setCharAt(0, 'K');
		System.out.println(sb);
		
//		Delete char At index
		sb.deleteCharAt(0);
		System.out.println(sb);
		
//		Delete between index!
		sb.delete(0, 3);
		System.out.println(sb);
		
//		for formality and converting back to str.
		String str = sb.toString();
//		Convert String to StringBuilder
		StringBuilder sb_1 = new StringBuilder(str);
		
//		str.split() read documentation
		
	}
}
