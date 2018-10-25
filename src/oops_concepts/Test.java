package oops_concepts;

abstract class Shape{
	String color;
	abstract double area();
	public abstract String toString();
	
	public Shape(String color) {
		System.out.println("Shape constructor called.");
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
}

class Circle extends Shape {

	double radius;
	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;
	}
	@Override
	double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	@Override
	public String toString() {
		return "Circle color is " + super.color + " and area is " + this.area();
	}
	
}

class Rectangle extends Shape {
	
	double length;
	double width;
	
	Rectangle(String color, double length, double width){
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}
	
	double area() {
		return this.length * this.width;
	}
	
	public String toString() {
		return "Rectangle Color is " + super.color + " and area is " + this.area();
	}
}

public class Test {

	public static void main(String[] args) {
		
		Shape circle = new Circle("Red", 2.2);
		Shape rect = new Rectangle("Orange", 4, 6);
		
		System.out.println(circle.toString());
		System.out.println(rect.toString());

	}

}
