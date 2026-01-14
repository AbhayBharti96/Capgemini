package PolyMorphismAssigment;

import java.util.Scanner;

interface Notification {
	void send();

}

class Email implements Notification {
	public void send() {
		System.out.println("Message from Email");
	}
}

class SMS implements Notification {
	public void send() {
		System.out.println("Message from SMS");
	}
}

class Push implements Notification {
	public void send() {
		System.out.println("Message from PushMessage");
	}
}

public class Solution05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter message preference: ");
		String a = s.nextLine();
		Notification n;
		switch (a) {
		case "EMAIL":
			n = new Email();
			break;
		case "SMS":
			n = new SMS();
			break;
		case "PUSH":
			n = new Push();
			break;
		default:
			System.out.println("Invalid Choice");
			n = new Push();
		}
		n.send();

	}

}
