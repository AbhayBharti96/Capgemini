package HasARelationShip;

class Address {
	String city;
	String state;
	String pincode;

	Address(String city, String state, String pincode) {
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
}

class Student {
	Address a;

	Student(Address a) {
		this.a = a;
	}

	void show() {
		System.out.println("City is: " + a.city);
		System.out.println("State is: " + a.state);
		System.out.println("Pincode is: " + a.pincode);
	}

}

public class Solution03 {
	public static void main(String[] args) {
		Address addr = new Address("Sambhal", "U.P", "244302");
		Student s = new Student(addr);
		s.show();
	}

}
