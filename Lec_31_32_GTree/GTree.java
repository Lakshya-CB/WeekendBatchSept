package Lec_31_32_GTree;

import java.util.ArrayList;
import java.util.Scanner;

public class GTree {
	class Node {
		int data;
		ArrayList<Node> children;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			children = new ArrayList<>();
		}

		@Override
		public String toString() {
			return "" + this.data;
		}
	}

	Node root;
	Scanner scn = new Scanner(System.in);

	public GTree() {
		// TODO Auto-generated constructor stub
//		way1
//		System.out.println("Data of root Node ?");
//		root = new Node(scn.nextInt());
//		create(root);
//		
//		way 2
		root = create(null, -9999);
	}

	private void create(Node parent) {
		System.out.println("Kitne child hein " + parent.data + " ke ?");
		int no_child = scn.nextInt();
		for (int i = 0; i < no_child; i++) {
			System.out.println("Mere es " + parent.data + " ka " + i + " child ka data bata?");
			Node child = new Node(scn.nextInt());
			parent.children.add(child);
			create(child);
		}
	}

	private Node create(Node parent, int ith_child) {
		if (parent == null) {
			System.out.println("Root Node ka data ?");
		} else {
			System.out.println("Parent " + parent.data + " ke " + ith_child + " child ka data ?");
		}
		Node curr = new Node(scn.nextInt());

		System.out.println("Kitne child hein " + curr.data + " ke ?");
		int no_child = scn.nextInt();

		for (int i = 0; i < no_child; i++) {
			Node child = create(curr, i);
			curr.children.add(child);
		}
		return curr;
	}

	public void disp() {
		disp(root);
	}

	private void disp(Node nn) {

		System.out.println(nn + " ==  " + nn.children);
		for (Node child : nn.children) {
			disp(child);
		}
	}

	public int size() {
		return size(root);
	}

	private int size(Node curr) {
//		BP : size(root)!! , give me the size~~
//		SP : size(child!!)
		int ans = 0;
		for (Node child : curr.children) {
			int s = size(child);
			ans = ans + s;
		}
		return ans + 1;
	}

	public int Max() {
		return Max(root);
	}

	private int Max(Node nn) {
		int ans = nn.data;
		for (Node child : nn.children) {
			int child_max = Max(child);
			ans = Math.max(child_max, ans);
		}
		return ans;
	}

	public int Height() {
		return Height(root);
	}

	private int Height(Node nn) {
		int ans = 0;
		for (Node child : nn.children) {
			int child_H = Height(child);
			ans = Math.max(ans, child_H + 1); // wrt to nn child_H+1
		}
		return ans;
	}
}
