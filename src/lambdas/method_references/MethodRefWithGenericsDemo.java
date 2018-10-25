package lambdas.method_references;

interface MyMethodRefGenericFunc<T> {
	int func(T[] arr, T v);
}

// This class defines a method called countMatching() that returns the number of items in an array that are equal to a specified value.
// countMatching is generic but MyArrayOps is not

class MyArrayOps {
	
	static <T> int countMatching(T[] vals, T v) {
		int count = 0;
		
		for(int i=0; i<vals.length; i++) {
			if(vals[i] == v)
				count ++;
		}
		return count;
	}
}
public class MethodRefWithGenericsDemo {

	static <T> int myOps(MyMethodRefGenericFunc<T> f, T[] vals, T v) {
		return f.func(vals, v);
	}
	
	public static void main(String[] args) {
		
		Integer[] vals = {5, 2, 6, 9, 3, 1, 2, 4, 5, 6, 2, 7};
		String[] strs = {"One0", "Two", "Three", "Four", "TWO"};
		int count;
		
		count = myOps(MyArrayOps::<Integer>countMatching, vals, 2);
		System.out.println("vals contains : " + count + " 2s");
		
		count = myOps(MyArrayOps::<String>countMatching, strs, "Two");
		System.out.println("strs contains : " + count + " Twos");
	}

}
