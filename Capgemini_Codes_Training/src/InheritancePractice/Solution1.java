package InheritancePractice;

class Person{
	String name;
	int age;
	void display() {
		System.out.println("Name is:"+name);
		System.out.println("Age is: "+age);
	}
	
}
class Student extends Person{
	int rollno;
	int marks;
	void show() {
		
		System.out.println("Rollno is: "+rollno);
		System.out.println("Marks is: "+marks);
	}
}
public class Solution1 {

	public static void main(String[] args) {
	Student s = new Student();
	s.name="Abhay";
	s.age= 22;
	s.rollno=67;
	s.marks=90;
	s.show();
	s.display();
	}

}
