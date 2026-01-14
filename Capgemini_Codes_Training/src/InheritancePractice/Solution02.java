package InheritancePractice;
class Vehicle{
	String speed;
	String fuelType;
	
}
class Car extends Vehicle{
	String carBrand;
	void showCarDetails() {
		System.out.println("Brand: "+carBrand);
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("Speed: "+speed);
	}
}


public class Solution02 {

	public static void main(String[] args) {
		Car c = new Car();
		c.carBrand="Mahindra";
		c.fuelType="CNG";
		c.speed="150 Km/Hr";
		c.showCarDetails();

	}

}
