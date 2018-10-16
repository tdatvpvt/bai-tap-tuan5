package tuan6;

public class Circle extends Shape {
	private double radius;
	private final float PI = 3.14f;

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.round(PI * this.radius * this.radius);
	}

	public double getPerimeter() {
		return Math.round(PI * 2 * this.radius);
	}

	public String toString() {
		return getArea() + "	" + getPerimeter();
	}

}
