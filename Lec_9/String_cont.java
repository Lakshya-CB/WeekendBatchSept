package Lec_9;

public class String_cont {
	public static void main(String[] args) {
		
		String str0 = "lol";
		
		String str1 = new String("lol");
		
//		Concatination
		System.out.println(str1);
		System.out.println(str0+str1);
		
		
//		Equal
		String str2 = "lol";
		
		System.out.println(str0==str1);
		System.out.println(str0==str2);
		
//		
		System.out.println("///////////");
		System.out.println(str0.equals(str2));
		System.out.println(str0.equals(str1));
		
	}
}
