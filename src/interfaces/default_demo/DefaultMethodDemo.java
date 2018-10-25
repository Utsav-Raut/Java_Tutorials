package interfaces.default_demo;

public class DefaultMethodDemo {

	public static void main(String[] args) {
	
		MyIF obj;
		
//		MyIFImp obj = new MyIFImp();
//		OR
		
		obj = new MyIFImp();
		System.out.println(obj.getNumber());
		System.out.println(obj.getString());
		
		obj = new MyIFImp2();
		System.out.println(obj.getNumber());
		System.out.println(obj.getString());
	}

}
