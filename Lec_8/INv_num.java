package Lec_8;

public class INv_num {
	public static void main(String[] args) {
		int num = 231_45;
		int pos = 0;
		int ans = 0;
		while(num!=0) {
			int digit = num%10;
			pos++;
			num=num/10;
			int temp =(int)(pos*Math.pow(10, digit-1));
			ans = ans+temp;
			System.out.println(digit+"  "+pos+"  "+temp);
		}
		System.out.println(ans);
	}
}
