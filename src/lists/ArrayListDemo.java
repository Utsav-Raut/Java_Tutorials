package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// Create an array list
		List<String> al = new ArrayList<String>();
		System.out.println("Initial size of the array list: " + al.size());
		
		// Add elements to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("B");
		al.add("F");
		al.add(1, "A2");
		
		System.out.println("Size of the array list after the addition of elements: " + al.size());
		System.out.println("Contents of the array list: "  + al);
		
		// Remove elements from array list
		al.remove("F");
		al.remove(2);
		
		System.out.println("Size after deletions: " + al.size());
		System.out.println("Contents after deletion: " + al);
		
		System.out.println(al.get(5));
		
		List<String> al2 = new ArrayList<String>();
		al2.addAll(al);
		System.out.println(al2);
		
	}

}
