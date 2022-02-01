package Lrec_35;

import Lrec_35.LinkedList.Node;

public class Client_static {
	public static void main(String[] args) {
		System.out.println(Student.total_number_of_students);
		Student.lll();
		Student S1 = new Student();
		
//		Student S2 = new Student();
//		Student S3 = new Student();
//		Student S4 = new Student();
//		System.out.println(Student.total_number_of_students);
		LinkedList<Integer> LL = new LinkedList<>();
//		Node<Integer> nn = LL.new Node<Integer>(10); // Non static inner class
		Node<Integer> nn = new LinkedList.Node<Integer>(10); // static inner class
	}
}
