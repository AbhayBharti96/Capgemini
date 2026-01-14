package InheritancePractice;
class Bank{
	void getInterestRate() {
		
	}
}
class SBI extends Bank{
	void getInterestRate() {
		System.out.println("Rate of Ineterest by SBI is 4%");
	}
}
class HDFC extends Bank{
	void getInterestRate() {
	System.out.println("Rate of Ineterest by HDFC is 5%");
}
}
public class Solution05 {

	public static void main(String[] args) {
		Bank h1= new SBI ();
		Bank h = new HDFC ();
		h1.getInterestRate();
		h.getInterestRate();
	}

}
