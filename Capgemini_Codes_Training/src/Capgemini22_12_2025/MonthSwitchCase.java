package Capgemini22_12_2025;

import java.util.*;

public class MonthSwitchCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Month like Jan Feb only only three chars: ");
		String a = s.nextLine();
		System.out.print("In " + a + " No. of Days is:  ");
		switch (a) {
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Dec":
		case "Oct":
			System.out.println(31);
			break;
		case "Feb":
			System.out.println(28);
			break;
		case "Apr":
		case "Jun":
		case "Sept":
		case "Nov":
			System.out.println(30);
			break;
		default:
			System.out.println("None");

		}
	}

}
