package Lrec_35;

import java.util.Comparator;

public class Client {
	public static void main(String[] args) {
		Student[] arr = new Student[4];
		arr[0] = new Student(100, "A", 12);
		arr[1] = new Student(21, "B", 99);
		arr[2] = new Student(101, "C", 3);
		arr[3] = new Student(10, "D", 25);

		sort(arr);
		disp(arr);
		StudentCompAge LL = new StudentCompAge();
		StudentCompString LL2 = new StudentCompString();
		System.out.println("===========");
		sort(arr,LL2);
		disp(arr);
	}

//	public static void disp(Object[] arr) {
//		for(Object o: arr) {
//			System.out.println(o);
//		}
//	}
	public static <POP> void disp(POP[] arr) {
		for (POP pp : arr) {
			System.out.println(pp);
		}
	}

	public static <POP extends Comparable> void sort(POP[] arr) {
		for (int count = 0; count < arr.length; count++) {
			for (int i = 0; i < arr.length - 1; i++) {
//				if(arr[i]>arr[i+1]) {
				if(arr[i].compareTo(arr[i+1])>0){
//					swap!!
					POP temp = arr[i];
					arr[i]= arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}
	static class StudentCompAge implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.Age-o2.Age;
		}
		
	}
	static class StudentCompString implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}
		
	}
	public static <POP> void sort(POP[] arr, Comparator<POP> cc) {
		for (int count = 0; count < arr.length; count++) {
			for (int i = 0; i < arr.length - 1; i++) {
//				if(arr[i]>arr[i+1]) {
//				if(arr[i].compareTo(arr[i+1])>0){
				if (cc.compare(arr[i], arr[i + 1]) > 0) {
//					swap!!
					POP temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
}
