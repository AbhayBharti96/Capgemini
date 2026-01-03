package Day_30_12_2025_OopsEncapsulation;

class InnerParent {
	static class Inner {
		static void show() {
			System.out.println("hello i am from Inner 1");
		}

		void test() {
			System.out.println("I am from Non static Method Inner Class ");
		}

	}
}

public class StaticNestedClass {
	public static void main(String[] args) {

		InnerParent.Inner.show();
		InnerParent.Inner i = new InnerParent.Inner();
		i.test();
	}

}
