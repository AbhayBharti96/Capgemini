package AbstractionPractice;

abstract class Ride{
	abstract void calculateFare(int distance) ;
	void showrideDetails() {
		System.out.println("Total Fare is --> ");
	}
}
class BikeRide extends Ride{
	void calculateFare(int distance) {
		System.out.println("Fare of Bike ride is: "+(30*distance));
	}
}
class AutoRide extends Ride{
	void calculateFare(int distance) {
		System.out.println("Fare of Auto ride is: "+(40*distance));
	}
}
class CarRide extends Ride{
	void calculateFare(int distance) {
		System.out.println("Fare of Auto ride is: "+(40*distance));
	}
}


public class Solution02 {

	public static void main(String[] args) {
		Ride []r = {
				new BikeRide(),
				new AutoRide(),
				new CarRide()
				
		};
		int []distance = {4,8,10};
		for(int i=0;i<distance.length;i++) {
			r[i].showrideDetails();
			r[i].calculateFare(distance[i]);
			
		}
	}

}
