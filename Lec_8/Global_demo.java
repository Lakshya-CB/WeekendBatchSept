package Lec_8;

public class Global_demo {
	static int val = 101;
	public static void main(String[] args) {
		val = val+10;
		System.out.println(val);
		fun1();
		System.out.println(val);
	}
	public static void fun1() {
		val=val+10;
	}
}
