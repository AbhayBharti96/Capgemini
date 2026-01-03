package Capgemini20_12_2025;
import java.util.*;
public class Employee_Eligiblity {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	System.out.println("Enter the rating: ");
	int r = s.nextInt();
	System.out.println("Enter experience years: ");
	int y = s.nextInt();
	System.out.println("Enter the Dsicripancy Status: ");
	boolean b = s.nextBoolean();
	boolean elig = r>4 || y>5 && !b ? true : false;
	System.out.println(elig ? "Eligible Salary Can Increment":"Salary cant Increment Have Discrepency");
	
	}
}