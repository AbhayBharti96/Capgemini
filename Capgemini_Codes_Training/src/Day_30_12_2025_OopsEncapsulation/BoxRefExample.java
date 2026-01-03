package Day_30_12_2025_OopsEncapsulation;

class Box {

}

class Bottle {

}

public class BoxRefExample {

	public static void main(String[] args) {
		Box b1 = new Box();

		show(b1);
		Box b2 = new Box();
		show(b2);
		Bottle a1 = new Bottle();
		showBottle(a1);

	}

	public static void show(Box b) {
		System.out.println(b);
	}

	public static void showBottle(Bottle bt) {
		System.out.println(bt);
	}
}
