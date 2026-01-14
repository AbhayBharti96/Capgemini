package PolyMorphismAssigment;

class BankAccount{
	int p;
	int r;
	int t;
	BankAccount(int p,int r,int t){
		this.p=p;
		this.r=r;
		this.t=t;
	}
	void calculateInterest() {
		
	}
}
class SavingAccount extends BankAccount{
SavingAccount(int p, int r, int t) {
		super(p, r, t);
	}

void calculateInterest() {
		System.out.println("Interest of SA: "+(p*r*r));
	}
	
}
class FixedDeposits extends BankAccount{
FixedDeposits(int p, int r, int t) {
		super(p, r, t);
	}

void calculateInterest() {
	System.out.println("Interest of FD: "+(p*r*r));
		
	}
}
class CurrentAccount extends BankAccount{
CurrentAccount(int p, int r, int t) {
		super(p, r, t);
	}

void calculateInterest() {
	System.out.println("Interest of CA: "+(p*r*r));
	}
}

public class Solution04 {

	public static void main(String[] args) {
		BankAccount []b= {
				new SavingAccount(2,3,5),
				new FixedDeposits(5,6,7),
				new CurrentAccount(7,8,9)
		};
for(BankAccount x:b) {
	x.calculateInterest();
}
	}

}
