package Day_06_1_2026_OopsInheritance;

import java.util.Scanner;

class Cab {
}

class Sedan extends Cab {

}

class Luxury extends Cab {
}

class Mini extends Cab {
}

public class Ola {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Select Cab: ");
		System.out.println("1: Mini");
		System.out.println("2: Sedan");
		System.out.println("3: Luxary");
		System.out.println("Enter the choice: ");
		int choice = s.nextInt();
		Cab c = null;
		switch (choice) {
		case 1: {
			c = new Mini();
		}
			break;

		case 2: {
			c = new Sedan();
		}
			break;

		case 3: {
			c = new Luxury();
		}
			break;
		default: {
			System.out.println("Invalid Input..");
		}
		}
		System.out.println(c);
	}
}
