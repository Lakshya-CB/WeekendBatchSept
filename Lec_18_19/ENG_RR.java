package Lec_18_19;

public class ENG_RR {

	public static void main(String[] args) {
//		pat(4);
		ENG_ruler(5, 2);
	}

	public static void pat(int n) {
//		BP = pat(n)
//		SP = pat(n-1)
		if (n == 0) {
			return;
		}
		pat(n - 1);
		for (int i = 1; i <= n; i++) {
			System.out.print("-");
		}
		System.out.println();
		pat(n - 1);

	}

	public static void ENG_ruler(int len, int Major_tic) {
		// jabar dasti starting tic , 0 wala
		for (int ii = 1; ii <= Major_tic; ii++) {
			System.out.print("-");
		}
		System.out.println(0);

		for (int i = 1; i <= len; i++) {
			pat(Major_tic - 1);
//			System.out.println("Jaado");
//			major tic loop;
			for (int ii = 1; ii <= Major_tic; ii++) {
				System.out.print("-");
			}
			System.out.println(i);

		}
	}
}
