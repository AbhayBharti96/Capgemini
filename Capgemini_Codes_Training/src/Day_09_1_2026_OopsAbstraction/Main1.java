package Day_09_1_2026_OopsAbstraction;

abstract class Animal {
	abstract void sound();
	abstract void walk();
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog barks...");
	}
		void walk() {
			System.out.println("Walks Using 4 legs");
		}
	}


class Cat extends Animal {

	void sound() {
		System.out.println("I am cat meow meow");
	}
	void walk() {
		System.out.println("Walks Using 4 legs");
	}
}

public class Main1 {

	public static void main(String[] args) {
		System.out.println("------ Method ------");
		Animal[] a = { new Cat(), new Dog() };
		for (Animal x : a) {
			x.sound();
			x.walk();
		}
		

	}

}
