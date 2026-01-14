package Java_Collection_Vector;

import java.util.Arrays;
import java.util.Vector;

/*
 * Thread free and it legacy class of List
 * it dynamic array 
 * synchronised 
 * Default capacity is: 10 
 * It increase size when default capacity increase 
 * it doubles up the size 
 * We can Assign any collections in it
 */
public class VectorDemo1 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(15);
		v.add(4);
		v.add(23);
		v.add(45);
		System.out.print("[");
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i)+"");
			if(i<v.size()-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
		
		//System.out.println(v.capacity());
		Vector<Integer> v1 = new Vector<>(Arrays.asList(1, 2, 3));

	}

}
