package comparators;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TComp implements Comparator<String>{
	
	public int compare(String a, String b) {
		int i, j, k;
		String aStr, bStr;
		
		aStr = a;
		bStr = b;
		
		// Find index of beginning of last name
		i = aStr.lastIndexOf(' ');
		j = bStr.lastIndexOf(' ');
		
		k = aStr.substring(i).compareTo(bStr.substring(j));
		if(k == 0)		// last name matches, check entire name
			return aStr.compareTo(bStr);
		else 
			return k;
	}
	
	// No need to override equals
}
public class TreeDemo2 {

	public static void main(String[] args) {
		
		TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());
		
		// Put elements into the map
		tm.put("John Doe", new Double(3434.34));
		tm.put("Tom Smith", new Double(123.22));
		tm.put("Jane Baker", new Double(1378.00));
		tm.put("Tod Hall", new Double(99.22));
		tm.put("Ralph Smith", new Double(-19.08));
		
		// Get a set of the entries
		Set<Map.Entry<String, Double>> set = tm.entrySet();
		
		// Displaying the elements
		for(Map.Entry<String, Double> me: set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		
		System.out.println();

	}

}

//Notes:
//	This program sorted the account by last name.
//	The comparator class TComp compares two strings that holds first and last names. It does so by comparing the first and last names.
//  To do so, it finds the index of the last space in each string and then compares the substrings of each element that begin at that point.
//	In cases where last names are equivalent, the first names are then compared.
//	This yields a tree map that is sorted by last name, and within last name by first name. This is evident because Ralph Smith comes before Tom Smith in the output.


