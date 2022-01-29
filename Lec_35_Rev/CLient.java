package Lec_35_Rev;

public class CLient {
	public static void main(String[] args) {
		Queue Q = new Queue();
		Q.Add(10);
		Q.Add(20);
		Q.Add(30);
		Q.Add(40);
		Q.Add(50);
		Q.disp();
		System.out.println(Q.poll());
		Q.disp();
		System.out.println(Q.poll());
		Q.disp();
		
		
		Q.Add(60);
		Q.disp();
		Q.Add(70);
		Q.disp();
		
	}
}
