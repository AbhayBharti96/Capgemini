package Day_24_12_2025_Numbers;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the number to be reversed: ");
	int a = s.nextInt();
	int rev = 0;
	while(a!=0) {
		int d = a%10;
		rev = rev *10+d;
		a=a/10;
	}
	System.out.print("Reversed Number is: "+rev);
	

	}

}
