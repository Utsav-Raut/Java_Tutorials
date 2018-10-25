package lambdas.method_references;

interface StringInstanceMethFunc{
	
	String func(String n);
}

// This class defines a static method called strReverse()
class MyStringOpsInstanceMeth {
		
	String strReverse(String str) {
		String reverse = "";
		
		for(int i=str.length()-1; i>=0; i--)
			reverse += str.charAt(i);
		
		return reverse;
	}
}
public class MethodRefToInstanceMethsDemo {
	
	static String stringOp(StringInstanceMethFunc sf, String str) {
		return sf.func(str);
	}

	public static void main(String[] args) {
		
		String inStr = "Lambdas add power to Java!";
		String outStr;
		
//		Create an object of MyStringOpsInstanceMeth
		MyStringOpsInstanceMeth myStringOpsInstanceMethObj = new MyStringOpsInstanceMeth();
		
//		Here a method reference to the instance method strReverse is passed
		outStr = stringOp(myStringOpsInstanceMethObj::strReverse, inStr);
		
		System.out.println("Original string: " + inStr);
		System.out.println("String reversed: " + outStr);
		

	}

}

//In this program the strReverse() method is an instance method of MyStringOpsInstanceMeth and hence is accessed using an instance inside the main method.

