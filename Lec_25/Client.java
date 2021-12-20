package Lec_25;

public class Client {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);

		System.out.println(s.Age);
		System.out.println(s.Name);

		System.out.println("================");
		s.Name = "LOL";
		System.out.println(s.Name);
		s.Age = 10;
		System.out.println(s.Age);

		System.out.println("================");

		Student s1 = s;
		s1.Age = 20;
		System.out.println(s1.Age);
		System.out.println(s.Age);

		System.out.println("================");
//		Student s2 = new Student();
//		s1.Age = s2.Age;
//		System.out.println(s1.Age);
		s = new Student();
		System.out.println(s.Age);
		System.out.println(s1.Age);

//		
		System.out.println("================");
		Student s3 = new Student();
		s3.Name = "s3";
		s3.Age = 3;
		Student s4 = new Student();
		s4.Name = "s4";
		s4.Age = 4;

//		Test1(s3, s4); // no swap
//		Test2(s3, s4);
//		System.out.println(s3.Name + s3.Age);
//		System.out.println(s4.Name + s4.Age);
//		
		String myName = "John Cina";
		int MyAge = 23;
		Test3(s3,s4.Name,s4.Age,MyAge,myName);
		System.out.println(s3.Name + s3.Age);
		System.out.println(s4.Name + s4.Age);
		
		System.out.println("=============");
		s1.Intro();
		s4.Intro();
		
		
		s1.party(s4);
		
		System.out.println("=============");
		Student LL = new Student(32,"POP");

		
	}

	public static void Test1(Student s1, Student s2) {
		Student temp = s1;
		s1 = s2;
		s2 = temp;
	}

	public static void Test2(Student s1, Student s2) {
		s1 = new Student(); // tricky ?!
		String temp_s = s1.Name;
		s1.Name = s2.Name;
		s2.Name = temp_s;

		int temp_i = s1.Age;
		s1.Age = s2.Age;
		s2.Age = temp_i;
	}

	public static void Test3(Student s1, String name, int age, int myAge, String myName) {
		s1.Name = "_";
		s1.Age = 0;
		name = "_";
		age = 0;
		myName = "_";
		myAge = 0;
	}

}
