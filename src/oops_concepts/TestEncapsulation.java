package oops_concepts;

class Encapsulate {
	private String geekName;
	private int geekRollNo;
	private int geekAge;
	
	public String getGeekName() {
		return geekName;
	}
	public void setGeekName(String geekName) {
		this.geekName = geekName;
	}
	public int getGeekRollNo() {
		return geekRollNo;
	}
	public void setGeekRollNo(int geekRollNo) {
		this.geekRollNo = geekRollNo;
	}
	public int getGeekAge() {
		return geekAge;
	}
	public void setGeekAge(int geekAge) {
		this.geekAge = geekAge;
	}
	
	
}
public class TestEncapsulation {

	public static void main(String[] args) {
		Encapsulate encapsulObj = new Encapsulate(); 
		
		encapsulObj.setGeekName("Pooh");
		encapsulObj.setGeekAge(29);
		encapsulObj.setGeekRollNo(122);
		
		System.out.println("Name is " + encapsulObj.getGeekName());
		System.out.println("Age is " + encapsulObj.getGeekAge());
		System.out.println("Roll Number is " + encapsulObj.getGeekRollNo());
		
//		Direct access to a data member is not allowed due to encapsulation
//		System.out.println("Name is " + encapsulObj.geekName);

	}

}
