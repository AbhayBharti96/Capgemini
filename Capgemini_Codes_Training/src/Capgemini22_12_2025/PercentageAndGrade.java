package Capgemini22_12_2025;
import java.util.Scanner;

public class PercentageAndGrade {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the Marks for Maths: ");
        int m = s.nextInt();
        System.out.print("Enter the Marks for English: ");
        int e = s.nextInt();
        System.out.print("Enter the Marks for Science: ");
        int sc = s.nextInt();
        System.out.print("Enter the Marks for Hindi: ");
        int h = s.nextInt();
        System.out.print("Enter the Marks for Physics: ");
        int p = s.nextInt();

      
        double x = ((m + e + sc + h + p) / 500.0) * 100;
        System.out.printf("Percentage is: %.2f%%\n", x);
       
        if (x >= 80 && x <= 100) {
            System.out.println("Grade: O+");
        } 
        else if (x >= 60 && x < 80) {
            System.out.println("Grade: A+");
        } 
        else if (x >= 50 && x < 60) {
            System.out.println("Grade: A");
        } 
        else if (x >= 40 && x < 50) {
            System.out.println("Grade: B");
        } 
        else {
            System.out.println("Grade: Fail");
        }

        
    }
}
