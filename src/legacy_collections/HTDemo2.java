package legacy_collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;


public class HTDemo2 {

	public static void main(String[] args) {
		
		Hashtable<String, Double> balance = new Hashtable<String, Double>();
		
		String str;
//		Double bal;
		
		balance.put("John Doe", 3434.34);
		balance.put("Tom Smith", 123.22);
		balance.put("Jane Baker", 1378.00);
		balance.put("Tod Hall", 99.22);
		balance.put("Ralph Smith", -19.08);
		
		Set<String> setOfht = balance.keySet();
		Iterator<String> it = setOfht.iterator();
		
		while(it.hasNext()) {
			str = it.next();
			System.out.println(str + " : " + balance.get(str));
		}

	}

}
