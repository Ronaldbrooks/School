package cs2302.pictures.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cs2302.pictures.Circle;
import cs2302.pictures.PicPoint;
import cs2302.pictures.Rectangle;
import cs2302.pictures.Triangle;

public class TestArea {

	private PicPoint base;
	public final static double EPS = 1e-15;
	
	@Before
	public void setup() {
		base = new PicPoint(0,0);
	}
	
	@Test
	public void testCircleArea() {
		double radius = 1;
		double area = Math.PI;
		Circle c = new Circle(base, radius);
		assertEquals(area, c.getArea(), EPS);
	}
	
	@Test
	public void testRectangleArea() {
		double width = 3;
		double height = 2;
		double area = 6;
		Rectangle r = new Rectangle(base, width, height);
		assertEquals(area, r.getArea(),EPS);
	}

	@Test
	public void testTriangleArea1() {
		PicPoint v1 = new PicPoint(3,0);
		PicPoint v2 = new PicPoint(0, 4);
		double area = 6;
		Triangle t = new Triangle(base, v1, v2);
		assertEquals(area, t.getArea(), EPS);
	}
	
	@Test
	public void testTriangleArea2() {
		PicPoint v0 = new PicPoint(0,0);
		PicPoint v1 = new PicPoint(1,0);
		PicPoint v2 = new PicPoint(Math.cos(Math.PI/3), Math.sin(Math.PI/3));
		double area = Math.sqrt(3)/4;
		Triangle t = new Triangle(v0, v1, v2);
		assertEquals(area, t.getArea(), EPS);
		//System.out.println(area-t.getArea());
	}
}
