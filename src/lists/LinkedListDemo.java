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
