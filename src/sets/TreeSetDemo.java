package sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<String> ts = new TreeSet<String>();
		
		// Add elements to the set
		ts.add("D");
		ts.add("B");
		ts.add("A");
		ts.add("D");
		ts.add("E");
		ts.add("B");
		ts.add("C");
		ts.add("F");
		
		System.out.println(ts);
		System.out.println();
		
	}

}
