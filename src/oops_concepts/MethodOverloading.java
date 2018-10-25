package oops_concepts;

class Overload {
	void demo(int a) {
		System.out.println("a: " + a);
	}
	
	void demo(int a, int b) {
		System.out.println("a and b: " + a + ", " + b);
	}
	
	double demo(double a) {
		System.out.println("double a: " + a);
		return a*a;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Overload obj = new Overload();
		obj.demo(10);
		obj.demo(5, 6);
		double result = obj.demo(5.5);
		System.out.println("o/p: " + result);

	}

}
