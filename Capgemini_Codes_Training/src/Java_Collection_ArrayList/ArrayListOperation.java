package Java_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperation {
	// Method To Convert List to Array
	static Integer[] RetArr(ArrayList<Integer> l) {
		Integer[] arr = l.toArray(new Integer[0]);
		return arr;
	}

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of ArrayList: ");
		int a = s.nextInt();
		System.out.println("Enter the " + a + " elements: ");
		for (int i = 0; i < a; i++) {
			l.add(s.nextInt());
		}
		
		
		System.out.println("------ Converting list to Array -------");

		System.out.println("Array is: ");
		Integer[] arr = RetArr(l);
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

}
