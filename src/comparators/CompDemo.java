package comparators;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String>{
	
	public int compare(String a, String b) {
		String aStr, bStr;
		
		aStr = a;
		bStr = b;
		
		// Reverse the comparison
		return bStr.compareTo(aStr);
	}
}
public class CompDemo {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>(new MyComp());

		// Add elements to the tree set
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
		// Displaying the elements
		for(String element: ts) {
			System.out.print(element + " ");
		}
		
		System.out.println();
	}

}

//Notes:
//	As mentioned in the notes, overriding equals() is neither necessary nor common.
//	Inside compare(), the "String" method "compareTo()" compares two strings. However, bStr- not aStr- invokes compareTo(). This causes the outcome to be reversed.