package Day_24_12_2025_Numbers;
import java.util.*;

public class FactorialOfEachDigit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int a = s.nextInt();
	
		while(a!=0) {
			int digit  = a%10;
			int f =1;
			for(int i=1;i<=digit;i++) {
				f *= i;
			}System.out.print("factor of "+ digit +" is :");
			System.out.println(f);
			a=a/10;
		}
		

	}

}
