package Lec_9;

public class Arrays_demo_2 {
	public static void main(String[] args) {
		char[] arr12 = new char[5];
		arr12[0]='a';
		arr12[1]='b';
		arr12[2]='c';
		arr12[3]='d';
		arr12[4]='e';
		
				
		System.out.println(arr12[0]+"=");
		
//		Enhanced loop
		for (char c : arr12) {
			c='3';
			System.out.println(c);
		}
		System.out.println("---------");
		for (char c : arr12) {
			System.out.println(c);
		}
	}
}
