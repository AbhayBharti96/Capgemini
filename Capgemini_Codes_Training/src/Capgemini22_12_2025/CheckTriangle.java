package Capgemini22_12_2025;
import java.util.*;
public class CheckTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the first Side: ");
        int s1 = s.nextInt();
        System.out.print("Enter the second Side: ");
        int s2 = s.nextInt();
        System.out.print("Enter the third side: ");
        int s3 = s.nextInt();

        if ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1)) {
            System.out.print("Sides are: " + s1 + " " + s2 + " " + s3 + " -> ");

            if (s1 == s2 && s2 == s3) {
                System.out.println("Equilateral Triangle");
            } else if (s1 == s2 || s1 == s3 || s2 == s3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
        
    }
}
