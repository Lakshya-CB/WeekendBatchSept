package Lec_17;

public class REC_1 {
	public static void main(String[] args) {
		int n = 4;
//		PD(n);
//		PI(n);
//		PDI(n);
		System.out.println(fact(5));
		System.out.println(pow(2, 3));
	}

	public static void PD(int n) {

		if (n == 0) {
//			System.out.println(2);
//			System.out.println(1);
			return;
		}

//		Create bigger solution
		System.out.println(n);
//		SP = PD(n-1)
		PD(n - 1);
	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}

//		Bp = PI(n)
//		Sp = PI(n-1), Assume it works!!
		PI(n - 1);
//		Self work!! create bigger solution
		System.out.println(n);
	}

	public static void PDI(int n) {
		if (n == 0) {
			return;
		}
//BP PDI(n)
//		PDI(n-1)
		System.out.println(n);
		PDI(n - 1);// Assume it works!!
		System.out.println(n);
	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
//BP = fact(n)
//		SP = fact(n-1);
		int sp = fact(n - 1);

		return n * sp;
	}

	public static int pow(int x, int n) {
		if (n == 0) {
			return 1;
		}
//BP , pow(c,n)
//		SP, pow(x,n-1);
		int sp = pow(x, n - 1);
		return sp * x;

	}

	public static int fib(int n) {
		if (n == 1 || n == 0) {
			return n;
		}
		// BP fib(n)
//		SP fib(n-1) and fib(n-2)

//		Assume
		int sp1 = fib(n - 1);
		int sp2 = fib(n - 2);

		return sp1 + sp2;

	}
}
