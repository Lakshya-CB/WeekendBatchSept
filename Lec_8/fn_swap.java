package Lec_8;

public class fn_swap {
	static int worldwide = 101;
	
	public static void main(String[] args) {
		int a = 1;
		int b = 20;
		System.out.println(worldwide);
		System.out.println(a + " : " + b);
		int lol = swap(a, b);
		System.out.println(lol);
		System.out.println(a + " : " + b);
	}

	public static int swap(int a, int b) {
		int c = a;
		a = b;
		b = c;

		System.out.println(worldwide);
		System.out.println(a+b);
		return a;
	}

}
