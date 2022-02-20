package Lec_40_extra;

import java.util.Scanner;

public class Tree_root_leaf {
	static int i = 1;
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Tree_root_leaf m = new Tree_root_leaf();
		BinaryTree bt = m.new BinaryTree();
		// bt.levelOrderZZ();
		int target = scn.nextInt();
		bt.travel(target);
	}

	private class BinaryTree {

		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public void travel(int target) {
			travel(this.root, 0, target, "");
		}

		private void travel(Node Parent, int sum, int target, String path) {
			if (Parent == null) {
				return;
			}
			if (Parent.data + sum == target && Parent.left == null && Parent.right == null) {
				System.out.println(path+Parent.data+" " );
				return;
			}
			// CODE HERE
			travel(Parent.left, sum + Parent.data, target, path + Parent.data + " ");
			travel(Parent.right, sum + Parent.data, target, path + Parent.data + " ");

		}

	}

}
