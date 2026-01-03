package Capgemini22_12_2025;
import java.util.*;
public class Type_Casting01 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int a = s.nextInt();
	double x = (double)(a);// Explicit TypeCasting Widening
	int y = (int)x; //Explicit TypeCasting Narrowing
	System.out.println("Double value is: "+ x);
	System.out.println("Int value is: "+y);

	}

} 
