// This demonstrates runtime polymorphism
package oops_concepts;

class Animal {
	public void makeSound() {
		System.out.println("Animal is making a sound");
	}
}
public class Horse extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Neigh");
	}
	public static void main(String[] args) {
		
		Animal obj = new Horse();
		obj.makeSound();
	}

}

//public class Cat extends Animal {
//	@Override
//	public void makeSound() {
//		System.out.println("Meow");
//	}
//	public static void main(String[] args) {
//		
//		Animal obj = new Cat();
//		obj.makeSound();
//	}
//}
