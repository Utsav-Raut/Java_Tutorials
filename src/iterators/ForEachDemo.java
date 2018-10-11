package iterators;

import java.util.ArrayList;

public class ForEachDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> vals = new ArrayList<Integer>();
		
		vals.add(4);
		vals.add(2);
		vals.add(1);
		vals.add(3);
		vals.add(5);
 
		System.out.println("Original contents of vals: ");
		for(int v: vals)
			System.out.print(v + " ");
		System.out.println();
		
		// Now sum the values using the for loop
		int sum = 0;
		for(int v: vals) {
			sum += v;
		}
		
		System.out.println("Sum of the values: " + sum);
	}

}

//Note:
//	If we won't be modifying the contents of a collection or obtaining elements in reverse order, then the for-each version of the for loop is often a more convenient alternative
//	to cycling through a collection than is using an iterator.
//	For can cycle through any collection of objects that implements the Iterable interface.
//	Because all the collection classes implement this interface, they can all be operated upon by for.