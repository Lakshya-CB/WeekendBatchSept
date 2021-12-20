package Lec_24;

public class Pow {
	public static void main(String[] args) {
		System.out.println(pow(4, 3));
	}

	public static int pow(int x, int n) {
		if(n==0) {
			return 1;
		}
		int sp = pow(x, n / 2);
		if (n % 2 == 0) {
			return sp * sp;
		} else {
			return sp * sp * x;
		}
	}
}
