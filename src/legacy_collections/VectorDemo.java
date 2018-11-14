package legacy_collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>(3, 2);
		System.out.println("Initial size = " + v.size());
		System.out.println("Initial capacity = " + v.capacity());
		
		v.addElement(91);
		v.addElement(7);
		v.addElement(47);
		v.addElement(4);
		System.out.println("Capacity after four additions = " + v.capacity());
		System.out.println("Current size = " + v.size());
		
		v.addElement(21);
		System.out.println("Current capacity = " + v.capacity());
		
		v.addElement(6);
		v.addElement(7);
		System.out.println("Current capacity = " + v.capacity());

		v.addElement(9);
		v.addElement(10);
		System.out.println("Current capacity = " + v.capacity());
		
		v.addElement(3);
		v.addElement(12);
		System.out.println("Current capacity = " + v.capacity());
		
		System.out.println("First element = " + v.firstElement());
		System.out.println("Last element = " + v.lastElement());
		
		if(v.contains(3))
			System.out.println("Vector contains 3");
		
		System.out.println("Using enumerator");
		Enumeration<Integer> vEnum = v.elements();
		System.out.println("\nElements in vector:");
		while(vEnum.hasMoreElements()) {
			System.out.print(vEnum.nextElement()+", ");
		}
		System.out.println();
		
		System.out.println("Using Iterator");
		Iterator<Integer> it = v.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" , ");
		System.out.println();
	}

}
