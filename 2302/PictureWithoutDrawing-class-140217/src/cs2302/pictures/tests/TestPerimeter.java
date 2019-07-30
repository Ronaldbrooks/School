package cs2302.pictures.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cs2302.pictures.Circle;
import cs2302.pictures.PicPoint;
import cs2302.pictures.Rectangle;
import cs2302.pictures.Triangle;

public class TestPerimeter {

	private PicPoint base;
	public final static double EPS = 1e-15;
	
	@Before
	public void setup() {
		base = new PicPoint(0,0);
	}
	
	@Test
	public void testCirclePerimeter() {
		double radius = .5;
		double perim = Math.PI;
		Circle c = new Circle(base, radius);
		assertEquals(perim, c.getPerimeter(), EPS);
	}
	
	@Test
	public void testRectanglePerimeter() {
		double width = 3;
		double height = 2;
		double perim = 10;
		Rectangle r = new Rectangle(base, width, height);
		assertEquals(perim, r.getPerimeter(),EPS);
	}

	@Test
	public void testTrianglePerimeter1() {
		PicPoint v1 = new PicPoint(3,0);
		PicPoint v2 = new PicPoint(0, 4);
		double perim = 12;
		Triangle t = new Triangle(base, v1, v2);
		assertEquals(perim, t.getPerimeter(), EPS);
	}
	
	@Test
	public void testTrianglePerimeter2() {
		PicPoint v0 = new PicPoint(0,0);
		PicPoint v1 = new PicPoint(1,0);
		PicPoint v2 = new PicPoint(Math.cos(Math.PI/3), Math.sin(Math.PI/3));
		double perim = 3;
		Triangle t = new Triangle(v0, v1, v2);
		assertEquals(perim, t.getPerimeter(), EPS);
	}
}
