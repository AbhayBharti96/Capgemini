package Day_02_1_2026_RelationShip;

public class Car {
	private String carModelName;

	
	public String getCarModelName() {
		return carModelName;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	Car(){
		
	}
	
	// Achieve has A-Relationship
	public Car(String carName) {
		this.carModelName = carName;
	}
	
		

private Engine e = new Engine(1000); 
public Engine getEngine() {
	return e;
}
}



