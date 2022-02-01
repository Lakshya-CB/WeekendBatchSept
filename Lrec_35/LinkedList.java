package Lrec_35;

import java.util.Stack;


public class LinkedList <PP>{
	static class Node<LL> {
		LL data;
		Node<LL> next;

		Node(LL d) {
			data = d;
		}
	}

	Node<PP> head;

	public void disp() {
		Node<PP> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		int count = 0;
		Node<PP> temp = head;
		while (temp != null) {
//			System.out.print(temp.data+" ");
			temp = temp.next;
			count++;
		}
//		System.out.println();
		return count;
	}

	public PP getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Empty!!");
		}
		return head.data;
	}

	public PP getLast() {
		if (isEmpty()) {
			throw new RuntimeException("Empty!!");
		}
		Node<PP> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public PP getAt(int idx) {
		if (isEmpty()) {
			throw new RuntimeException("Empty!!");
		}
		Node<PP> temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;

	}

	public void addLast(PP data) {
		Node<PP> nn = new Node<PP>(data);

		if (isEmpty()) {
			head = nn;
			return;
		}

		Node<PP> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
//		now temp.next is null!! so temp is the last Node!!
		temp.next = nn;

	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(PP data) {
		Node<PP> nn = new Node<PP>(data);
		nn.next = head;

		head = nn;
	}

	public void addAt(PP data, int idx) {
		if (idx == 0) {
			addFirst(data);
		} else if (idx == size()) {
			addLast(data);
		} else {

			Node<PP> prev = getNode(idx - 1);
			Node<PP> Next = prev.next;

			Node<PP> nn = new Node<PP>(data);

			prev.next = nn;
			nn.next = Next;
		}
	}

	public PP removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Empty!!");
		}
		Node<PP> temp = head;
		head = head.next;
		return temp.data;
	}

	public PP removeLast() {
		if (isEmpty()) {
			throw new RuntimeException("Empty!!");
		} else if (size() == 1) {
			PP ans = head.data;
			head = null;
			return ans;

		}
		Node<PP> nn = getNode(size() - 2);
		PP ans = nn.next.data;
		nn.next = null;
		return ans;
	}

	public PP removeAt(int idx) {
		if (idx == 0) {
			return removeFirst();
		} else if (idx == size() - 1) {
			return removeLast();
		} else {
			Node<PP> nn = getNode(idx - 1);
			PP ans = nn.next.data;
			nn.next = nn.next.next;
			return ans;
		}

	}

	private Node<PP> getNode(int idx) {
		if (isEmpty() || idx >= size()) {
			throw new RuntimeException("Kaha deekh rha hein!?");
		}
		Node<PP> temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}



}