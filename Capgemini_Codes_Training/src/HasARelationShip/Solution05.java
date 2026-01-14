package HasARelationShip;

class Sim{
	String network;
	String Number;
	Sim(String network,String number){
		this.network= network;
		this.Number= number;
	}
}
class Mobile{
	
	Sim s;
	Mobile(Sim s){
		this.s=s;
	}
	void show() {
		System.out.println("Network is: "+s.network);
		System.out.println("MobileNumber is: "+s.Number);
		System.out.println("Make call");
	}
}
public class Solution05 {

	public static void main(String[] args) {
		Sim s1 = new Sim("5G","9639667365");
	Mobile m = new Mobile(s1);
	m.show();
	

	}

}
