package Lec_31_Tree;

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
			return ""+this.data;
		}
	}

	Node root;
	Scanner scn = new Scanner(System.in);

	public GTree() {
		// TODO Auto-generated constructor stub
		System.out.println("Data of root Node ?");
		root = new Node(scn.nextInt());
		create(root);

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

	public void disp() {
		disp(root);
	}

	private void disp(Node nn) {

		System.out.println(nn + " ==  " + nn.children);
		for (Node child : nn.children) {
			disp(child);
		}
	}
}
