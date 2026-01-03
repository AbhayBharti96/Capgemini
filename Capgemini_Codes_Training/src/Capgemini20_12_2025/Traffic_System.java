package Capgemini20_12_2025;
import java.util.*;
public class Traffic_System {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int f = 500;
		int p = 1000;
		System.out.println("Enter the Speed: ");
		int sp = s.nextInt();
		System.out.println("Emergency or Not: ");
		boolean b = s.nextBoolean();
		
		String r =  !b && sp<60 ? "Fine is applied "+(f+=p):
			"Fine not Applied only penalty "+p;
		
		System.out.println(r);
	}

}
