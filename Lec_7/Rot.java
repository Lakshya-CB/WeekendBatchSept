package Lec_7;

public class Rot {
	public static void main(String[] args) {
		int n = 123456;
		int rot = 1;

		int copy = n;// Create copy
		int num_digit = 0;
		while (n != 0) {
			n = n / 10;
			num_digit++;
		}
//  Approach 1

//		n = copy;
//		while (rot >= 1) {
//			int part1 = n / 10;
//			int part2 = n % 10;
//			System.out.println(part1+ " ___ "+part2 );
//
////		System.out.println(Math.pow(10, num_digit-1));
//			int mult = (int) Math.pow(10, num_digit - 1);
//			n = mult * part2 + part1;
//			System.out.println("ans = "+n);
//			rot--;
//		}

//		Approach 2
		rot = rot % num_digit;
		n = copy;
		int nn = (int) Math.pow(10, rot);
		int part1 = n / nn;
		int part2 = n % nn;
		System.out.println(part1 + " ___ " + part2);
		int mm = (int) Math.pow(10, num_digit - rot);
		System.out.println(mm);
		int ans = part1 + part2 * mm;
		System.out.println(ans);
	}
}
