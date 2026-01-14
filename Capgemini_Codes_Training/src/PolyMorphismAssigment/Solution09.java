package PolyMorphismAssigment;

import java.util.Scanner;

class Character{
	void Attack() {
		System.out.println("Restart the Game Again..");
}
}
class Warrior extends Character{
	void Attack() {
		System.out.println("Hello i am Warrior");
}
}
class Archer extends Character{
	void Attack() {
		System.out.println("Hello i am Archer");
}
}
class Mage extends Character{
	void Attack() {
		System.out.println("Hello i am Mage");
}
}

public class Solution09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Game [War,Archer,Mage] -->");
		String a = s.nextLine().toUpperCase();
	Character c=null;

switch(a) {
case "WAR":
	c = new Warrior();
	break;
case "ARCHER":
	c = new Archer();
	break;
case "MAGE":
	c = new Mage();
	break;
	default :
		System.out.println("Invalid Choice..");
		c = new Character();
}
System.out.println(" --- Starting the Game --- ");
 c.Attack();
s.close();
	}

}
