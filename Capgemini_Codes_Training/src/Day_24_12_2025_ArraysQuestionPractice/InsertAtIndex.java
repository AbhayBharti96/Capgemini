package Day_24_12_2025_ArraysQuestionPractice;
import java.util.Scanner;
public class InsertAtIndex {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n + 1];

	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Enter element to insert: ");
	        int element = sc.nextInt();

	        System.out.print("Enter index position: ");
	        int index = sc.nextInt();

	        // Shift elements to the right
	        for (int i = n; i > index; i--) {
	            arr[i] = arr[i - 1];
	        }

	        // Insert element
	        arr[index] = element;

	        System.out.println("Array after insertion:");
	        for (int i = 0; i <= n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}
