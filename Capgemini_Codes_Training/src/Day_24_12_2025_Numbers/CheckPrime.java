package Day_24_12_2025_Numbers;

import java.util.Scanner;

public class CheckPrime {
public static boolean IsPrime(int a) {
	if (a <=1) {
		return true;
	}
	for(int i=2;i<Math.sqrt(a);i++) {
		if(a%i==0) {
			return false;
		}
	}
	return true;
	
}
	public static void main(String[] args) {
		
Scanner s = new Scanner(System.in);
System.out.println("enter the number to check: ");
int a = s.nextInt();
System.out.println(IsPrime(a));
	}

}
