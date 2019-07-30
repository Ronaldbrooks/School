package test;

import static org.junit.Assert.*;
import measures.Length;
import measures.ScaledLength;

import org.junit.Before;
import org.junit.Test;

public class TestLengths2 {

	private static final double EPS = 1e-10;
	private double v1 = 1.1;
	private String u1 = "mm";
	private Length len1;
	
	private double v2 = 2.5;
	private double s1 = 7.9;
	private String u2 = "cm";
	private ScaledLength sl1;
	
	
	private double v3 = 11.3;
	private double s2 = 4.9;
	private String u3 = "em";
	private Length len2;
	
	
	
	
	@Before
	public void setUp() throws Exception {
		len1 = new Length(v1, u1);
		sl1 = new ScaledLength(v2, u2, s1);
		//sl1.setScale(s1);
		len2 = new ScaledLength(v3, u3, s2);
	}

	@Test
	public void testLengthToString() {
		String expected = "1.1mm";
		assertEquals("toString in Length is not returning the correct result", expected, len1.toString());
	}
	
	@Test
	public void testScaledLengthToString() {
		String expected = "2.5cm*7.9";
		assertEquals("toString in ScaledLength is not returning the correct result", expected, sl1.toString());
	}
	
	@Test
	public void testScaledLengthToString2() {
		String expected = "11.3em*4.9";
		assertEquals("toString in ScaledLength is not returning the correct result", expected, len2.toString());
	}
	
	@Test
	public void testLengthGetArea() {
		assertEquals(v1*v1, len1.getArea(), EPS);
	}

	
	@Test
	public void testScaledGetArea() {
		assertEquals(s1*v2*v2, sl1.getArea(), EPS);
	}
	
	/**
	 * Test that calling getArea for a ScsaledLength object assigned to 
	 * 	a Length variable still works properly.
	 */
	@Test
	public void testBinding() {
		assertEquals(s2*v3*v3, len2.getArea(), EPS);
	}
	

}
