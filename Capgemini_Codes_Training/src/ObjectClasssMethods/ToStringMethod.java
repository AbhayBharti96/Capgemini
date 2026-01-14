package ObjectClasssMethods;

class Student {
	private String name;
	private int id;

	Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	// OverRide to StringMethod()
	// Output before OverRide
//	// ObjectClasssMethods.Student@e580929
	public String toString() {
		return "Student [name= " +name+" , id= "+id+" ]";
	}
}

public class ToStringMethod {

	public static void main(String[] args) {

		Student s1 = new Student("Abhay", 0);
		System.out.println(s1);
// To String method Automatically called when we print the Obj
	}

}
