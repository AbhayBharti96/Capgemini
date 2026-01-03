package Capgemini22_12_2025;
import java.util.*;
public class DivisibleByr5And11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int a = s.nextInt();
		if(a%5==0 && a%11==0) {
			System.out.println("Yes Divisible by 5 and 11");
		}else {
			System.out.println("Not Divisible by 5 and 11");
		}
	}

}
