package Day_24_12_2025_Numbers;

import java.util.*;

public class CountDigits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int a = s.nextInt();
		
		int c = 0;
		while (a != 0) {
			a = a / 10;
			
			c++;
		}
		System.out.println("Count of Digits: " + c);
	}

}