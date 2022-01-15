package Lec_30_31;

import Lec_30_31.LinkedList.Node;

public class CLient {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
//		Node nn = LL.new Node(10);
//		LL.addLast(10);
//		LL.disp();
//		LL.addLast(20);
////		LL.disp();
//		LL.addLast(30);
////		LL.disp();
//		LL.addLast(40);
//		LL.addLast(50);
//		LL.addLast(60);
//		LL.addLast(70);
//		LL.addLast(80);
//		LL.addLast(90);
//		LL.addLast(100);
//		LL.addLast(110);
		
		LL.create_Cyclic();
		System.out.println(LL.isCyclic());
//		System.out.println(LL.LoopLen());
//		LL.startingLoop();
		LL.BreakCyclic();
		LL.disp();
		System.out.println(LL.isCyclic());
		
		
//		LL.disp();
//		LL.revK(3);
//		System.out.println("==============");
//		LL.disp();
		
//		System.out.println(LL.size());
//		System.out.println("==============");
//		LL.rev_itr();
//		LL.disp();
//		LL.rev_rec1();
//		LL.disp();
//		System.out.println(LL.midData());
//		LL.addLast(50);
//		System.out.println(LL.midData());
//		LL.addLast(60);
//		System.out.println(LL.midData());
//		LL.disp();
//		System.out.println("-----------------");
//		System.out.println(LL.lastK(1));
//		System.out.println(LL.lastK(2));
//		System.out.println(LL.lastK(3));
//		LL.create();
		
	}
}
