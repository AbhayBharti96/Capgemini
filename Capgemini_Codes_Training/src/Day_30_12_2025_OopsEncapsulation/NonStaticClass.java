package Day_30_12_2025_OopsEncapsulation;

import Day_30_12_2025_OopsEncapsulation.InnerNew.Inner1;

class InnerNew{
	class Inner1{
		void showI() {
			System.out.println("i am from Non static class Show1 non static method");
		}
		static void test1() {
			System.out.println("I am from static Inner test1 method");
		}

	}
}
public class NonStaticClass {

	public static void main(String[] args) {
		InnerNew n = new InnerNew();
		InnerNew.Inner1 k = n.new Inner1();
		k.test1();
		k.showI();
	}
}
		
		