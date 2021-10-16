package Lec_8;

public class fn_demo {
	
	public static void main(String[] args) {
		fun1();
		int ans = add(1,2,10,22);
		
		System.out.println(ans);
	}

	public static void fun1() {
		System.out.println("Allo ji");
	}
	public static int add(int a, int b,int c,int d) {
		int num = a+b+c+d;
		System.out.println("haan ji bilkul");
		
		return num;
	}
}
