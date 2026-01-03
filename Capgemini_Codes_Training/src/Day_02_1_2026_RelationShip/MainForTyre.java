package Day_02_1_2026_RelationShip;

public class MainForTyre {

	public static void main(String[] args) {
		CarTyre c = new CarTyre();
		for (int i = 0; i < c.getTyres().length; i++) {
			System.out.println(c.getTyres()[i].getBrand());
		}
// For TyreAdding Elements in Array 
		System.out.println("--- Output for Tyre adding class Methods ----");
		Car02 c2 = new Car02();
		c2.addT(new Tyre("MRF"));
		c2.addT(new Tyre("MRF"));
		c2.addT(new Tyre("MRF"));
		c2.addT(new Tyre("MRF"));
		
		for (int i = 0; i < c2.tyres.length; i++) {

			System.out.println(c2.tyres[i].getBrand());
		}

	}

}
