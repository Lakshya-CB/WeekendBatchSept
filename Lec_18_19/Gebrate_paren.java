package Lec_18_19;

public class Gebrate_paren {
	public static void main(String[] args) {
		int n =3;
		bracket(n, n, "");
	}

	public static void bracket(int Open, int Close, String soln) {
//		this is -ve BS, where i have to stop the recursion
		if(Close<Open) {
			return;
		}
		
//		this is +ve BS
		if(Open==0 && Close==0) {
			System.out.println(soln);
			return;// Optional because at base case no recursive calls
		}
		if (Open > 0) {
			bracket(Open - 1, Close, soln + '(');
		}
		if (Close > 0) {
			bracket(Open, Close - 1, soln + ')');
		}
	}
}
