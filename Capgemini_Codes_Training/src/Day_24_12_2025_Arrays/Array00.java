package Day_24_12_2025_Arrays;

import java.util.*;

public class Array00 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size for Array: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the " + n + " Elements in Array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.print("Array is: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
