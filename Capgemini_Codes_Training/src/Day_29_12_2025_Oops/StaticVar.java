package Day_29_12_2025_Oops;

class Demo1{
	static int a;
	public static void D1() {
	System.out.println("Static Value is D1: "+a);
	
	}
}
public class StaticVar {


	public static void main(String[] args) {
	Demo1.D1();
	Demo1.a = 10;
	System.out.println("Static Value of a After Update: "+Demo1.a);
	
	}

}
