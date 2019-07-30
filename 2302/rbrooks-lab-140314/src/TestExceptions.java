import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestExceptions {

	/**
	 *  This group of test checks whether an exception is thrown from one of the Maht methods
	 *  when it should be.
	 *  If a test fails it might be because the method used did not throw an exception when it should have.
	 *  	Those tests have the parameter 'expected=IllegalArgumentException.class' just in front of the
	 *  	test method.
	 *  The other tests in this section use the methods with legal arguments, so they should not throw 
	 *  	exceptions.
	 */
	
	@Test(expected=IllegalArgumentException.class)
	public void test1a() {
		Maht.recur1(-5, 8);
	}
	
	@Test
	public void test1b(){
		Maht.recur1(8, -5);
	}

	@Test
	public void test1c(){
		Maht.recur1(8, 5);
	}

	
	@Test(expected=IllegalArgumentException.class)
	public void test1d() {
		Maht.recur1(-5, -8);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test2a() {
		Maht.recur2(-5, 8);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test2b(){
		Maht.recur2(8, -5);
	}

	@Test
	public void test2c(){
		Maht.recur2(8, 5);
	}
	

	@Test(expected=IllegalArgumentException.class)
	public void test2d() {
		Maht.recur2(-5, -8);
	}
	

	@Test(expected=IllegalArgumentException.class)
	public void test3a() {
		Maht.recur3(-8, -5);
	}

	@Test(expected=IllegalArgumentException.class)
	public void test3b() {
		Maht.recur3(5, 8);
	}
	
	@Test
	public void test3c() {
		Maht.recur3(-5, -8);
	}
	

	@Test
	public void test3d() {
		Maht.recur3(8, -5);
	}
	


	@Test
	public void test3e() {
		Maht.recur3(8, 8);
	}
	


	@Test
	public void test3f() {
		Maht.recur3(-5, -5);
	}
	
	/**
	 * Tests in this section check the messages sent with exceptions. 
	 * If these fail, the messages are not providing enough information.
	 * The 'fail'message provided by JUnit should explain the details.
	 */

	@Test
	public void testMessage1a() {
		try {
			Maht.recur1(0xffbadbad, 2);
			fail("recur1 did not throw an exception");
		} catch (IllegalArgumentException iae) {
			String message = iae.getMessage();
			if(message == null) {
				fail("The exception thrown by recur1 must provide a message");
			}
			//System.out.println(message);
			int index = message.indexOf("-4531283");
			assertTrue("The message from an exception thrown in recur1 should mention the invalid argument value",
					index >= 0);
		}
	}

	@Test
	public void testMessage2a() {
		try {
			Maht.recur2(0xffbadbad, 2);
			fail("recur2 did not throw an exception");
		} catch (IllegalArgumentException iae) {
			String message = iae.getMessage();
			if(message == null) {
				fail("The exception thrown by recurd must provide a message");
			}
			//System.out.println(message);
			int index = message.indexOf("-4531283");
			assertTrue("The message from an exception thrown in recur2 should mention the invalid argument value",
					index >= 0);
		}
	}

	@Test
	public void testMessage2b() {
		try {
			Maht.recur2(2, 0xffbadbad);
			fail("recur2 did not throw an exception");
		} catch (IllegalArgumentException iae) {
			String message = iae.getMessage();
			if(message == null) {
				fail("The exception thrown by recur2 must provide a message");
			}
			//System.out.println(message);
			int index = message.indexOf("-4531283");
			assertTrue("The message from an exception thrown in recur2 should mention the invalid argument value",
					index >= 0);
		}
	}
	
	@Test
	public void testMessage3a() {
		try {
			Maht.recur3(0xffbadbad, 0x7bad7bad);
			fail("recur3 did not throw an exception");
		} catch (IllegalArgumentException iae) {
			String message = iae.getMessage();
			if(message == null) {
				fail("The exception thrown by recur3 must provide a message");
			}
			//System.out.println(message);
			int index = message.indexOf("-4531283");
			assertTrue("The message from an exception thrown in recur3 should mention both argument values",
					index >= 0);
			index = message.indexOf("2074966957");
			assertTrue("The message from an exception thrown in recur3 should mention both argument values",
					index >= 0);
		}
	}
	
	
	
	
}