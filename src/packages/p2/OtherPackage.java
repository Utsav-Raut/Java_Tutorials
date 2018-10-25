package packages.p2;

// OTHER PACKAGE NON-SUBCLASS
public class OtherPackage {

	public OtherPackage() {
		
		packages.p1.Protection p = new packages.p1.Protection();
		
		System.out.println("OTHER PACKAGE CONSTRUCTOR");
		
		// class or package only
//		System.out.println("n = " + p.n);
		
		// class only
//		System.out.println("n_pri = " + p.n_pri);
		
		// class, subclass or package only
//		System.out.println("n_pro = " + p.n_pro);
		
		System.out.println("n_pub = " + p.n_pub);
	}

}
