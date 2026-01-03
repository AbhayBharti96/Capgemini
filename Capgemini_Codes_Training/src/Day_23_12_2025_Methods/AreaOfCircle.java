package Day_23_12_2025_Methods;

import java.util.Scanner;

public class AreaOfCircle {
	
public static void AreaCir() {
	System.out.println("-------- Printing the Area Of Circle --------");
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the Radius: ");
	int r = s.nextInt();
	System.out.print("Areas is: "+(3.14*r*r));
	System.out.println();
	
	
}
public static void AreaTri() {
	Scanner s = new Scanner(System.in);
	System.out.println("-------- Printing the Area Of Triangle --------");
	System.out.print("Enter the base: ");
	int r = s.nextInt();
	System.out.print("Enter the height: ");
	int b = s.nextInt();
	System.out.print("Areas is: "+(0.5*r*b));
	System.out.println();
	
}
public static void AreaSqu() {
	System.out.println("-------- Printing the Area Of Square --------");
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the Side of Square: ");
	int r = s.nextInt();
	System.out.print("Areas is: "+(r*r));
	
	
}

public static void main(String []args) {
	AreaCir();
	AreaTri();
	AreaSqu();
	
	
}

}
