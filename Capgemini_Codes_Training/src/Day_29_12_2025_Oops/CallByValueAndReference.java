package Day_29_12_2025_Oops;

import java.util.Scanner;

public class CallByValueAndReference {
public static void Area1(int x,int y) {
	System.out.println("Area of Rect is: "+(x*y));
}

public static void Area2(int a,int b ) {
	System.out.println("Preimeter of Rect is: "+(2*(a+b)));
}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int a = s.nextInt();
		System.out.print("Enter the wdith: ");
		int b = s.nextInt();
		Area1(3,4);
		Area2(a,b);
	}

}
