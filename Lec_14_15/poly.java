package Lec_14_15;

public class poly {
	public static void main(String[] args) {
		int n = 3;
		int x = 7;
		int ans = 0;
		int pro = x;
		for (int c = n; c >= 1; c--) {
			ans = ans + c * pro;
			pro = pro * x;
		}
		System.out.println(ans);
	}
}
