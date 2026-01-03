package Day_23_12_2025_Methods;
import java.util.*;
public class VoidTypeMethod {
public static void Sum(int a ,int b ) {
	System.out.println("Sum is: "+(a+b));
	}
public static int Product(int a , int b) {
	return a*b;
	}
	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the number1: ");
	int a = s.nextInt();
	System.out.print("Enter the number2: ");
	int b = s.nextInt();
	
	Sum(a,b);
	System.out.print("Product is: "+(Product(a,b)));
	}

}
