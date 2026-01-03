
package Capgemini20_12_2025;
import java.util.*;

public class Account_Balance {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Balance: ");
        int b = s.nextInt();
        s.nextLine();

        System.out.print("Enter the account status: ");
        String x = s.nextLine();

        System.out.print("Enter withdrawal amount: ");
        int w = s.nextInt();

        String result = (b > 0 && x.equals("active"))
                ? "Withdrawal Allowed. Remaining Balance: " + (b -= w)
                : "Withdrawal Not Allowed";

        System.out.println(result);
    }
}

