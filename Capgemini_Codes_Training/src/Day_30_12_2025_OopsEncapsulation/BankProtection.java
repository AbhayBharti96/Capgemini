package Day_30_12_2025_OopsEncapsulation;
import java.util.Scanner;
class Bank {
	private String username;
	private String pass;

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	void setUserName(String username) {
		this.username = username;
	}

	String getUsername() {
		return username;
	}
}

public class BankProtection {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the username: ");
		String x = s.nextLine();
		Bank b = new Bank();
		b.setUserName(x);
		System.out.print("Enter the Password: ");
		String y = s.nextLine();
		b.setPass(y);
		System.out.println("UserName is: " + b.getUsername());
		System.out.println("Password is: " + b.getPass());
	}

}
