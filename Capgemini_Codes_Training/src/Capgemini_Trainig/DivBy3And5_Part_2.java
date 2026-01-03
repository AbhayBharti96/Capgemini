package Capgemini_Trainig;

import java.util.*;

public class DivBy3And5_Part_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number to check:  ");
		
		int num = s.nextInt();
		
		if(num%3==0 && num%5 == 0) {
			System.out.println("BOTH");
		}else if(num%3==0) {
			System.out.println("By 3");
		}else if(num%5==0) {
			System.out.println("By 5");
		}else {
			System.out.println("NOT BY ANY");

		}
	}

}
