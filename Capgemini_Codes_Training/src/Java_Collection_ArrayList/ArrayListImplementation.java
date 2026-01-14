package Java_Collection_ArrayList;
import java.util.*;
public class ArrayListImplementation {
static void ListAdd(ArrayList<Integer>l,int x) {
	l.add(x);
	
	
}
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of ArrayList: ");
		int a = s.nextInt();
		System.out.println("Enter the " +a+" elements: ");
		for(int i=0;i<a;i++) {
			l.add(s.nextInt());
		}
		System.out.println("List is: "+l);
		System.out.println("Size before adding Element: "+l.size());
		System.out.println("Add element to ArrayList: ");
		int x = s.nextInt();
		ListAdd(l,x);
		System.out.println(l);
		System.out.println("Size After adding Element: "+l.size());
		
	

	}

}
