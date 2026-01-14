package PolyMorphismAssigment;

class Employee{
	void calculateSalary() {
		System.out.println();
		
	}
}
class Developer extends Employee{
void calculateSalary() {
		System.out.println("Salary of Developer is: "+5000);
	}
}
class Manager extends Employee{
void calculateSalary() {
	System.out.println("Salary of Manager is: "+700000);
	}
}
class Intern extends Employee{
void calculateSalary() {
	System.out.println("Salary of Intern is: "+30000);
	}
}




public class Solution01 {

	public static void main(String[] args) {
//		Employee e1= new Intern();
//		Employee e2 = new Developer();
//		Employee e3= new Manager();
//		e1.calculateSalary();
//		e2.calculateSalary();
//		e3.calculateSalary();
		Employee[] employees = {
			    new Developer(),
			    new Manager(),
			    new Intern()
			};

			for (Employee e : employees) {
			    e.calculateSalary();
			}

		

	}

}
