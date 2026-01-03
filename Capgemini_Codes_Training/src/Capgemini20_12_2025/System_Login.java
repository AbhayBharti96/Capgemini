package Capgemini20_12_2025;
import java.util.*;

public class System_Login {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int attempts = 0;
        int maxAttempts = 3;

        System.out.print("Are username and password correct? (true/false): ");
        boolean cred = s.nextBoolean();

        // Conditional operator + compound assig nment
        String result = cred
                ? "User Logged In Successfully"
                : (++attempts >= maxAttempts
                    ? "Login Failed. Account Locked after " + attempts + " attempts"
                    : "Login Failed. Attempts: " + attempts);

        System.out.println(result);
       
    }
}
