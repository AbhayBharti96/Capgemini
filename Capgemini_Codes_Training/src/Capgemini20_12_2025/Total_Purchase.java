package Capgemini20_12_2025;
import java.util.Scanner;
public class Total_Purchase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter total purchase amount: ");
        double amount = s.nextDouble();

        System.out.print("Are you a premium member? (true/false): ");
        boolean isPremium = s.nextBoolean();

        System.out.print("Are you a first-time customer? (true/false): ");
        boolean isFirstTime = s.nextBoolean();

       
        String result = ((amount > 2000 && isPremium) || !isFirstTime)
                ? "Discount Applied. Final Amount: " + (amount -= 500)
                : "No Discount. Final Amount: " + amount;

        System.out.println(result);

    }
}
