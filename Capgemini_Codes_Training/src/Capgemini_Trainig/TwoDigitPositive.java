package Capgemini_Trainig;

import java.util.*;
public class TwoDigitPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter two digit number: ");
		int num = s.nextInt();
		
		if(num > 9) {
			System.out.println("Positive");
			
			
		}else {
			System.out.println("Negative");
		}

	}

}
