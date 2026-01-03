package Capgemini_Trainig;

import java.util.*;

public class DivisibleBy3And5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number to check Divisiblity by 3 & 5:  ");
		int num = s.nextInt();
		
		System.out.println(num%3 == 0 && num%5 == 0 ? "True" : "False");

	}

}
