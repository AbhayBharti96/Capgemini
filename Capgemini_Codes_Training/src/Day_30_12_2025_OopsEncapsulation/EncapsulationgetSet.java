package Day_30_12_2025_OopsEncapsulation;

import java.util.Scanner;

class GET{
	private int age;
	
	public void setAge(int age) {
		if(age>0) {
			this.age = age;
		}
	}
	public int getAge() {
		return age;
	}
}
public class EncapsulationgetSet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the age to be Set: ");
		int age = s.nextInt();
		GET g = new GET();
		g.setAge(age);
		System.out.println("Setted Value is: "+g.getAge());

	}

}
