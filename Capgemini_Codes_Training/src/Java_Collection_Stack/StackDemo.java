package Java_Collection_Stack;

import java.util.LinkedList;
import java.util.Stack;

/*
 * Stack is LIFO Structure follows LastInFirstOut
 * It inherits the Subclass of Vector
 * 
 */
public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer>s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(15);
		System.out.println("Top element is: "+s.peek());
		System.out.println("Size of Stack is: "+s.size());
		while(s.size()!=0) {
			System.out.println(s);
			s.pop();
		}
		System.out.println("Is Empty: "+s.isEmpty());
		System.out.println("----------------------------------");
	System.out.println("---- Using LinkedList as Stack ----");
	LinkedList<Integer>l = new LinkedList<>();
	l.addLast(10);
	l.addLast(20);
	l.addLast(30);
	l.addLast(40);
	System.out.println("List is: "+l);
	System.out.println("Last Before Pop: "+l.getLast());//Work as Peek
	l.removeLast();// Works as Pop 
	System.out.println("After Pop last is: "+l.getLast());
	System.out.println("Size is: "+l.size());
	System.out.println("Check isEmpty: "+l.isEmpty());
	
	}

}
