package Day_29_12_2025_Oops;
class Cons1{
	String title;
	int price;
	Cons1(String title,int price){
		this.title = title;
		this.price = price;
		System.out.println(title+" "+price);
	}
	Cons1(){
		System.out.println("--- I was calling from Non Arg Constructor ---");
	}
}
public class ParamterConstructor {

	public static void main(String[] args) {
		
Cons1 c1 = new Cons1("Java",2000);
Cons1 c2 = new Cons1("Python",4000);
Cons1 c3 = new Cons1("SQL",3000);
Cons1 c4 = new Cons1();
//System.out.println("Constructor1: "+c1.title+" "+c1.price);
//System.out.println("Constructor1: "+c2.title+" "+c2.price);
//System.out.println("Constructor1: "+c3.title+" "+c3.price);
System.out.println();


	}

}
