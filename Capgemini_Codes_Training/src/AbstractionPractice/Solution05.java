package AbstractionPractice;

// Abstract class
abstract class Restaurant {

	// Abstract method
	abstract void prepareFood();

	// Concrete method
	void orderReceived() {
		System.out.println("Order received. Preparing your food...");
	}
}

// Fast food restaurant
class FastFoodRestaurant extends Restaurant {

	@Override
	void prepareFood() {
		System.out.println("Fast Food Restaurant: Food will be ready in 10 minutes.");
	}
}

// Fine dining restaurant
class FineDiningRestaurant extends Restaurant {

	@Override
	void prepareFood() {
		System.out.println("Fine Dining Restaurant: Food will be ready in 30 minutes.");
	}
}

// Main class
public class Solution05 {

	public static void main(String[] args) {

		Restaurant r1 = new FastFoodRestaurant();
		Restaurant r2 = new FineDiningRestaurant();

		r1.orderReceived();
		r1.prepareFood();

		System.out.println();

		r2.orderReceived();
		r2.prepareFood();
	}
}
