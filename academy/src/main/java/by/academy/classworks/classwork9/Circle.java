package by.academy.classworks.classwork9;

public class Circle {
	double radius;
	static final double pi = Math.PI;
	public Circle(double radius) {
		this.radius=radius;
	}
	public void area() {
		double s=pi*(radius*radius);
		System.out.println("Area of a circle: "+s);
		
	}
	public void circumference() {
		double s=2*pi*radius;
		System.out.println("Circumference: "+s);
	}
}
