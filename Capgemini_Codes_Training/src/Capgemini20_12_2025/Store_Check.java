package Capgemini20_12_2025;
import java.util.*;
public class Store_Check {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the quantity: ");
		int qty = s.nextInt();
		System.out.println("Item is fast moving: ");
		boolean f = s.nextBoolean();
		 System.out.println("Continued or not: ");
		 boolean c = s.nextBoolean();
		 String r = qty < 10 || f && !c ? "Reoder " +( qty+=5):"No need of order";
		 System.out.println(r);
		 }

}
