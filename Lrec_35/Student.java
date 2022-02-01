package Lrec_35;

class outer{
	public outer() {
		// TODO Auto-generated constructor stub
		System.out.println("Jai ho!!");
	}
	public static void main(String[] args) {
		System.out.println("OUTER BHAI LOL ");
	}
}
class Student implements Comparable<Student> {
	public static void main(String[] args) {
		System.out.println("Student BHAI PPP");
	}
	
	int total_number_of_students = 10;
	String name;
	int Age;
	int marks;
	public static void lll() {
//		opo();
	}
	public int opo() {
		
		return 0;
	}
	public Student() {
		// TODO Auto-generated constructor stub
		total_number_of_students++;
	}

	public Student(int A, String N) {
		Age = A;
		name = N;

		total_number_of_students++;
	}
	public Student(int A, String N, int M) {
		Age = A;
		name = N;
		marks = M;

		total_number_of_students++;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.marks-o.marks;
	}
	public String toString() {
		return name + "  -  "+ Age + " => "+marks;
	}
}
