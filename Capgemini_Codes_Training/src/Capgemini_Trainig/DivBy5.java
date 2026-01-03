package Capgemini_Trainig;

import java.util.*;
public class DivBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number:  ");

		int number = s.nextInt();
		
		System.out.println(number%5==0 + number  ? "Div by 5" : "not div by 5");
		
		
	}

}
