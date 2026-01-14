package CapPractice03_01_2026;
class AB{
	String Name;
	String regNo;
	int Age;
	AB(String name){
		this.Name=name;
	}
	AB(String Name,int Age){
		this.Name = Name ;
		this.Age= Age;
	}
	static void show(String name,String regNo) {
		System.out.println("Name is: "+name);
		System.out.println("RegNo: "+regNo);
	}
	static void show(int age) {
		System.out.println("Age is: "+age);
	}
}
public class CompileTimePolyMorphism {

	public static void main(String[] args) {
		
		AB.show(20);
		AB.show("Abhay","12323137");

	}

}
