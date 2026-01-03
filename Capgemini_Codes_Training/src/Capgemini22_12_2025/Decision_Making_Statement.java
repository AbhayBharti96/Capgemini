package Capgemini22_12_2025;
import java.util.*;
public class Decision_Making_Statement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Month Number bw 1-10 only :" );
		int a = s.nextInt();
		System.out.print(a+ " Month is: ");
		switch(a) {
		case 1:System.out.println("Jan");
		break;
		case 2: System.out.println("Feb");
		break;
		case 3: System.out.println("Mar");
		break;
		case 4: System.out.println("Apr");
		break;
		case 5: System.out.println("May");
		break ;
		case 6: System.out.println("Jun");
		break ;
		case 7: System.out.println("Jul");
		break ;
		case 8: System.out.println("Aug");
		break ;
		case 9: System.out.println("Sep");
		break ;
		case 10: System.out.println("Oct");
		break ;
		default :
			System.out.println("None of them");
			break;
		}

	}

}
