package Day_29_12_2025_Oops;

class Book {
	String title;
	int Price;
}

public class NonStaticVar {
	public static void main(String[] args) {

		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
Demo d = new Demo();
System.out.println(d.a = "I am from DemoClass");
		b1.title = "Java";
		b1.Price = 2000;
		b2.title = "Python";
		b2.Price = 1000;
		b3.title = "SQL";
		b3.Price = 3000;
		System.out.println("--- B1 Data ---- ");
		System.out.println(b1.title + "\n" + b1.Price);
		System.out.println("--- B2 Data ---- ");
		System.out.println(b2.title + "\n" + b2.Price);
		System.out.println("--- B3 Data ---- ");
		System.out.println(b3.title + "\n" + b3.Price);
	}

}
