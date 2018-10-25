package packages.p2;

import packages.p1.Protection;

// DIFFERENT PACKAGE SUBCLASS
public class Protection2 extends Protection{

	public Protection2() {
		
		System.out.println("DERIVED OTHER PACKAGE CONSTRUCTOR");
		
		// class or package only
//		System.out.println("n = " + n);
		
		// class only
//		System.out.println("n_pri = " + n_pri);
		
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}

}
