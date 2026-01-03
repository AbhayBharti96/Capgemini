package Capgemini22_12_2025;

import java.util.*;

public class Alphabet {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Alphabet in Uppercase upto A-D: ");
		char a = s.next().charAt(0);
		System.out.print(a + " for : ");
		switch (a) {
		case 'A':
			System.out.println("Apple");
			break;
		case 'B':
			System.out.println("Ball");
			break;
		case 'C':
			System.out.println("Cat");
			break;
		case 'D':
			System.out.println("Dog");
			break;
		default:
			System.out.println("None of the Alphabet");

		}

	}
}
