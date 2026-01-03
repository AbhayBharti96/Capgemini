package Capgemini22_12_2025;
import java.util.*;

public class CharCheck {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the character: ");
	char c = s.next().charAt(0);
	if(c>='A'&& c<='Z') {
		System.out.println("Is upper");
	}if(c>='a' && c <= 'z') {
		System.out.println("Is lower");
	}if(!Character.isLetter(c)) {
		System.out.println("Is special character");
	}

	}

}
