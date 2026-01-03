package Capgemini22_12_2025;
import java.util.*;
public class EvenOdd01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number to be checked: ");
		int a = s.nextInt();
		if(a % 2 == 0) {
			System.out.println(a+ " is Even");
		}else {
			System.out.println(a+ " is Odd");
		}
	}

}
