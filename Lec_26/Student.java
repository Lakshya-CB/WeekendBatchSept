package Lec_26;

public class Student {
	// Parsing!!!
	String Name = "John Cena";
	private int Age = 190;

	public int getAge() {
		return this.Age;
	}

	public void setAge(int Age)  {
		if(Age < 0) {
//			throw new Exception("Age is -ve");
			throw new RuntimeException("Age is -ve "+Age);
		}
		this.Age = Age;
	}

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
