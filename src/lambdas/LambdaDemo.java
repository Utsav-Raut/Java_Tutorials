package lambdas;

interface MyNumber{
	double getValue();
}

public class LambdaDemo {

	public static void main(String[] args) {
		
		MyNumber myNum;				// Declare an interface reference
		
//		When a lambda expression occurs in a target type context, an instance of a class is automatically created that implements the functional interface
//		with the lambda expression defining the behavior of the abstract method declared by the functional interface.
//		When that method is called through the target, the lambda expression is executed. Thus a lambda expression gives us a way to transform a code segment into an object.

//		Here the lambda expression is simply a constant expression. The lambda expression becomes implementation of for the getValue() method.
//		When it is assigned to myNum, a class instance is constructed in which the lambda expression implements the getValue() method in MyNumber.
		myNum = () -> 123.45;
		
//		Call getValue() which is provided by the previously assigned lambda expression.
		System.out.println("A fixed value: " + myNum.getValue());

//		Here a more complex expression is used.
		myNum = () -> Math.random() * 100;
		
//		These call the lambda expression in the previous line
		System.out.println("A random value: " + myNum.getValue());
		System.out.println("Another random value: " + myNum.getValue());
		
//		A lambda expression must be compatible with the method defined by the target functional interface.args Therefore the next expression won't work.
//		myNum = () -> "123.30";  shows error
	}

}
