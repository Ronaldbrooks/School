package chapter11.geometry.programs;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import chapter11.geometry.Circle;

public class TestCircleRectangleJunit {

	@Before
	public void setUp() throws Exception {
	}
	
	private final double DELTA = 1.0e-10;

	@Test
	public void testCircelRadius() {
		Circle c = new Circle(1, "Blue", true);
		assertEquals(1, c.getRadius(), DELTA);
	}
	
	
	@Test
	public void testCircleArea() {
		Circle c = new Circle(1, "Blue", true);
		assertEquals(Math.PI, c.getArea(), DELTA);
	}

	@Test
	public void testCirclePerimeter() {
		Circle c = new Circle(1, "Blue", true);
		assertEquals(2*Math.PI, c.getPerimeter(), DELTA);
	}
	
}
