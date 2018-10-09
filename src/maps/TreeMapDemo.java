package maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
//		Map<String, Double> tm = new TreeMap<String, Double>();
//		OR
		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		
		// Put elements into the map
		tm.put("John Doe", new Double(3434.34));
		tm.put("Tom Smith", new Double(123.22));
		tm.put("Jane Baker", new Double(1378.00));
		tm.put("Tod Hall", new Double(99.22));
		tm.put("Ralph Smith", new Double(-19.08));

		// Get a set of the entries
		Set<Map.Entry<String, Double>> set = tm.entrySet();
		
		// Display the elements
		for(Map.Entry<String, Double> me: set) {
			System.out.print(me.getKey()+": ");
			System.out.println(me.getValue());
		}
		
		System.out.println();
		
		// Deposit 1000 in John Doe's account
		double balance = tm.get("John Doe");
		tm.put("John Doe", balance + 1000);
		
		System.out.println("John Doe's new balance: "+tm.get("John Doe"));
	}

}

//Notes:
//	TreeMap sorts the keys. In this case, they are sorted by first name instead of last name. This behavior can be altered by specifying a comparator when the map is created.
//  TreeMap class extends AbstractMap and implements the NavigableMap interface. It creates maps stored in the tree structure.
//	A TreeMap provides efficient means of storing kay/value pairs in sorted and allows rapid retrieval.
//	Unlike a hashmap, a treemap guarantees that its elements will be stored in ascending key order.
//	It is a generic class that has this declaration: class TreeMap<K, V>  where K specifies the type of keys, adn V specifies the type of values
//	The following TreeMap constructors are defined as:
//		TreeMap();     								Constructs an empty tree that will be sorted by using the natural order of its keys
//		TreeMap(Comparator<? super K> comp)			Constructs an empty tree-based map that will be sorted by using the Comparator comp
//		TreeMap(Map<? extends K, ? extends V> m)	Initializes a tree map with entries from m, which will be sorted by using the natural order of keys
//		TreeMap(SortedMap<K, ? extends V> sm)		Initializes a tree map with the entries from sm, which will be sorted in the same order as sm.
//
//