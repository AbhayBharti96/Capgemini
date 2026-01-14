package InheritancePractice;
class Employee{
String name;
int salary;
}

class Manager extends Employee{
	String department;
	void Details() {
		System.out.println("Name is: "+name);
		System.out.println("Salary is: "+salary);
		System.out.println("Department is: "+department);
	}
}
public class Solution06 {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.name="Abhay";
		m.department="CSE";
		m.salary=30000;
		m.Details();
	}

}
