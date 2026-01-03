package Day_24_12_2025_Numbers;
import java.util.Scanner;
public class SpyNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int a = s.nextInt();
		int sum=  0;
		int p =1;
		while(a!=0) {
			sum += a%10;
			p *= a%10;
			a = a/10;
		}
		if(p==sum) {
			System.out.println("Product is: " +p+" "+"Sum is: "+sum +" "+ "Spy");
		}else {
			System.out.println("Not Spy");
		}
	}

}
