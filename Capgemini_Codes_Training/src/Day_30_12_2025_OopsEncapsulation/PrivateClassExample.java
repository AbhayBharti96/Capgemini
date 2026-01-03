package Day_30_12_2025_OopsEncapsulation;

class A {
	String animal;

	public A(String animal) {
		this.animal = animal;
	}
}

public class PrivateClassExample {

	public static void main(String[] args) {
		A a = new A("dog");
		A b = a;
		System.out.println(b.animal);

	}

}
