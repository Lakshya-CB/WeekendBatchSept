package Lec_8;

public class Arm_Strong {
	public static void main(String[] args) {
		printArmS(1000);
	}
	public static void printArmS(int end) {
		for(int i=1;i<=end;i++) {
			if(isArmS(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isArmS(int num) {
		int new_num=0;
		int nod = num_of_digits(num); // num of digits
		int copy = num;
		while(num!=0) {
			int digit = num%10;
			num=num/10;
			new_num = new_num +(int)Math.pow(digit, nod);
		}
		
		if(new_num==copy) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static int num_of_digits(int num) {
		int count =0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		return count;
	}
}
