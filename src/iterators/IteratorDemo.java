package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();

		// insert elements into the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		
		// Use iterator to display the contents of the list
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		// Modify objects being iterated
		ListIterator<String> li = al.listIterator();
		while(li.hasNext()) {
			String element = li.next();
			li.set(element + " + "); 
		}
		
		System.out.println("Modified elements of al: ");
		it = al.iterator();			//If we do not use this statement, then it will point to the end of the arraylist and so hasNext in next line will point to element after last position and will not print anything
		while(it.hasNext()) {
			String element = it.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		// Now display the list backwards
		System.out.println("Modified list backwards");
//		li = al.listIterator();						If we use this statement, then li will point to the begining of the arraylist and so hasPrevious in next line will point to 0 position and will not print anything
		while(li.hasPrevious()) {
			String element = li.previous();
			System.out.print(element + " ");
		}
		System.out.println();
		
	}
}

// Note:
//	After the list is modified, li points to the end of the list. li.hasNext() returns false when the end of the list has been reached.
//	To traverse the list in reverse, the program continues to use li, but this time it checks to see whether it has a previous element. As long as it does, that element is obtained and displayed.
