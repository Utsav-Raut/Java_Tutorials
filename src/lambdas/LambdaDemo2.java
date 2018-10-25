package lambdas;

interface NumericTest{
	boolean test(int n);
}
public class LambdaDemo2 {

	public static void main(String[] args) {
		
		NumericTest isEven = (n) -> n%2 == 0;
		if(isEven.test(10))
			System.out.println("10 is even");
		if(!isEven.test(9))
			System.out.println("9 is not even");

		NumericTest isNonNeg = (n) -> n >= 0;
		
		if(isNonNeg.test(1)) System.out.println("1 is non-neg");
		if(!isNonNeg.test(-1)) System.out.println("-1 is neg");
	}

}

//Notes:
//	The type of n in the above program ((n) = () -> n%2 ==0) is not specified, but is rather inferred from the parameter type of test() as defined by the NumericTest interface.
// 	We could have also mentioned the type of the parameter as: 
//		(int n) -> n % 2 == 0

// 	Another imp point about lambdas is that a functional interface reference can be used to execute any lambda expression that is compatible with it. 
//	This is evident from the way that we have used the two different lambda expressions that are compatible with test() of NumericTest.