package Lec_21;

import java.util.ArrayList;

public class Tower_Of_Hen {
	static ArrayList<Integer> A = new ArrayList<Integer>();
	static ArrayList<Integer> B = new ArrayList<Integer>();
	static ArrayList<Integer> C = new ArrayList<Integer>();
	public static void main(String[] args) {
//		TH(3, 'A', 'C', 'B');
		 A = new ArrayList<Integer>();
		 B = new ArrayList<Integer>();
		 C = new ArrayList<Integer>();
		
		A.add(3);
		A.add(2);
		A.add(1);
		TH_AL(3, A, C, B);
	}
	public static void TH(int n, char src, char dest, char help) {
		if(n==0) {
			return;
		}
//		Sp1 ?!
		TH(n-1, src, help, dest);
//		Move the biggest plate!!
		System.out.println("Move disk "+n+" from src "+src+" to dest "+dest);
//		Sp2 ?! Mode n-1 disk from help to dest		
		TH(n-1, help, dest, src);

	}
	public static void TH_AL(int n, ArrayList<Integer> src, ArrayList<Integer> dest, ArrayList<Integer> help) {
		if(n==0) {
			return;
		}
//		Sp1 ?!
		TH_AL(n-1, src, help, dest);
//		Move the biggest plate!!
//		System.out.println("Move disk "+n+" from src "+src+" to dest "+dest);
//		Move the top plate from tower src
		src.remove(src.size()-1);
		dest.add(n);
		System.out.println(A+" = "+B +" = "+C);
//		Sp2 ?! Mode n-1 disk from help to dest		
		TH_AL(n-1, help, dest, src);

	}
}
