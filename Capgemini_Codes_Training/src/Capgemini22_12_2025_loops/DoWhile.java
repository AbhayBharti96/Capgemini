package Capgemini22_12_2025_loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char a;

		do {
			System.out.println("Do you want to print? Press 'y' for Yes and 'n' for No:");
			a = s.next().charAt(0);
			if (a == 'y' || a == 'Y') {
				System.out.println("Yes");
			} else if (a == 'n' || a == 'N') {
				System.out.println("No");
			} else {
				System.out.println("Invalid input.");
			}
		} while (a == 'y' || a == 'Y');

	}
}
