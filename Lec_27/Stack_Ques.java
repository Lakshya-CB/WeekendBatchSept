package Lec_27;

import Lec_26.Stack;

public class Stack_Ques {
	public static void main(String[] args) throws Exception {
		Stack S = new Dynamic_Stack();
		S.Push(10);
		S.Push(20);
		S.Push(30);
		S.Push(40);
		S.Push(50);
//		S.disp();
//		rev_Print(S);
		S.disp();
		actual_rec(S);
		S.disp();
		int[][] party = {{0,0,1,0},{0,0,1,0},{0,0,0,0},{0,0,1,0}};
	}
	public static void rev_Print(Stack S) throws Exception {
		if(S.isEmpty()) {
			return;
		}
		int num = S.pop();
		rev_Print(S);
		System.out.println(num);
		S.Push(num);
	}
	public static void actual_rec(Stack S) throws Exception {
		Stack copy = new Dynamic_Stack();
//		reverse elements into copy!!
		while(!S.isEmpty()) {
			copy.Push(S.pop());
		}
//		Use recursion to copy!!
		copy(copy,S);
	}
	public static void copy(Stack S1, Stack S2) throws Exception {
		if(S1.isEmpty()) {
			return;
		}
		int num = S1.pop();
		copy(S1,S2);
		S2.Push(num);
		S1.Push(num);
	}
	public static void Celeb(int[][] party) throws Exception {
		Stack S = new Dynamic_Stack();
		for(int i =0;i<party.length;i++) {
			S.Push(i);
		}
		while(S.size()>1) {
			int a = S.pop();
			int b = S.pop();
			if(party[a][b]==1) {
				S.Push(b);
			}
			else {
				S.Push(a);
			}
		}
//		check the celeb!!
		int celeb = S.pop();
		for(int i =0;i<party.length;i++) {
			if(party[celeb][i]==1 && i!=celeb) {
				System.out.println("koi nahi hein celeb");
				return;
			}
		}
		for(int i =0;i<party.length;i++) {
			if(party[i][celeb]==0 && i!=celeb) {
				System.out.println("koi nahi hein celeb");
				return;
			}
		}
		System.out.println(celeb);
	}
}
