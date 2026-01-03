package Capgemini22_12_2025;
import java.util.*;
public class MaximumOf3 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the num1: ");
	int a = s.nextInt();
	System.out.println("Enter the num2: ");
	int b = s.nextInt();
	System.out.println("Enter the num3: ");
	int c =  s.nextInt();
	if(a>b && a>c) {
		System.out.println("A is greater");
	}else if( b>a&& b>c) {
		System.out.println("B is greater");
	}else {
		System.out.println("C is greater");
	}
	

	}

}
