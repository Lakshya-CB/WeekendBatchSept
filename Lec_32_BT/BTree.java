package Lec_32_BT;

import java.util.Scanner;

public class BTree {
	class Node {
		int data;
		Node left;
		Node right;

		public Node(int d) {
			// TODO Auto-generated constructor stub
			data = d;
			left = null;
			right = null;

		}
	}

	Node root;
	Scanner scn = new Scanner(System.in);

	public BTree() {
		// TODO Auto-generated constructor stub
		System.out.println(" Root ka data ?");
		root = new Node(scn.nextInt());
		create(root);
	}

	private void create(Node nn) {
		System.out.println(nn.data + " ka left child hein ?");
		boolean hasL = scn.nextBoolean();
		if (hasL) {
			System.out.println(nn.data + " ka left child ka data de ");
			Node left = new Node(scn.nextInt());
			nn.left = left;
			create(left);
		}
		System.out.println(nn.data + " ka right child hein ?");
		boolean hasR = scn.nextBoolean();
		if (hasR) {
			System.out.println(nn.data + " ka rigth child ka data de ");
			Node Right = new Node(scn.nextInt());
			nn.right = Right;
			create(Right);
		}
	}

	private Node create(Node nn, boolean leftC) {
		if (leftC)
			System.out.println(nn.data + " ka  left data bta?");
		else
			System.out.println(nn.data + " ka  right data bta?");

		Node curr = new Node(scn.nextInt());
		System.out.println(curr.data + " has left ?");
		boolean hasL = scn.nextBoolean();
		if (hasL) {
			curr.left = create(curr, true);
		}
		System.out.println(curr.data + " has right ?");
		boolean hasR = scn.nextBoolean();
		if (hasR) {
			curr.right = create(curr, false);
		}
		return curr;
	}

	public void disp() {
		disp(root);
	}

	private void disp(Node nn) {
		if (nn == null) {
			return;
		}
//Self work!!
		String ans = "";
		if (nn.left != null) {
			ans = ans + nn.left.data;
		}
		ans = ans + " -> " + nn.data + " <- ";
		if (nn.right != null) {
			ans = ans + nn.right.data;
		}

		System.out.println(ans);
		disp(nn.left);
		disp(nn.right);

	}

	public int size() {
		return size(root);
	}

	private int size(Node nn) {
		if (nn == null) {
			return 0;
		}
		int ans = 0;
		int left_T = size(nn.left);
		int right_T = size(nn.right);
		return left_T + right_T + 1;
	}

	public int Ht() {
		return Ht(root);
	}

	private int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int LT = Ht(nn.left);
		int RT = Ht(nn.right);
		return Math.max(LT, RT) + 1;

	}

	public int Dia() {
		return Dia(root);
	}

	private int Dia(Node nn) {
		if (nn == null) {
			return -1;
		}
//		Calculate dia going across nn
		int self_dia = Ht(nn.left) + Ht(nn.right) + 2;
		int L_dia = Dia(nn.left);
		int R_dia = Dia(nn.right);

		return Math.max(Math.max(R_dia, L_dia), self_dia);
	}

}
