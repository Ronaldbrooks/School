package Test;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;



import org.junit.Before;
import org.junit.Test;

import Equation.QuadraticEquation;

public class TestQuadraticEquation {

	private double a1 = 1;
	private double b1 = -3;
	private double c1 = 2;
	private double disc1 = 1;
	private double r01 = 2;
	private double r11 = 1;
	private QuadraticEquation qe1;
	
	private double a2 = 1;
	private double b2 = 1;
	private double c2 = 1;
	private double disc2 = -3;
	private double r02 = Double.NaN;
	private double r12 = Double.NaN;
	private QuadraticEquation qe2;
	
	
	private static final double DELTA = 1.0e-10;
	
	@Before
	public void setUp() throws Exception {
		qe1 = new QuadraticEquation(a1, b1, c1);
		qe2 = new QuadraticEquation(a2, b2, c2);
	}

	
	/**
	 * If this test fails, the accessors for QuadraticEquation are not working
	 * properly.
	 */
	@Test
	public void testAccssors1(){
		assertEquals(a1, qe1.getA(), DELTA);
		assertEquals(b1, qe1.getB(), DELTA);
		assertEquals(c1, qe1.getC(), DELTA);
		assertEquals(a2, qe2.getA(), DELTA);
		assertEquals(b2, qe2.getB(), DELTA);
		assertEquals(c2, qe2.getC(), DELTA);
	}
	
	/**
	 * If this test fails, the discriminant is not being properly computed.
	 */
	@Test
	public void testDiscriminant1() {
		assertEquals(disc1, qe1.getDiscriminant(), DELTA);
		assertEquals(disc2, qe2.getDiscriminant(), DELTA);
	}
	
	/**
	 * If this test fails, the root0 is not being properly computed.
	 */
	@Test
	public void testRoot01() {
		assertEquals(r01, qe1.getRoot0(), DELTA);
		assertEquals(r02, qe2.getRoot0(), DELTA);
	}

	/**
	 * If this test fails, the root0 is not being properly computed.
	 */
	@Test
	public void testRoot11() {
		assertEquals(r11, qe1.getRoot1(), DELTA);
		assertEquals(r12, qe2.getRoot1(), DELTA);
	}
	
	/**
	 * If this test fails, there are either too many instance variables or some of them
	 * are not private.
	 */
	@Test
	public void testInstanceVariables() {
		Class<QuadraticEquation> c = QuadraticEquation.class;
		Field[] fields = c.getDeclaredFields();
		if(fields.length > 3) {
			fail("Too many instance variables in QuadraticEquation class");
		}
		for(Field f : fields) {
			int mods = f.getModifiers();
			if(!Modifier.isPrivate(mods)) {
				fail("Instance variable " + f.getName() + " is not declared private");
			}
		}
	}
	

	/**
	 * If this test fails, there is a method whose name begins with set
	 * and the method is not private.
	 * There are no 'setter' methods specified in the requirements.
	 */
	@Test
	public void testClassForSetters() {
		Class<QuadraticEquation> c = QuadraticEquation.class;
		Method[] methods = c.getDeclaredMethods();
		for(Method m : methods) {
			String name = m.getName();
			if(name.startsWith("set") && !Modifier.isPrivate(m.getModifiers())) {
				fail("There seems to be a set method");
			}
		}
	}
	
	/**
	 * If this test fails, the QuadraticEquation class has either too many
	 * or too few methods that are not private.
	 */
	@Test
	public void countPublicMethods() {
		Class<QuadraticEquation> c = QuadraticEquation.class;
		Method[] methods = c.getDeclaredMethods();
		int pubcount = 0;
		for(Method m : methods) {
			int mod = m.getModifiers();
			if(!Modifier.isPrivate(mod)) {
				pubcount++;
			}
		}
		assertEquals(6, pubcount);
	}
	
	/**
	 * If this test fails, the QuadraticEquation class has either too many
	 * or too few  constructors that are not private.
	 */
	@Test
	public void countPublicConstructors() {
		Class<QuadraticEquation> c = QuadraticEquation.class;
		Constructor<?>[] constructs = c.getConstructors();
		int constCount = 0;
		for(Constructor<?> cons : constructs) {
			int mod = cons.getModifiers();
			if(!Modifier.isPrivate(mod)) {
				constCount++;
			}
		}
		assertEquals(1, constCount);
	}

}