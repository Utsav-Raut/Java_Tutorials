package packages.p1;

// NON-SUBCLASS IN THE SAME PACKAGE
public class SamePackage {

	public SamePackage() {
		
		Protection p = new Protection();
		System.out.println("SAME PACKAGE CONSTRUCTOR");
		System.out.println("n = " + p.n);
		
		// class only
//		System.out.println("n_pri = " + n_pri);
		
		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}

}
