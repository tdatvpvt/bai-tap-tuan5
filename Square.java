package tuan6;

import tuan6.Rectangle;

public class Square extends Rectangle {

	public Square() {
		super();
	}

	public Square(double side) {
		super.setLength(side);
		super.setWidth(side);
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled);
		super.setLength(side);
		super.setWidth(side);
	}

	public double getSide() {
		return super.getWidth();
	}

	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}

	public void setWidth(double side) {
		super.setWidth(side);
	}

	public void setLength(double side) {
		super.setLength(side);
	}

	public String toString() {
		return super.getArea() + "	" + super.getPerimeter();
	}
}

