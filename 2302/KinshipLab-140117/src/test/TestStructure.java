package test;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import kinship.Person;

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
	public void testFields() {
		Class<?> cl = Person.class;
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
	 * There should be one public constructor.
	 */
	@Test
	public void testConstructors() {
		Class<?> cl = Person.class;
		int numberOfConstructors = 1;
		Constructor<?>[] constructors = cl.getConstructors();
		assertEquals("The class '" + cl.getName() + "' should have exactly " 
				+ numberOfConstructors + " constructors.", 
				numberOfConstructors, constructors.length);
		for(Constructor constr : constructors) {
			assertNotSame("The constructor '"
						+ "' in class '" + cl.getName() + "' should be public.",
					0, constr.getModifiers() & Modifier.PUBLIC);
		}
		
	}
	
	/**
	 * There should be 6 methods, besides the constructor.
	 */
	@Test
	public void testMethods() {
		Class<?> cl = Person.class;
		int numberOfMethods = 6;
		Method[] methods = cl.getDeclaredMethods();
		assertEquals("The class '" + cl.getName() + "' should have exactly " 
				+ numberOfMethods + " methods.", 
				numberOfMethods, methods.length);
		
	}
	
	

}