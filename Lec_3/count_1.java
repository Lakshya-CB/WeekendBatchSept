package Lec_3;

import java.util.Scanner;

public class count_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		int i = 1;
		while(i<=n) {
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);
	}
}
