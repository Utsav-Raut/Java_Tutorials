package maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Map<String, Double> lhm = new LinkedHashMap<String, Double>();
		
		// Put the elements into the map
		lhm.put("John Doe", new Double(3434.34));
		lhm.put("Tom Smith", new Double(123.22));
		lhm.put("Jane Baker", new Double(1378.00));
		lhm.put("Tod Hall", new Double(99.22));
		lhm.put("Ralph Smith", new Double(-19.08));

//		Obtain the set of the entries
		Set<Map.Entry<String, Double>> set = lhm.entrySet();
		
		// Display the elements
		for(Map.Entry<String, Double> me: set) {
			System.out.print(me.getKey()+": ");
			System.out.println(me.getValue());
		}
		

	}

}

//Notes:
//	LinkedHashMap extends HashMap. It maintains a linked list of the entries in the map, in the order in which they were inserted. This allows insertion order iteration over the map, i.e when iterating the elements will be returned in the order in which they were inserted.
//	We can also create LinkedHashMap that returns its elements in the order in which they were last accessed.
// 	It is a generic class that has this declaration: class LinkedHashMap<K, V>, where K is the type of keys and V specifies the type of values.
// 	LinkedHashMap defines the following constructors:
//		LinkedHashMap()
//		LinkedHashMap(Map<? extends K, ? extends V> m)
//		LinkedHashMap(int capacity)										default capacity is 16
//		LinkedHashMap(int capacity, float fillRatio)					default capacity is 16 and default ratio is 0.75
//		LinkedHashMap(int capacity, float fillRatio, boolean Order)		This last form allows us to specify whether the elements will be stored in the linked list by insertion order, or by order of the last access. 
//		above if, the Order is true then access order is used. If Order is false, then insertion order is used.

//		LinkedHashMap adds only one method to those defined by HashMap. This method is:   protected boolean removeEldestEntry(Map.Entry<K, V> e)
//		This method is called by put() and putAll(). The oldest entry is passed in e. By default this method returns false and does nothing.
//		However if we override this method, then we can have the LinkedHashMap remove the oldest entry in the map. To do this, have your override return true. To keep the oldest entry, return false.
