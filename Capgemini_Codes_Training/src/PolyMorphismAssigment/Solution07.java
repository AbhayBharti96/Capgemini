package PolyMorphismAssigment;

import java.util.Scanner;

class Customer{
	double Discount(double a) {
		return 0;
	}
}
class Regular extends Customer{
	double Discount(double a) {
		return 0.2*a;
	}
}
class Premium extends Customer{
	double Discount(double a) {
		return 0.4*a;
	}
}
class VIP extends Customer{
	double Discount(double a) {
		return 0.5*a;
	}
}


public class Solution07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Amount: ");
		double d = s.nextDouble();
		Customer[]c= {
				new Regular(),
				new Premium(),
				new VIP()
		};
		for(Customer x:c) {
			double discount = x.Discount(d);
			System.out.println("------ Price For -------");
			System.out.println("Price is: "+d+
					"\nDiscount: "+discount+
					"\nFinal amount: "+(d-discount)
					);
		}
s.close();
	}

}
