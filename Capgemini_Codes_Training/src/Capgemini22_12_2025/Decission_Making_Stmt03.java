package Capgemini22_12_2025;
import java.util.*;
public class Decission_Making_Stmt03 {
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the first number: ");
	int a = s.nextInt();
	System.out.println("enter the second number: ");
	int b = s.nextInt();
	if(a>b) {
		System.out.println(a+" is greater");
	}else {
		System.out.println(b+" is greater");
	}
	
}
}
