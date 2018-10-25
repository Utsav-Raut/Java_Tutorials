package lambdas;

interface StringFunc{
	
	String func(String text);
}

public class BlockLambdaDemo2 {

	public static void main(String[] args) {
		
		StringFunc reverse = (text) -> {
			String reverseOfText = "";
			
			for(int i = text.length() - 1; i >= 0; i--) {
				reverseOfText += text.charAt(i);
			}
			
			return reverseOfText;
		};
		
		System.out.println("The reverse of the expression Lambda is: " + reverse.func("Lambda"));
		System.out.println("The reverse of the expression Expression is: " + reverse.func("Expression"));

	}

}
