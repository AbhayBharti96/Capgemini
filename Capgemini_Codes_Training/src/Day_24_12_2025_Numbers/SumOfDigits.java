package Day_24_12_2025_Numbers;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int sum =0;
	while(a!=0) {
		sum += a%10;
		a= a/10;
	}
	System.out.println("Sum is: "+ sum);
	}

}
