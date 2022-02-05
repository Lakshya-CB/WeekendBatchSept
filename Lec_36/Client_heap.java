package Lec_36;

public class Client_heap {
	public static void main(String[] args) {
		HeapG<Integer> H = new HeapG<Integer>();
		H.add(10);
//		H.disp();
		H.add(100);
//		H.disp();
		H.add(2);
//		H.disp();
		H.add(1);
//		H.disp();
		H.add(30);
//		H.disp();
//		System.out.println(H.peek());
		while(!H.isEmpty()) {
			System.out.println(H.poll());
//			H.disp();
//			System.out.println("================");
		}
		
	}
}
