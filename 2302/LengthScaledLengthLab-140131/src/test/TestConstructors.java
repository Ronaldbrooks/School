package test;

import static org.junit.Assert.*;

import measures.Length;
import measures.ScaledLength;

import org.junit.Before;
import org.junit.Test;

public class TestConstructors {

	private final static double EPS  = 1e-10;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLengthConstructorWithArguments() {
		double value = 44.5;
		String unit = "mm";
		Length len = new Length(value, unit);
		assertEquals(value, len.getValue(), EPS);
		assertEquals(unit, len.getUnit());
	}
	
	@Test
	public void testLengthDefaultConstructor() {
		Length len = new Length();
		assertEquals(0.0, len.getValue(), EPS);
		assertNull(len.getUnit());
	}
	
	@Test
	public void testScaledLengthConstructorWithArguments() {
		double value = 44.5;
		String unit = "mm";
		double scale = 3.2;
		ScaledLength sc = new ScaledLength(value, unit, scale);
		assertEquals(value, sc.getValue(), EPS);
		assertEquals(unit, sc.getUnit());
		assertEquals(scale, sc.getScale(), EPS);
	}
	
	@Test
	public void testScaledLengthDefaultConstructor() {
		ScaledLength sc = new ScaledLength();
		assertEquals(0.0, sc.getValue(), EPS);
		assertNull(sc.getUnit());
		assertEquals(0.0, sc.getScale(), EPS);
	}

}
