package Lec_23;

public class Coin_comb {
	public static void main(String[] args) {
		int target = 6;
		int[] coins = { 1, 1, 2, 2, 3 };
		comb(-1, 0, coins, target, "");

	}

	public static void comb(int idx, int curr_sum, int[] coins, int target_sum, String ans) {
//		System.out.println("asdfasdf");
		if (target_sum == curr_sum) {
			System.out.println(ans);
			return;
		}
		if (curr_sum < 0) {
			return;
		}
		for (int i = idx + 1; i < coins.length; i++) {
			if (i > 0 && coins[i] != coins[i - 1]) { //??????????? remeber the problem of 2 2s?!?!?
			
				comb(i, curr_sum + coins[i], coins, target_sum, ans + " " + coins[i]);
			}
		}
	}
}
