package Java_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListPreDefineMethods {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	l.add(60);
	ArrayList<Integer> l2 = new ArrayList<>();
	l2.add(70);
	l2.add(80);
	l2.add(90);
		System.out.println("------Method that we can use in ArrayList------");
		System.out.println("Before Adddig new element: "+l);
		l.add(10);
		System.out.println("list.add(Num): "+l);
		l.add(2,30);
		System.out.println("list.add(index,Num):"+l);
		System.out.println("Before Combine two List l is: "+l);
		l.addAll(l2);
		System.out.println("Adding one list to Another List: "+l);
		System.out.println("Fetching particular element from List: l.get(index): "+l.get(5));
		System.out.println("Size of ArrayList l.size(): "+l.size());
		System.out.println("Check list empty or not l.isEmpty(): "+l.isEmpty());
		l.set(2,20);
		System.out.println("Update list using l.set(index,element): "+l);
		l.remove(8);
		System.out.println("List after remove l.remove(index): "+l);
		l.remove(Integer.valueOf(90));
		System.out.println("Remove by Value: Integer.valueOf(90): "+l);
		System.out.println("------ Search Operations -------");
		System.out.println("Search By value: list.contains(value): "+l.contains(50));
		System.out.println("Search Index of element: l.indexOf(value): "+l.indexOf(50));
		System.out.println("Search the last index of element: l.lastIndexOf(value): "+l.lastIndexOf(50));
		Collections.sort(l);
		System.out.println("Sorting of List Using Collections.sort(list)"+l);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("In Reverse Order: Collections.sort(list, Collections.reverseOrder())"+l);
	}

}
