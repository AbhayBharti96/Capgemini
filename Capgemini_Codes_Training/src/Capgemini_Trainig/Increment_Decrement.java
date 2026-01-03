package Capgemini_Trainig;
import java.util.*;
public class Increment_Decrement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = s.nextInt();
		int b = (a++ + ++a + a);
		System.out.println("After Increment: "+ b);
		int c = (--a + ++b + b--);
		System.out.println("After Increment: "+ c);
		int d = (a + b + c + a--);
		System.out.println("After Increment: "+ d);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);


	}

}
