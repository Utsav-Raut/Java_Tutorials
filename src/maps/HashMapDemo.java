package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Map<String, Double> hm = new HashMap<String, Double>();
		
		// put the elements into the map
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Tod Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));
		
		//Get a set of the entries
		Set<Map.Entry<String, Double>> set = hm.entrySet();
		
		//Display the set
		for(Map.Entry<String, Double> me: set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		
		System.out.println();
		
		//Deposit 1000 into John Doe's account
		double balance = hm.get("John Doe");
		hm.put("John Doe", balance + 1000);
		
		System.out.println("John Doe's new balance: "+hm.get("John Doe"));

	}

}

//Notes:
//HashMap class extends AbstractMap and implements the Map interface. It uses a hash table to store the map. This allows the execution time of get() and put() to remain constant even for large sets.
//HashMap is a generic class that has the declaration as- class HashMap<K, V>, where K specifies the type of keys and V specifies the type of values.
//Constructors of HashMap:
//		HashMap()									 This is the default hash map
//		HashMap(Map<? extends K, ? extends V> m)	 This initializes the hash map by using the elements of m
//		HashMap(int capacity)						 Initializes the capacity of the hash map to capacity
//		HashMap(int capacity, float fillRatio)		 Meaning of capacity and fillRatio are same as that of HashSet. Default capacity is 16, default fill ratio is 0.75
//
//		HashMap does not guarantee the order of it's elements. The order in which the elements are added are not necessarily the order in which the elements are read by iterator.
