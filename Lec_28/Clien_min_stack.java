package Lec_28;

public class Clien_min_stack {
public static void main(String[] args) throws Exception {
	Min_stack SS = new Min_stack();
	SS.Push(10);
	System.out.println(SS.min);
	SS.Push(50);
	System.out.println(SS.min);
	SS.Push(8);
	System.out.println(SS.min);
	SS.Push(60);
	System.out.println(SS.min);
	SS.Push(7);
	System.out.println(SS.min);
	SS.Push(40);
	System.out.println(SS.min);
	SS.Push(3);
	System.out.println(SS.min);
	System.out.println("===================");
	System.out.println("Popped "+SS.pop());
	System.out.println(SS.min);
	System.out.println("=======");
	System.out.println("Popped "+SS.pop());
	System.out.println(SS.min);

	System.out.println("=======");
	System.out.println("Popped "+SS.pop());
	System.out.println(SS.min);

	System.out.println("=======");
	System.out.println("Popped "+SS.pop());
	System.out.println(SS.min);

	System.out.println("=======");
	System.out.println("Popped "+SS.pop());
	System.out.println(SS.min);

	System.out.println("=======");
	System.out.println("Popped "+SS.pop());
	System.out.println(SS.min);
	
	
	
//	3,40,7,60,8,50,10
	
}
}
