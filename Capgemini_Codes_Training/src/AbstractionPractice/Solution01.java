package AbstractionPractice;

abstract class Payment {
	abstract void processPayment(double amount);

	void printReciept() {
		System.out.println("----- Payment Sucessfull---- ");
	}
	
}

class Credit extends Payment {
	void processPayment(double amount) {
		System.out.println("Amount By CreditCard: " + amount);
	}
}

	class UPI extends Payment {
		void processPayment(double amount) {
			System.out.println("Amount by UPI: " + amount);
		}
	}

	class NetBank extends Payment {
		void processPayment(double amount) {
			System.out.println("Amount by NetBanking Credit: " + amount);
		}
	}

	public class Solution01 {

		public static void main(String[] args) {
			  Payment[] payments = {
			            new Credit(),
			            new UPI(),
			            new NetBank()
			        };


		        double[] amounts = { 1500.0, 800.0, 2500.0 };

		        for (int i = 0; i < payments.length; i++) {
		        	payments[i].printReciept();
		            payments[i].processPayment(amounts[i]);
	
		            System.out.println();
		        }
		}
	}