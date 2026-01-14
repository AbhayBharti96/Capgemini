package PolyMorphismAssigment;

interface Payment{
	void pay();
}
class CreditCardPayment implements Payment{

	public void pay() {
		
		System.out.println("I am from CrediCard");
	}
	
}
class DebitCardPayment implements Payment{
	public void pay() {
		System.out.println("I am from DebitCard");
		
	}
}
class UPIPayment implements Payment{
	public void  pay() {
		System.out.println("I am from UPI");
	}
}



public class Solution02 {

	public static void main(String[] args) {
		Payment [] p={
			new CreditCardPayment(),
			new DebitCardPayment(),
			new UPIPayment()
		};
		for(Payment x:p) {
			x.pay();
		}
		
		

	}

}
