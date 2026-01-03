package Day_29_12_2025_Oops;

import java.util.Scanner;

class Rectangle{
	int l;
	int w;
	
	Rectangle(int l,int w){
		this.l=l;
		this.w=w;
	}
	// Non Static Method
	public double getArea(int l,int w) {
		return l*w;
	}
	
}
public class NonStaticMethod {

	public static void msg() {
	System.out.println("Hello I am Static One");
}
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the length: ");
	int l = s.nextInt();
	
	System.out.print("Enter the Width: ");
	int w = s.nextInt();
	
	Rectangle r = new Rectangle(l,w);
	System.out.print("Area is: ");
	// Calling a method...
	System.out.println(r.getArea(l, w));

	msg();
	}


}
