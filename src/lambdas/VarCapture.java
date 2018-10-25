package lambdas;

interface MyFuncInVarCap{

	int func(int n);
}

public class VarCapture {
	public static void main(String[] args) {
		
		final int num = 10;			// A local variable that can be captured
		
		MyFuncInVarCap myLambda = (n) -> {
			
			int v = num + n;	//This use of num is OK. It does not modify num
			
			//num ++;				//This is illegal and throws an error because it attempts to modify the value of sum.
			
			return v;
		};
		
		//num = 9 ; 				This also causes error because it would remove the effectively final status from num			
	}
}

//Notes:
//Variables declared by the enclosing scope of a lambda expression are accessible within the lambda expression. 
//For example, a alambda expression can use an instance or static variable defined by its enclosing class.
//A lambda expression aslo has access to "this" which refers to the invoking instance of the lambda expression's enclosing class.

//However when a lambda expression expression uses a local variable from its enclosing scope, a special situation is created that is referred to as a "variable capture".
//In this case, a lambda expression may only use local variables that are "effectively final".
// An effectively final variable is one whose value does not change after it is first assigned.
// a local var of the enclosing scope cannot be modified by the lambda expression. Doing so would effectively remove its final status, thus rendering it illegal to capture.



