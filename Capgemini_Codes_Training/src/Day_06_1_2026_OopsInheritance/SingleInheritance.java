package Day_06_1_2026_OopsInheritance;

class A {

	void show() {
		System.out.println("Hi Abhay I am from A");
	}
}

class B extends A {
	
	void show() {
		super.show();
		System.out.println("Hi I am from B");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {

		B b = new B();
		b.show();
		
		
		
	}
}
