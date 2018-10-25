package lambdas;

interface DoubleNumberArrayFunc{
	double func(double[] arr) throws ArrayEmptyException;
	
}

class ArrayEmptyException extends Exception{
	public ArrayEmptyException() {
		super("Array Empty");
	}
}
public class LambdaExceptionDemo {

	public static void main(String[] args) throws ArrayEmptyException {
		
		double[] values = {1.2, 2.5, 114.78, 258.14, 14.9, 37.68};
		
//		In the below line we need to mention the parameter as an array since lambda expression parameter gets inferred from the target context and hence need not specify them explicitly.
		DoubleNumberArrayFunc average = (arr) -> {
			int sum = 0;
			
			if(arr.length == 0)
				throw new ArrayEmptyException();
			for(int i=0; i<arr.length; i++)
				sum += arr[i];
			return sum/arr.length;
		};

		System.out.println("The average is: " + average.func(values));
		System.out.println("The average is: " + average.func(new double[0]));
	}

}
