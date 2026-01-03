package Day_24_12_2025_Arrays;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size for Array: ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the " + n + " Elements in Array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Enter the index You want to print: ");
		int  j = s.nextInt();
		try{ 
			System.out.println(arr[j]);
		}catch(Exception e) {
			System.out.println("Excpetion is: "+e);
		}

	}

}
