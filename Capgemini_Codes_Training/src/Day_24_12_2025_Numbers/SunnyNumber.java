package Day_24_12_2025_Numbers;
import java.util.*;

public class SunnyNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = s.nextInt();

        int n = a + 1;  
        int sqrt = (int) Math.sqrt(n);

        if (sqrt * sqrt == n) {
            System.out.println("Sunny Number");
        } else {
            System.out.println("Not a Sunny Number");
        }
    }
}
