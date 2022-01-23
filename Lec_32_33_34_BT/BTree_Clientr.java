package Lec_32_33_34_BT;

public class BTree_Clientr {
	public static void main(String[] args) {
//		int[] pre = {10,20,40,-1,-1,50,-1,-1,30,-1,70,-1,-1};

//		int[] pre = { 10, 20, 40, 80, -1, -1, -1, 50, -1, -1, 30, 60, 90, -1, -1, - 1, 70, -1, 200, -1, -1};

//		int[] lvl = { 10, 20, 30, 40, 50, -1, 70, -1, -1, -1, -1, -1, -1 };
//		BTree BT = new BTree(pre);
//		BTree BT = new BTree(lvl, true);
//
//		System.out.println("======================");
//		BT.disp();
		
		
//		int[] in = {10,20,40,50,30,60};
//		int[] pre = {40,20,50,10,30,60};
//		
//		BTree BT2 = new BTree(in, pre);
//
//		System.out.println("======================");
//		BT2.disp();
//		
		
//		System.out.println("======================");
//		BT.dispLVL2();
//		System.out.println(BT.size());
//		System.out.println(BT.Ht());
//		System.out.println(BT.Dia());
//		System.out.println(BT.isBal());
		
		int[] lvl = { 10, 99,40,-1,-1,30,50,20,-1, 42,-1,-1,-1,-1,-1};
		BTree BT = new BTree(lvl, true);
		System.out.println(BT.BigBst());
	}
}
