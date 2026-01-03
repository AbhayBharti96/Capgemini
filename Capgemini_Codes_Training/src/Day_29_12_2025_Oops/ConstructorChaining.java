package Day_29_12_2025_Oops;

class B{
	String title ;
	String price;
	B(){
	System.out.println("i am called from Non Args");
	}
	B(String a){
		this();
		this.price= a;
		System.out.println("Price is: "+a);
	}
	B(String a,String b){
		this(a);
		
		this.title = a;
		this.price = b;
		
	}
	
}
public class ConstructorChaining {

	public static void main(String[] args) {
	B a = new B();
	B b1 = new B("Java","1234");
	}

}
