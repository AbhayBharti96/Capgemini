package Day_06_1_2026_OopsInheritance;

class Parent {
	void show() {
		System.out.println("I am Parent");
	}
}

class Child extends Parent {
	void display() {
		System.out.println("I am Child");
	}
}
class D extends Child{
	
}
class E extends D{
	
}
public class DownCastingDemo {
	public static void main(String[] args) {

		Parent p = new Child(); // Upcasting
//		Child c = (Child) p; // Downcasting
//
//		c.show();
//		c.display();
//		D d = (D)p;// This will show ClassCast Error
		//DownCasting
		System.out.println(p instanceof Parent);
		System.out.println(p instanceof Child);
		System.out.println(p instanceof D);
		System.out.println(p instanceof E);
		if(p instanceof Child) {
			Child c = (Child)p;
		}else {
			System.out.println("Dont have instance of This");
		}
		
	}
}
