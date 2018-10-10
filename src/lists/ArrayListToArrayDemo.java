package lists;

import java.util.ArrayList;

public class ArrayListToArrayDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(2);
		al.add(15);
		al.add(27);
		al.add(11);
		System.out.println("Contents of al: " + al);
		
		Integer ia[] = new Integer[al.size()];
		ia = al.toArray(ia);
		
		int sum = 0;
		
		for(int i: al)
			sum += i;

		System.out.println("The sum of the digits: " + sum);
	}

}


//Notes:
//	Collections can only store references to, not values of, primitive types.
//	However autoboxing makes it possible to pass values of type "int" to add() without having to manually wrap them within an Integer. 
//	Autoboxing causes them to be automatically wrapped.
