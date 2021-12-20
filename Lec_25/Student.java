package Lec_25;

public class Student {
	// Parsing!!!
	String Name = "John Cena";
	int Age = 190;

//	Constructor!
	Student(int Age, String Name) {
		this.Age = Age;
		this.Name = Name;
	}

	Student(int Age) {
		this.Age = Age;
	}

	Student(String Name) {
		this.Name = Name;
	}
// Default!!
	Student() {
	}

	public void Intro() {
		String Name = "KOI FAYEDA NAHI hein!!";
		System.out.println(Name + "Hi i am " + this.Name + " my age is " + this.Age);
	}

	public void party(Student s1) {
		System.out.println("Party " + this.Name + " with " + s1.Name);
	}
}
