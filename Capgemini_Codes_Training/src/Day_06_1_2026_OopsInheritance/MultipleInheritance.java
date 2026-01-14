package Day_06_1_2026_OopsInheritance;
/*
 * Only Static method can be declare and it should be called using interface name itself
 * Default can call direclty
 */
interface AB{
	static void show() {
		System.out.println("Hi i am from In1");
	}
	default void show1() {
		System.out.println("Hi i am Default method");
	}
}
interface BA extends AB{
	static void Print() {
		System.out.println("Hi i am from In2");
	}
}
class IC implements BA{
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
	AB.show();
	BA.Print();
	IC i = new IC();
	i.show1();
	
	}

}
