package tuan6;

import tuan6.Circle;
import tuan6.Rectangle;
import tuan6.Shape;
import tuan6.Square;

public class Main {

	public static void main(String[] args) {
		Shape s = new Shape("red", true);
		System.out.println(s.toString());

		Circle c = new Circle(100);
		System.out.println(c.toString());

		Rectangle r = new Rectangle(2, 3);
		System.out.println(r.toString());

		Square sq = new Square(5);
		System.out.println(sq.toString());
	}

}
