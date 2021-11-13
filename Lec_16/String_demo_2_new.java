package Lec_16;

public class String_demo_2_new {
	public static void main(String[] args) {
		String str1 = new String("Hi");
		
		String str2 = "Hi";
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1==str2);
		
		String str0 = new String("Hi");
		System.out.println(str1==str0);// compare address
		System.out.println(str1.equals(str2)); // compare content
		
		System.out.println("================");
		String s1=str1.substring(1);
		String s2=str1.substring(1);
		System.out.println(s1==s2);
		
		
	}
}
