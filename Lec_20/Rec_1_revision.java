package Lec_20;

public class Rec_1_revision {
	public static void main(String[] args) {
//		PID2(6);
	}

	public static void PID2(int limit) {
		PID(1,limit);
	}
	public static void PID(int n,int limit) {
		if(n==limit+1) {
			return;
		}
		System.out.println(n);
		PID(n + 1,limit);
		System.out.println(n);

	}
}
