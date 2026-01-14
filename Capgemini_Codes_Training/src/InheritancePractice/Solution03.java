package InheritancePractice;

class Animal{
	void eat() {
}
}
class Mammal extends Animal{
	void eat() {
		System.out.println("Mammal is Eating");
	}
}
class Dog extends Mammal{
	void Bark() {
		System.out.println("Dog is Barking");
	}
}
public class Solution03 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.Bark();
		d.eat();
	}

}
