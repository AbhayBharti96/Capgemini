package Capgemini_Trainig;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
	try (Scanner s = new Scanner(System.in)) {
		System.out.print("Enter the 1st number: A ");
		int a = s.nextInt();
		System.out.print("Enter the 2nd number: B ");
		int b = s.nextInt();
		System.out.println(a > b ? "A is Greater "+a : "B is Greater "+ b);
	}catch (Exception e) {
		System.out.println("Error is "+e);
	}	
	
	}
	}


