package stream_api;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(24);
		myList.add(17);
		myList.add(5);
		
		System.out.println("Original list: " + myList);
		
//		Obtain a stream to the array list
		Stream<Integer> myStream = myList.stream();
		
//		Obtain the minimum, maximum value by use of min(), max(), isPresent(), and get()
		Optional<Integer> minVal = myStream.min(Integer::compare);
		if(minVal.isPresent())
			System.out.println("Minimum value is : " + minVal.get());
		
//		Must obtain a new stream because the previous call to min() was a terminal operation that consumed the stream
		myStream = myList.stream();
		Optional<Integer> maxVal = myStream.max(Integer::compare);
		if(maxVal.isPresent())
			System.out.println("Maximum value is : " + maxVal.get());
		
//		Sort the stream by use of sorted()
		Stream<Integer> sortedStream = myList.stream().sorted();
		
//		Display the sorted stream by use of for-each
		System.out.println("Sorted Stream: ");
		sortedStream.forEach((n) -> System.out.print(n + ", "));
		System.out.println();
		
//		Display only the odd values by use of filter()
		Stream<Integer> oddValues = myList.stream().sorted().filter((n) -> (n%2) == 1);
		System.out.println("Odd Values : ");
		oddValues.forEach((n) -> System.out.print(n + ", "));
		System.out.println();
		
//		Display only those odd values that are greater than 5. Notice that the two filter operations are pipelined.
		oddValues = myList.stream().filter((n) -> (n%2) == 1).filter((n) -> n > 5);
		System.out.println("Odd values greater than 5 : ");
		oddValues.forEach((n) -> System.out.print(n + ", "));
		System.out.println();
		
		
		
		
	}

}
