package lambdas.method_references;

interface StringStaticMethFunc{
	
	String func(String n);
}

// This class defines a static method called strReverse()
class MyStringOps{
	static String strReverse(String str) {
		String reverse = "";
		
		for(int i=str.length()-1; i>=0; i--)
			reverse += str.charAt(i);
		
		return reverse;
	}
}


public class MethodRefToStaticMethodsDemo {

	static String stringOp(StringStaticMethFunc sf, String str) {
		return sf.func(str);
	}
	public static void main(String[] args) {
		
		String inStr = "Lambdas add power to Java!";
		String outStr;
		
//		Here a method reference to strReverse is passes to stringOp()
		outStr = stringOp(MyStringOps::strReverse, inStr);
		
		System.out.println("Original string: " + inStr);
		System.out.println("String reversed: " + outStr);
		

	}

}

//Notes:
//in the expression: outStr = stringOp(MyStringOps::strReverse, inStr); a reference to the static method strReverse() is passed to as the first argument to the stringOp().
//This works because strReverse is compatible with the StringStaticMethFunc functional interface.
//Thus the expression "MyStringOps::strReverse" evaluates to a reference to an object in which strReverse provides the implementation of func() in StringStaticMethFunc.

