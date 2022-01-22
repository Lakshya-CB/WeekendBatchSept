package Lec_32_33_BT;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
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

	public BTree(int[] pre) {
		idx = 0;
		root = createPreRec(pre);
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
		dispPre(root);
//		System.out.println("=================");
//		dispIn(root);
//
//		System.out.println("=================");
//		dispPost(root);
	}

	private void dispPre(Node nn) {
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
		dispPre(nn.left);
		dispPre(nn.right);

	}

	private void dispIn(Node nn) {
		if (nn == null) {
			return;
		}
		dispIn(nn.left);

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

		dispIn(nn.right);

	}

	private void dispPost(Node nn) {
		if (nn == null) {
			return;
		}
		dispPost(nn.left);
		dispPost(nn.right);

		// Self work!!
		String ans = "";
		if (nn.left != null) {
			ans = ans + nn.left.data;
		}
		ans = ans + " -> " + nn.data + " <- ";
		if (nn.right != null) {
			ans = ans + nn.right.data;
		}

		System.out.println(ans);

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
//		return Dia(root);
		return Dia2(root).Dia;
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

	private HDpair Dia2(Node nn) {
		if (nn == null) {
			HDpair ans2 = new HDpair();

			ans2.Dia = 0;
			ans2.Ht = -1;
			return ans2;

		}
		HDpair left = Dia2(nn.left);
		HDpair right = Dia2(nn.right);

//		Create the curr height?!!
		HDpair ans = new HDpair();

		ans.Ht = Math.max(left.Ht, right.Ht) + 1;

//		Create curr dia of the tree?!?!
		int selfD = left.Ht + right.Ht + 2;

		ans.Dia = Math.max(Math.max(right.Dia, left.Dia), selfD);

		return ans;
	}

	private class HDpair {
		int Ht;
		int Dia;
	}

	public boolean isBal() {
		return isBal(root);
	}

	private boolean isBal(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean left = isBal(nn.left);
		boolean right = isBal(nn.right);

		boolean curr = Math.abs(Ht(nn.left) - Ht(nn.right)) <= 1;
		if (left && right && curr) {
			return true;
		} else {
			return false;
		}

	}

	private BHpair isBal2(Node nn) {

		if (nn == null) {
			BHpair ans = new BHpair();
			return ans;
		}
		BHpair left = isBal2(nn.left);
		BHpair right = isBal2(nn.right);

		boolean curr = Math.abs(left.Ht - left.Ht) <= 1;

		BHpair ans = new BHpair();

		if (left.Bal && right.Bal && curr) {
			ans.Bal = true;
		} else {
			ans.Bal = false;
		}
//		
		ans.Ht = Math.max(left.Ht, right.Ht) + 2;
		return ans;

	}

	private class BHpair {
		boolean Bal = true;
		int Ht = -1;

	}

	private boolean isFlip(Node n1, Node n2) {

		if (n1 == null && n2 == null) {
			return true;
		}

		if (n1 == null || n2 == null) {
			return false;
		}

		if (n1.data != n2.data) {
			return false;
		}
		boolean noflip = isFlip(n1.left, n2.left) && isFlip(n1.right, n2.right);
		boolean flip = isFlip(n1.left, n2.right) && isFlip(n1.right, n2.left);
		return noflip || flip;
	}

	int idx = 0;

	private Node createPreRec(int[] pre) {
		if (pre[idx] == -1) {
			idx++;
			return null;
		}
		Node nn = new Node(pre[idx]);
		idx++;
		nn.left = createPreRec(pre);
		nn.right = createPreRec(pre);
		return nn;

	}

	public void dispLVL() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while(!Q.isEmpty()) {
			Node nn = Q.poll();
			if(nn==null) {
				continue;
			}
			System.out.println(nn.data);
			Q.add(nn.left);
			Q.add(nn.right);
			
		}
	}
	public void dispLVL2() {
		Queue<Node> currQ = new LinkedList<>();
		Queue<Node> nxtQ = new LinkedList<>();
		currQ.add(root);
		int lvl =0;
		while(!currQ.isEmpty()) {
			Node nn = currQ.poll();
			if(nn==null) {
				continue;
			}
			System.out.print(nn.data+" ");
			nxtQ.add(nn.left);
			nxtQ.add(nn.right);
			if(currQ.isEmpty()) {
				System.out.println(" = next lvl "+lvl);
				lvl++;
				if(lvl%2==1) {
//					reverse your nxtQ;
				}
				currQ = nxtQ;
				nxtQ = new LinkedList<>();
			}
		}
	}

}
