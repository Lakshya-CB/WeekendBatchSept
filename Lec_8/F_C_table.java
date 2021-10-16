package Lec_8;

public class F_C_table {
	public static void main(String[] args) {
		int maxF = 100;
		int minF = 0;
		int step = 20;

		for(int F = minF;F<=maxF;F = F+step) {
			float C = (float)((F-32)*(5.0/9));
			System.out.println(F+"\t"+C);
			System.out.println(String.format("%.0f", C));
		}
	}
	
}
