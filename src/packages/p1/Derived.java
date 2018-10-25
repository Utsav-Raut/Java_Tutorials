package packages.p1;

// SUBCLASS IN THE SAME PACKAGE
public class Derived extends Protection {

	public Derived() {
		System.out.println("DERIVED CONSTRUCTOR");
		System.out.println("n = " + n);
		
		// class only
//		System.out.println("n_pri = " + n_pri);
		
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub " + n_pub);
	}

}
