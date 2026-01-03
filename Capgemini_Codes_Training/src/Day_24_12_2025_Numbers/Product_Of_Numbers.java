package Day_24_12_2025_Numbers;

import java.util.Scanner;
public class Product_Of_Numbers {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Number: ");
			int a = s.nextInt();
			int p =1;
			while(a!=0) {
				 p *= a%10;
				a= a/10;
			}
			System.out.println("Product of Digits: "+p);
			}

		


	}

