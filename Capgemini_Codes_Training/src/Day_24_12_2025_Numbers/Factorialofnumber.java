package Day_24_12_2025_Numbers;

import java.util.Scanner;

public class Factorialofnumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	System.out.print("Enter the number to find factorial: ");
	int a = s.nextInt();
	int f =1 ;
	for(int i=1;i<=a;i++) {
		f *= i;
	}
System.out.println(f);
	}
}
