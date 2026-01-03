package Capgemini_Trainig;

import java.util.*;
public class MultipleOf10 {

	public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number to check:  ");
		
		int num = s.nextInt();
		
		System.out.println(num%2==0 || num%5==0  ? num +" Number is divisible" : num+ " Number is not divisible" );
		
		
	}

}
