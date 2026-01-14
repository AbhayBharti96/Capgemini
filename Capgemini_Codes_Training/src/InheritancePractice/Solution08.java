package InheritancePractice;

class A{
	protected String name;
	protected int age;

}
class B extends A{
	void show() {
		System.out.println("name is: "+name);
		System.out.println("age is: "+age);
	}
	
}
class Solution08 {

	public static void main(String[] args) {
	B b = new B();
	b.name="Abhay";
	b.age=22;
	b.show();

	}

}
