package Lec_16;

public class String_demo {
	public static void main(String[] args) {
//		Using literal
		String a1 = "lol";
		String a2 = "lol";
		String a3 = "lol";
		String a4 = "lol";
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		System.out.println(a1==a4);
//		
		System.out.println("================");
		String s1 = "hi";
		String s2 = "hi";
		System.out.println(s1==s2);
		s2="lo";
		System.out.println(s1);
		s1="lo";
		System.out.println(s1==s2);
		System.out.println("==================");
	}
}
