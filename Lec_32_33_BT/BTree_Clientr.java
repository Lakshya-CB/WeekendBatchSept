package Lec_32_33_BT;

public class BTree_Clientr {
	public static void main(String[] args) {
		int[] pre = {10,20,40,-1,-1,50,-1,-1,30,-1,70,-1,-1};
		BTree BT = new BTree(pre); 
		System.out.println("======================");
		BT.disp();
		BT.dispLVL2();
//		System.out.println(BT.size());
//		System.out.println(BT.Ht());
//		System.out.println(BT.Dia());
//		System.out.println(BT.isBal());
	}
}
