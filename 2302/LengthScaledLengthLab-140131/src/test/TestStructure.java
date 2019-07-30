package test;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;





import measures.Length;
import measures.ScaledLength;

import org.junit.Before;
import org.junit.Test;


/**
 * This tests whether the class Person has the right fields and methods.
 * 
 * @author Ben Setzer
 *
 */
public class TestStructure {

	

	/**
	 * There should be two private fields and no others.
	 */
	@Test
	public void testFieldsLength() {
		Class<?> cl = Length.class;
		int numberOfFields = 2;
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
	 * There should be one private field and no others.
	 */
	@Test
	public void testFieldsScaledLength() {
		Class<?> cl = ScaledLength.class;
		int numberOfFields = 1;
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
	 * There should be no public constructors.
	 */
	@Test
	public void testLengthConstructors() {
		Class<?> cl = Length.class;
		int numberOfConstructors = 2;
		Constructor<?>[] constructors = cl.getDeclaredConstructors();
		assertEquals("The class '" + cl.getName() + "' should have only the default constructor", 
				numberOfConstructors, constructors.length);
		assertNotSame("The constructor '"
						+ "' in class '" + cl.getName() + "' should be public.",
					0, constructors[0].getModifiers() & Modifier.PUBLIC);
		assertEquals("The class '" + cl.getName() + "' should have only the default constructor",
				constructors[0].getParameterTypes().length, 0);
		
	}

	/**
	 * There should be no public constructors.
	 */
	@Test
	public void testScaledLengthConstructors() {
		Class<?> cl = ScaledLength.class;
		int numberOfConstructors = 2;
		Constructor<?>[] constructors = cl.getDeclaredConstructors();
		assertEquals("The class '" + cl.getName() + "' should have only the default constructor", 
				numberOfConstructors, constructors.length);
		assertNotSame("The constructor '"
						+ "' in class '" + cl.getName() + "' should be public.",
					0, constructors[0].getModifiers() & Modifier.PUBLIC);
		assertEquals("The class '" + cl.getName() + "' should have only the default constructor",
				constructors[0].getParameterTypes().length, 0);
		
	}
	
	/**
	 * There should be 5 methods, besides the constructor.
	 */
	@Test
	public void testLengthMethods() {
		Class<?> cl = Length.class;
		int numberOfMethods = 7;
		Method[] methods = cl.getDeclaredMethods();
		assertEquals("The class '" + cl.getName() + "' should have exactly " 
				+ numberOfMethods + " methods.", 
				numberOfMethods, methods.length);
		
	}
	

	/**
	 * There should be 2 methods, besides the constructor.
	 */
	@Test
	public void testScaledLengthMethods() {
		Class<?> cl = ScaledLength.class;
		int numberOfMethods = 4;
		Method[] methods = cl.getDeclaredMethods();
		assertEquals("The class '" + cl.getName() + "' should have exactly " 
				+ numberOfMethods + " methods.", 
				numberOfMethods, methods.length);
		
	}
	
	

}