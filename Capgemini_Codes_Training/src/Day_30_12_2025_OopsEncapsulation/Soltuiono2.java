package Day_30_12_2025_OopsEncapsulation;

public class Soltuiono2 {

static class Vehicle{
	String vehicleNumber;
	int fuelCapacity;
	void displayVehicleInfo() {
		System.out.println("Vehicle Number: "+vehicleNumber);
		System.out.println("Fuel Capacity: "+fuelCapacity);
	}
}
static class Truck extends Vehicle{
	int loadCapacity;
	void canCarryLoad(int load) {
		if(load<loadCapacity) {
			System.out.println("Truck can carry the load");
		}else {
			System.out.println("Truck can't carry the load");
		}
	}
}
	
	public static void main(String[] args) {
		Truck t = new Truck();
		t.vehicleNumber="TN10AB1234";
		t.fuelCapacity= 120;
		t.loadCapacity=5000;
		int load = 4500;
		t.displayVehicleInfo();
		t.canCarryLoad(load);

	}

}
