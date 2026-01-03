package Day_24_12_2025_Arrays;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = 3;
		int n2 = 3;
		int A[][] = new int[n1][n2];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				A[i][j] = s.nextInt();
			}
		}

		System.out.println("2D Array is: ");
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

	}
}

/* Enter the elements: 
1 2 3
4 5 6
7 8 9
Output:  2D Array is: 
1 2 3 
4 5 6 
7 8 9 

*/
