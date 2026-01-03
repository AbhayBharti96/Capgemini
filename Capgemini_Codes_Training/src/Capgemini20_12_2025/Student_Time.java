package Capgemini20_12_2025;
import java.util.*;
public class Student_Time {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Attendance: ");
		int at = s.nextInt();
		System.out.println("Enter the exam duratio: ");
		int t = s.nextInt();
		System.out.println("Admin Premit: ");
		boolean admin = s.nextBoolean();	
		System.out.println("Are you physically Challenged: ");
		boolean p = s.nextBoolean();
		String r  =  p || at < 60 && admin? "Admin allow \n Give extra time "
				+ (t +=10 )
				:"Admin Deny No extra time provided";
		
		System.out.println(r);

	}

}
