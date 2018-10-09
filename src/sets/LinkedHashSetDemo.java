package sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> lhs = new LinkedHashSet<String>();
		
		// Add elements to the set
		lhs.add("D");
		lhs.add("B");
		lhs.add("A");
		lhs.add("D");
		lhs.add("E");
		lhs.add("B");
		lhs.add("C");
		lhs.add("F");
		
		System.out.println(lhs);
		
		System.out.println("***USING ITERATOR***");
		
		for(String it:lhs) {
			System.out.print(it + ", ");
		}

	}

}
