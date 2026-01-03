package Capgemini_Trainig;

import java.util.*;

public class EligibleForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your attendance: ");
		int attendance = s.nextInt();
		System.out.println("Enter your marks: ");

		int marks = s.nextInt();
		
		System.out.println(attendance > 75 && marks > 40 ? "Eligible" : "Not");

	}

}
