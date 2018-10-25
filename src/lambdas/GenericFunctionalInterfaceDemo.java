package lambdas;

interface SomeFunc<T> {
	T func(T data);
}

public class GenericFunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		SomeFunc<String> reverse = (text) -> {
			String reverseOfText  = "";
			
			for(int i=text.length() -1; i >= 0; i--)
				reverseOfText += text.charAt(i);
			
			return reverseOfText;
		};
		
		System.out.println("Lambda reversed is: " + reverse.func("Lambda"));
		System.out.println("Expression reversed is: " + reverse.func("Expression"));

		SomeFunc<Integer> factorial = (num) -> {
			int fact = 1;
			
			for(int i=1; i <= num; i++) {
				fact *= i;
			}
			return fact;
		};
		
		System.out.println("The factorial of 4 is : " + factorial.func(4));
	}

}


//Note:
//	A lambda expression, itself, cannot specify type parameters. Thus, a lambda expression cannot be generic.
//	However the functional interface associated with a lambda expression cannot be generic. In this case, the target type of the lambda expression is determined, in part, by the type argument or arguments specified when a functional interface reference is declared.
