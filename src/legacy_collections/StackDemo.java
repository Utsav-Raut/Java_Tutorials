package legacy_collections;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

	public static void showPush(Stack<Integer> st, int a) {
		st.push(a);
		System.out.println("push(" + a + ")");
		System.out.println("stack : " + st);
	}
	
	public static void showPop(Stack<Integer> st) {
		System.out.print("pop --> ");
		Integer a = st.pop();
		System.out.println(a);
		System.out.println("stack : " + st);
	}
	public static void main(String[] args) {
		
		Stack<Integer> stck = new Stack<Integer>();
		System.out.println("stack : " +stck);

		showPush(stck, 42);
		showPush(stck, 69);
		showPush(stck, 96);
		showPop(stck);
		System.out.println(stck.search(42));
		System.out.println(stck.isEmpty());
		showPop(stck);
		showPop(stck);
		
		System.out.println(stck.isEmpty());
		try {
			showPop(stck);
		}catch(EmptyStackException e) {
			System.out.println("Stack is empty");
		}
		
	}

}
