package Capgemini22_12_2025;
import java.util.*;
public class VowelOrConsonants {

	public static void main(String[] args) {

Scanner s = new Scanner(System.in);
System.out.println("Enter the character: ");
char a =Character.toLowerCase(s.next().charAt(0));
if (a== 'a' || a == 'e' || a == 'i' || a == 'o'  || a == 'u') {
	System.out.println(a+ " is vowel");
}else {
	System.out.println(a+" is consonant");
}

	}

}
