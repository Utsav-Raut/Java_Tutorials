package lists;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		// Adding values into the list
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("Z");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("K");
		ll.add(1, "A2");
		System.out.println("Original contents of ll: " + ll);
		
		ll.remove("D");
		ll.remove(2);
		System.out.println("Contents of ll after deletion: " + ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents of the list after removal of the first and the last element: " + ll);
		
		// Get and set a value
		String val = ll.get(2);
		ll.set(2, val + " changed");
		System.out.println("ll after change: " + ll);
	}

}


//Notes:
//	To add elements to the start of a list we can use addFirst() or offerFirst()
// 	To add elements to the end of a list we can use addLast() or offerLast()
//	To obtain the first element we may use getFirst() or peekFirst()
//	To obtain the last element we may use getLast() or peekLast()
//	To remove the first element - getFirst() or pollFirst()
//	To remove the last element - getLast() or pollLast()

//	Since LinkedList implements the List interface, calls to add(E) appends items to the end of the list, as do calls to addLast().
//	To insert items at a specific location, we use the add(int, E) form of add()