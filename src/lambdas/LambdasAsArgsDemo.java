package lambdas;

import java.beans.Expression;

interface StringFunction{
	String func(String n);
}

public class LambdasAsArgsDemo {

//	This method has a functional interface as the type of its first parameter. Thus, it can be passed a reference to any instance of that interface, including the instance created by a lambda expression.
//	The second parameter specifies the string to operate on.
	
	static String stringOps(StringFunction sf, String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		
		String inStr = "Lambdas add power to Java";
		String outStr;
		
		System.out.println("Here is the input string: " + inStr);
		
//		Here is a simple expression lambda that uppercases a string that is passes to stringOps
		outStr = stringOps((text) -> text.toUpperCase(), inStr);
		System.out.println("Here is the output string: " + outStr);
		
//		This passes a block lambda that remove the spaces
		outStr = stringOps((text) -> {
			String result = "";
			
			for(int i=0; i<text.length(); i++) {
				if(text.charAt(i) != ' ')
					result += text.charAt(i);
			}
			return result;
		}, inStr);
		
		System.out.println("The output string now with spaces removed is: " + outStr);
		
//		It is also possible to pass a StringFunc instance created by an earlier lambda Expression
		StringFunction reverse = (str) -> {
			
			String reverseOfText = "";
			for(int i=str.length()-1; i>=0; i--) {
				reverseOfText += str.charAt(i);
			}
			return reverseOfText;
		};
		
//		Here reverse is passes as the first parameter to stringOps()
		System.out.println("The reverse of the input string is: " + stringOps(reverse, inStr));
	}

}
