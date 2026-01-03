package Day_24_12_2025_Numbers;

import java.util.*;

public class FactorsOfDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = s.nextInt();
		int f = 1;
		while (a != 0) {
			int digit = a % 10;
			for (int i = 1; i <= digit; i++) {
				if (digit % i == 0) {
					System.out.print(i + " ");
				}
			}
			a = a / 10;
			System.out.println();
		}

	}

}
