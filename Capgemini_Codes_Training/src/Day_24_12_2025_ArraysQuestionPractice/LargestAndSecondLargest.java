package Day_24_12_2025_ArraysQuestionPractice;

import java.util.Scanner;

public class LargestAndSecondLargest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int n = s.nextInt();

        if (n < 2) {
            System.out.println("Second largest not possible");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the elements in Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int l = arr[0];
        int sl = Integer.MIN_VALUE;

        // Find largest
        for (int i = 1; i < n; i++) {
            if (arr[i] > l) {
                l = arr[i];
            }
        }

        // Find second largest
        for (int i = 0; i < n; i++) {
            if (arr[i] > sl && arr[i] != l) {
                sl = arr[i];
            }
        }

        System.out.println("Largest in Array is: " + l);
        System.out.println("Second Largest in Array is: " + sl);
    }
}
