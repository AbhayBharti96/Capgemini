package InheritancePractice;
class Account{
	long an ;
	Account(){
		this.an = an;
	}
}
class SavingsAccount extends Account{
String interest = "4%";
	SavingsAccount(String interest) {
		super();
		this.interest=interest;
		
	}
	void show() {
		System.out.println("Account No is: "+an);
		System.out.println("Interest is: "+interest);
	}
	
}
public class Solution07 {

	public static void main(String[] args) {
		SavingsAccount a = new SavingsAccount("4%");
		a.an=1233234567;
		a.show();

	}

}
