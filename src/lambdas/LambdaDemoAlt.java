package lambdas;

interface MyInt{
	double getVal();
}
public class LambdaDemoAlt implements MyInt {

	public static void main(String[] args) {
		
		MyInt myI = new LambdaDemoAlt();
		System.out.println(myI.getVal());

	}

	@Override
	public double getVal() {
		
		return 123.45;
	}

}
