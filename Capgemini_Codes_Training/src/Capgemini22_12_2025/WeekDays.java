package Capgemini22_12_2025;
import java.util.Scanner;
public class WeekDays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the First Char of WeekDay: ");
		int a = s.nextInt();
		System.out.print(a+ " day is ");
		switch(a) {
		case 1: 
				System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Fiday");
		break ;
		case 6: System.out.println("Saturday");
		break ;
		case 7: System.out.println("Sunday");
		default :
			System.out.println("None Of Week Day");
		

	}

}
}
