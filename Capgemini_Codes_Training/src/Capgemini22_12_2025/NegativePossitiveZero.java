package Capgemini22_12_2025;
import java.util.*;
public class NegativePossitiveZero {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a = s.nextInt();
		String x =" ";
		if(a>0) {
			x = "Positive";
		}if(a<0) {
			x = "Negative";
		}
		if(a==0) {
			x = "Zero";
		}
		System.out.println(a+ " is "+x);

	}

}
