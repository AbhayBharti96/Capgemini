package InheritancePractice;
class Teacher{
	String name;
	int age;
		
}
class Person01 extends Teacher{
	String subjects;
	int salary;
	void show() {
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Suject is: "+subjects);
		System.out.println("Salary is: "+salary);
		
	}
}
public class Solution10 {

	public static void main(String[] args) {
		Person01 p = new Person01();
		p.name="Rahul";
		p.age= 25;
		p.salary=50000;
		p.subjects="CSE";
		p.show();

	}

}
