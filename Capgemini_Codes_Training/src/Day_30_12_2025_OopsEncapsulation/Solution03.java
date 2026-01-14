package Day_30_12_2025_OopsEncapsulation;

public class Solution03 {
static class Employee{
	private String name;
	private String department;
	private int salary;
	void updateDetails(String name){
		System.out.println("Name updated to "+name);
	}
	void updateDetails(String name, String department) {
		System.out.println("Name and Department updated to "+name+", "+department);
	}
	void updateDetails(String name, String department, int salary) {
		System.out.println("Name, Department, Salary updated to "+name+", "+department+", "+salary);
	}
	
	public static void main(String []args) {
		Employee e= new Employee();
	e.updateDetails(e.name="Alice");
	e.updateDetails(e.name="Bob",e.department= "HR");
	e.updateDetails(e.name="Charlie",e.department= "Finance",e.salary=70000);
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}

}
