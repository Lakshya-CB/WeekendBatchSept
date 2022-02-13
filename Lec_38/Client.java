package Lec_38;

public class Client {
	public static void main(String[] args) {
		int[] pre = { 10, 20, 40, 50, 80, 110, 120, 90, 130, 30, 60, 70, 100 };
		int[] in = { 40, 20, 110, 80, 120, 50, 90, 130, 10, 60, 30, 70, 100 };
		BTree bt = new BTree(pre,in);
//		bt.dispLVL();
//		bt.dispLVL2();
		bt.VerticalOrder();
	}
}
