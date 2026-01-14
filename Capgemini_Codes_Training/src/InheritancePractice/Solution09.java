package InheritancePractice;

class Calculator{
	int a ;
	int b;
	void add() {
		System.out.println("Addition is: "+(a+b));
	}
}
class AdvancedCal extends Calculator{
	void multiply() {
		System.out.println("Product is: "+(a*b));
	}
}

public class Solution09 {

	public static void main(String[] args) {
	AdvancedCal c = new AdvancedCal();
	c.a=12;
	c.b=4;
	c.add();
	c.multiply();
	
	}

}
