package Java_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConversionOperations {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		System.out.println("-----Converting List to Array-----");
		System.out.println("Using the Integer[] arr = list.toArray(new Integer[0])");
		Integer [] arr = l.toArray(new Integer[0]);
		for(int x:arr)System.out.print(x+" ");
		Integer[]arr1 = {1,2,3,4,5,6,7};
		System.out.println();
		System.out.println("Converting Array to List: using ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr))");
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr1));
		System.out.println("Lits is: "+list2);
		System.out.println("Creating an copy of List in new Var: using ArrayList<Integer> copy = new ArrayList<>(list)");
		ArrayList<Integer>cp = new ArrayList<>(list2);
		System.out.println("Cp is: "+cp);
		System.out.println(cp.retainAll(list2));// To check Common Element
		System.out.println(cp.removeAll(l));// To remove common elements

	}

}
