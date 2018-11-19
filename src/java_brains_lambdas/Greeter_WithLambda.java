package java_brains_lambdas;

public class Greeter_WithLambda {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	public static void main(String[] args) {
		Greeter_WithLambda greeter = new Greeter_WithLambda();
//		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting lambdaGreeting = () -> System.out.println("Hello World!");
		
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello World!");
			}
		};
		
		helloWorldGreeting.perform();
		lambdaGreeting.perform();
		innerClassGreeting.perform();
		
		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
	}

}
//interface MyLambda{
//	void foo();
//}