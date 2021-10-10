package Lec_7;

public class Data_type_demo {
	public static void main(String[] args) {
		byte b = (byte) 128;
		System.out.println(b);

		short sh = 3267;
		System.out.println(sh);

		int i = (int) 214;
		System.out.println(i);

		long l = 56798024523452l;
		System.out.println(l);

		float f = (float) 123.1;
		System.out.println(f);

		double d = 1.123421;

		float ll = f - i;

		System.out.println(ll);
		System.out.println(f - i);

//		Tricky!!
//		byte b1 = 0;
//		while(b1<127) {
//			b1=(byte)(b1+1);
////			b1++;
//		}
//		System.out.println(b1);

		while (true) {
			System.out.println("Hi");
			break;
		}

		boolean bob = true;
		System.out.println(bob);
		bob = false;
		System.out.println(bob);
		bob = 1 > 2;
		System.out.println(bob);
		while (bob) {
			System.out.println("safgaerf");
		}
		bob = bob || false;
		System.out.println(bob);
// char
		char ch = 'l';
		System.out.println(ch);

		char ch1 = 'a';
		char ch2 = ' ';

		int k = ch1 + ch2;
		System.out.println(ch1 + ch2);
//		System.out.println((char)k);
//		System.out.println((int)ch2);

		String s = "sdfgssg";
		System.out.println(s);
		System.out.println("word" + "hello" + 1 + 2);
///////////////////////////////////////////////////////////

		System.out.println("Hello" + 10 + 20);
		System.out.println("Hello" + (10 + 20));
		System.out.println(10 + "Hello" + 10 + 20);
		System.out.println(20 + 10 + "Hello" + 10 + 20);
//		String llll = 20 + 10 + "Hello" + 10 + 20;
//		System.out.println(llll);
		String str = "Hello";
		System.out.println(str.charAt(2));
		System.out.println(str.length());
		System.out.println(str.substring(0, 2));
	}
}
