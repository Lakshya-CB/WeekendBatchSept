package Lec_38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BTree {
	protected class Node {
		public int data;
		public Node left;
		public Node right;

		public Node(int d) {
			// TODO Auto-generated constructor stub
			data = d;
			left = null;
			right = null;

		}
	}

	protected Node root;
	Scanner scn = new Scanner(System.in);

	public BTree() {
		// TODO Auto-generated constructor stub
		System.out.println(" Root ka data ?");
		root = new Node(scn.nextInt());
//		create(root);
	}

	public void dispLVL() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node nn = Q.poll();
			if (nn == null) {
				continue;
			}
			System.out.print(nn.data + " ");
			Q.add(nn.left);
			Q.add(nn.right);

		}
		System.out.println();
	}

// Updated code!! => using 2 queues . Issue when last node is null at currQ
	public void dispLVL2() {
		Queue<Node> currQ = new LinkedList<>();
		Queue<Node> nxtQ = new LinkedList<>();
		currQ.add(root);
		ArrayList<Integer> AL = new ArrayList<Integer>();
		int lvl = 0;
		while (!currQ.isEmpty()) {
			Node nn = currQ.poll();

			System.out.println(nn.data + " " + lvl);
			AL.add(nn.data);
			if (nn.left != null)
				nxtQ.add(nn.left);
			if (nn.right != null)
				nxtQ.add(nn.right);
			if (currQ.isEmpty()) {
				System.out.println(AL + " + " + lvl);
				lvl++;
				currQ = nxtQ;
				AL = new ArrayList<Integer>();
				nxtQ = new LinkedList<>();
			}
		}
	}

	public BTree(int[] lvl, boolean lvl_b) {
		lvl_order_Create(lvl);
	}

	private void lvl_order_Create(int[] lvl) {
		int idx = 0;
		Node nn = new Node(lvl[idx]);
		idx++;
		root = nn;
		Queue<Node> Q = new LinkedList<Node>();
		Q.add(nn);
		while (!Q.isEmpty()) {
			Node temp = Q.poll();
			if (lvl[idx] != -1) {
				temp.left = new Node(lvl[idx]);
				Q.add(temp.left);
			}
			idx++;
			if (lvl[idx] != -1) {
				temp.right = new Node(lvl[idx]);
				Q.add(temp.right);
			}
			idx++;
		}
	}

	private void print(int[] arr, int i, int j) {
		while (i <= j) {
			System.out.print(arr[i] + " ");
			i++;
		}
	}

	public BTree(int[] pre, int[] in) {
		root = createPI(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node createPI(int[] pre, int sp, int ep, int[] in, int si, int ei) {
		if (sp > ep || si > ei) {
			return null;
		}
		Node nn = new Node(pre[sp]);

		int rootdata = pre[sp];
		int found_idx = sp;
		int countLSub = 0;
		for (int i = si; i <= ei; i++) {
			if (rootdata == in[i]) {
				found_idx = i;
				break;
			}
			countLSub++;
		}

		nn.left = createPI(pre, sp + 1, sp + countLSub, in, si, found_idx - 1);
		nn.right = createPI(pre, sp + countLSub + 1, ep, in, found_idx + 1, ei);
		return nn;
	}

	class pairNx {
		Node Node;
		int x;

		public pairNx(Node N, int n) {
			// TODO Auto-generated constructor stub
			Node = N;
			x = n;
		}
	}

	public void VerticalOrder() {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

		Queue<pairNx> Q = new LinkedList<pairNx>();
		pairNx P = new pairNx(root, 0);
		Q.add(P);
		while (!Q.isEmpty()) {
			pairNx nn = Q.poll();
			if (nn.Node == null) {
				continue;
			}
//			System.out.println(nn.Node.data + " "+nn.x);
//			add this node in map!!
			if (map.containsKey(nn.x)) {
				ArrayList<Integer> AL = map.get(nn.x);
				AL.add(nn.Node.data);
			} else {
				map.put(nn.x, new ArrayList<Integer>());
				ArrayList<Integer> AL = map.get(nn.x);
				AL.add(nn.Node.data);
			}

			pairNx L = new pairNx(nn.Node.left, nn.x - 1);
			Q.add(L);
			pairNx R = new pairNx(nn.Node.right, nn.x + 1);
			Q.add(R);

		}
		System.out.println(map);
		int min = 0;
		for (int key : map.keySet()) {
			min = Math.min(key, min);

			while (map.containsKey(min)) {
				System.out.println(map.get(min));
				min++;
			}

		}
	}
}
