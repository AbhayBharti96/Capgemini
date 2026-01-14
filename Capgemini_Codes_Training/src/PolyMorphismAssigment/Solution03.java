package PolyMorphismAssigment;

class Vehicle{
	void calculateRent() {
		
	}
}
class Car extends Vehicle{
void calculateRent() {
		System.out.println("Car rent is : 20000");
	}
}
class Bike extends Vehicle{
void calculateRent() {
	System.out.println("Bike rent is : 24000");
	}
}
class Truck extends Vehicle{
void calculateRent() {
	System.out.println("Truck rent is : 50000");
	}
}

public class Solution03 {

	public static void main(String[] args) {
		Vehicle [] v= {
				new Car(),
				new Bike(),
				new Truck()
		};
		for(Vehicle x: v) {
		x.calculateRent();
		}
		
	}

}
