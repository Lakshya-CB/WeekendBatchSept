package Lec_18_19;

public class String_rec_2 {
	public static void main(String[] args) {
//		CoinToss_HH1(4, "");
//		CoinToss_HH2(4, "", false); 	
		lastishead = false;
		CoinToss_HH3(4, "");
		
	}

	public static void CoinToss(int n, String soln) {
		if (n == 0) {
			System.out.println(soln);
			return;
		}
//		if (!lastishead) {
		CoinToss(n - 1, soln + 'H');
//		}
		CoinToss(n - 1, soln + 'T');

	}

	public static void CoinToss_HH1(int n, String soln) {
		if (n == 0) {
			if (soln.indexOf("HH") == -1) {
				System.out.println(soln);
			}
			return;
		}
		CoinToss_HH1(n - 1, soln + 'H');

		CoinToss_HH1(n - 1, soln + 'T');

	}

	public static void CoinToss_HH2(int n, String soln, boolean lastishead) {
		if (n == 0) {
			System.out.println(soln);
			return;
		}
		if (!lastishead) {
			CoinToss_HH2(n - 1, soln + 'H', true);
		}
		CoinToss_HH2(n - 1, soln + 'T', false);
	}

	static boolean lastishead = false;

	public static void CoinToss_HH3(int n, String soln) {
		if (n == 0) {
			System.out.println(soln);
			return;
		}
		if (!lastishead) {
			lastishead = true;
			CoinToss_HH3(n - 1, soln + 'H');
		}

		lastishead = false;
		CoinToss_HH3(n - 1, soln + 'T');
	}
}
