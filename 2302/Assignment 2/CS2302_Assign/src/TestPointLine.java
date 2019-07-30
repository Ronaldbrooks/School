import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.Before;
import org.junit.Test;


public class TestPointLine {

	private static final double EPS = 1e-10;

	private double a1 = 4;
	private double b1 = -3;
	private double c1 = 1;
	private Line l1;
	private double a2 = 3;
	private double b2 = 4;
	private double c2 = -43;
	private Line l2;
	private double a3 = 3;
	private double b3 = 4;
	private double c3 = -18;
	private Line l3;

	private double x1 = 2;
	private double y1 = 3;
	private Point p1;
	private double x2 = 5;
	private double y2 = 7;
	private Point p2;
	private double dp1p2 = 5;
	private double dp1l2 = 5;
	private double dp2l2 = 0;

	/*
	 * 
	 * This section of tests checks whether the methods you have created work as
	 * specified.
	 */

	@Before
	public void setUp() throws Exception {
		l1 = new Line(a1, b1, c1);
		l2 = new Line(a2, b2, c2);
		l3 = new Line(a3, b3, c3);
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
	}

	@Test
	public void testLineConstructor() {
		assertEquals(
				"If this fails, the a instance field is not set properly by the Line constructor",
				a1, l1.getA(), EPS);
		assertEquals(
				"If this fails, the b instance field is not set properly by the Line constructor",
				b1, l1.getB(), EPS);
		assertEquals(
				"If this fails, the c instance field is not set properly by the Line constructor",
				c1, l1.getC(), EPS);
		assertEquals(
				"If this fails, the a instance field is not set properly by the Line constructor",
				a2, l2.getA(), EPS);
		assertEquals(
				"If this fails, the b instance field is not set properly by the Line constructor",
				b2, l2.getB(), EPS);
		assertEquals(
				"If this fails, the c instance field is not set properly by the Line constructor",
				c2, l2.getC(), EPS);
	}

	@Test
	public void testPointConstructor() {
		assertEquals(
				"If this fails, the x instance field is not set properly by the Point constructor",
				x1, p1.getX(), EPS);
		assertEquals(
				"If this fails, the y instance field is not set properly by the Point constructor",
				y1, p1.getY(), EPS);
		assertEquals(
				"If this fails, the x instance field is not set properly by the Point constructor",
				x2, p2.getX(), EPS);
		assertEquals(
				"If this fails, the y instance field is not set properly by the Point constructor",
				y2, p2.getY(), EPS);
	}

	@Test
	public void testPointDistance() {
		assertEquals("if this fails, the point distance formula may be wrong",
				dp1p2, p1.distance(p2), EPS);
		assertEquals("if this fails, the point distance formula may be wrong",
				0, p1.distance(p1), EPS);
	}

	@Test
	public void testLinePointDistance() {
		assertEquals(
				"If this fails, the line to point distance formula may be wrong",
				dp1l2, l2.distance(p1), EPS);
		assertEquals(
				"If this fails, the line to point distance formula may be wrong",
				dp2l2, l2.distance(p2), EPS);
	}

	@Test
	public void testLineIntersections() {
		Point inter = l1.intersection(l2);
		assertEquals(
				"if this fails, the line intersect with line formula may be wrong for x",
				x2, inter.getX(), EPS);
		assertEquals(
				"if this fails, the line intersect with line formula may be wrong for y",
				y2, inter.getY(), EPS);
	}

	@Test
	public void testLineIntersectionsParallel() {
		Point inter = l2.intersection(l3);
		assertNull(
				"If test fails, the intersection of two lines method is not returning null for parallel lines",
				inter);
	}

	/*
	 * 
	 * This section of tests checks whether you have organized your classes as
	 * specified. This means that unnecessary instance variables and methods are
	 * not present.
	 * 
	 * Generally, extra private methods are acceptable.
	 * 
	 * Extra instance fields are almost always a problem.
	 */

	@Test
	public void testNumberOfConstructors() {
		assertEquals(
				"If this test fails, you may have too many constructors in class Point",
				1, countPublicConstructors(Point.class));
		assertEquals(
				"If this test fails, you may have too many constructors in class Line",
				1, countPublicConstructors(Line.class));
	}

	@Test
	public void testNumberOfInstanceFields() {
		assertEquals(
				"If this test fails, you may have too many instance variables in class Line",
				4, countInstanceVariables(Line.class));
		assertEquals(
				"If this test fails, you may have too many instance variables in class Point",
				2, countInstanceVariables(Point.class));
	}

	@Test
	public void testInstanceFieldsArePrivate() {
		assertTrue(
				"if this test fails, some of your instance fields in Point are not private",
				allInstanceVariablesArePrivate(Point.class));
		assertTrue(
				"if this test fails, some of your instance fields in Line are not private",
				allInstanceVariablesArePrivate(Line.class));
	}

	// utility methods

	/**
	 * Count the number of non-private constructors.
	 */
	public static int countPublicConstructors(Class<?> cl) {
		Constructor<?>[] constructs = cl.getConstructors();
		int constCount = 0;
		for (Constructor<?> cons : constructs) {
			int mod = cons.getModifiers();
			if (!Modifier.isPrivate(mod)) {
				constCount++;
			}
		}
		return constCount;
	}

	public static int countInstanceVariables(Class<?> cl) {
		Field[] fields = cl.getDeclaredFields();
		return fields.length;
	}

	public static boolean allInstanceVariablesArePrivate(Class<?> cl) {

		Field[] fields = cl.getDeclaredFields();
		for (Field f : fields) {
			int mods = f.getModifiers();
			if (!Modifier.isPrivate(mods)
					&& (!Modifier.isStatic(mods) || !Modifier.isFinal(mods))) {
				return false;
			}
		}
		return true;
	}

}