package interfaces;

public class IFTest2 {

	public static void main(String[] args) {
		
		DynStack myStack1 = new DynStack(5);
		DynStack myStack2 = new DynStack(8);

		for(int i=0; i<10; i++) {
			myStack1.push(i);
		}
		
		for(int i=0; i<10; i++) {
			myStack2.push(i);
		}
		
		for(int i=0; i<10; i++)
			System.out.print(myStack1.pop());
		
		System.out.println();
		
		for(int i=0; i<10; i++) {
			System.out.print(myStack2.pop());
		}
	}
}
