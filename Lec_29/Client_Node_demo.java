package Lec_29;

public class Client_Node_demo {
	public static void main(String[] args) {
		Node nn1 = new Node(10);
		System.out.println(nn1.data);
		System.out.println(nn1.next);
		
		Node nn2 = new Node(20);
		System.out.println(nn2.data);
		System.out.println(nn2.next);
//		How can you connect these nodes ?!
		System.out.println(nn1);
		System.out.println(nn2);
		
	}
}
