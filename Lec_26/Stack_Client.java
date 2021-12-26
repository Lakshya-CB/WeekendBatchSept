package Lec_26;

public class Stack_Client {
	public static void main(String[] args) throws Exception{
		Stack S = new Stack();
		S.Push(10);
		S.Push(20);
		S.Push(30);
		S.Push(40);
		S.Push(50);
		S.disp();
		S.Push(60);
		S.disp();
	}
}
