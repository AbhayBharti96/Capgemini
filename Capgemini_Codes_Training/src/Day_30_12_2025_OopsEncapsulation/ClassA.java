package Day_30_12_2025_OopsEncapsulation;

class B {
	double length;

	B() {

	}

	B(double length) {
		this.length = length;
	}

	public static B createBox() {
		return new B();

	}

	public static B createBox(double length) {
		return new B(length);

	}
}

public class ClassA {

	public static void main(String[] args) {
		B b1 = B.createBox();
		B bn = B.createBox(4.0);
		System.out.println(b1);
		System.out.println(bn);

	}

}
