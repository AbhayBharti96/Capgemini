package Capgemini20_12_2025;
import java.util.*;
public class Student_Marks {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the Marks: ");
	int m = s.nextInt();
	System.out.print("Enter the attendance: ");
	int a = s.nextInt();
	String result = a>75 && m>40? m+5+ " Pass":"Fail";
	System.out.println(result);
	
	

	}

}
