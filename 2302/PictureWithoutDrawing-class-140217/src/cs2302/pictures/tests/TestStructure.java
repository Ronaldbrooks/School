package cs2302.pictures.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Test;

import cs2302.pictures.Circle;
import cs2302.pictures.Geometric;
import cs2302.pictures.PicPoint;
import cs2302.pictures.Picture;
import cs2302.pictures.Rectangle;
import cs2302.pictures.Triangle;



/**
 * 
 * 
 * @author Ben Setzer
 *
 */
public class TestStructure {

	

	/**
	 * Fields should be private and there should only be the
	 * 	specified fields defined.
	 */
	@Test
	public void testFields() {
		countFields(PicPoint.class, 2);
		countFields(Picture.class,1);
		countFields(Geometric.class, 0);
		countFields(Circle.class, 1);
		countFields(Rectangle.class, 2);
		countFields(Triangle.class, 2);
	}

	public static void countFields(Class<?> cl, int numberOfFields) {
		Field[] fields = cl.getDeclaredFields();
		assertEquals("The class '" + cl.getName() + "' should have exactly " + numberOfFields + " fields.",
				numberOfFields, fields.length);
		for(Field f : fields ) {
			assertNotSame("The instance field '" + f.getName() 
						+ "' in class '" + cl.getName() + "' should be private.",
					0, f.getModifiers() & Modifier.PRIVATE);
		}
		
	}

	/**
	 * There should be one public constructor in each class.
	 */
	@Test
	public void testConstructors() {
		countConstructors(PicPoint.class, 1);
		countConstructors(Picture.class,1);
		countConstructors(Geometric.class, 1);
		countConstructors(Circle.class, 1);
		countConstructors(Rectangle.class, 1);
		countConstructors(Triangle.class, 1);
	}


	/**
	 *  The number of constructors is checked and each constructor is checked
	 *  	to be public.
	 */
	public static void countConstructors(Class<?> cl, int numberOfConstructors) {
		Constructor<?>[] constructors = cl.getDeclaredConstructors();
		assertEquals(numberOfConstructors, constructors.length);
		for (int i = 0; i < constructors.length; i++) {
			assertNotSame("The constructor " + "in class '" + cl.getName() + "' should be public.",
			0, constructors[0].getModifiers() & Modifier.PUBLIC);
		}

	}

	/**
	 * Count the methods and compare to the number specified.
	 */
	public static void countMethods(Class<?> cl, int numberOfMethods) {
		//Class<?> cl = Length.class;
		//int numberOfMethods = 7;
		Method[] methods = cl.getDeclaredMethods();
		assertEquals("The class '" + cl.getName() + "' should have exactly " 
				+ numberOfMethods + " methods.", 
				numberOfMethods, methods.length);
		
	}
	

	

}