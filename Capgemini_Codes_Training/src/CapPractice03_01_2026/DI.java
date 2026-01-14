package CapPractice03_01_2026;
class A{
	String name;
	A(String name){
		this.name =name;
	}
	void show() {
		System.out.println("Name is: "
				+name);
	}
}
class B{
	A a ;
	B(A a){
		this.a =a;
		a.show();
	}
	
}
public class DI {

	public static void main(String[] args) {
		A a = new A("Abhay");
		B b = new B(a);

	}

}
