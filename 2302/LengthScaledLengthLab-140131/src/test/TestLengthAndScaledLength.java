package test;

import static org.junit.Assert.*;
import measures.Length;
import measures.ScaledLength;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class TestLengthAndScaledLength {

	private Length len1;
	private double value1 = 1.2;
	private String unit1 = "mm";
	private Length len2;
	private double value2 = 2.3;
	private String unit2 = "in";
	private String comb2 = "2.3in";
	private ScaledLength sc1;
	private double svalue1 = 3.4;
	private String sunit1 = "pc";
	private double sscale1 = 4.5;
	private ScaledLength sc2;
	private double svalue2 = 5.6;
	private String sunit2 = "furlong";
	private double sscale2 = 6.7;
	private String scomb2 = "5.6furlong";
	
	// precision for comparing double values
	private static final double EPS = 1e-15;
	
	@Before
	public void setUp() throws Exception {
		len1 = new Length();
		len1.setUnit(unit1);
		len1.setValue(value1);
		len2 = new Length();
		len2.setUnit(unit2);
		len2.setValue(value2);
		sc1 = new ScaledLength();
		sc1.setUnit(sunit1);
		sc1.setValue(svalue1);
		sc1.setScale(sscale1);
		sc2 = new ScaledLength();
		sc2.setUnit(sunit2);
		sc2.setValue(svalue2);
		sc2.setScale(sscale2);
	}


	@Test
	public void testLengthGetsAndSets() {
		assertEquals(value1, len1.getValue(),EPS);
		assertEquals(unit1, len1.getUnit());
	}
	

	@Test
	public void testScaledLengthGetsAndSets() {
		assertEquals(svalue1, sc1.getValue(),EPS);
		assertEquals(sunit1, sc1.getUnit());
	}
	
	@Test
	public void testMethodCombined() {
		assertEquals(comb2, len2.combined());
		assertEquals(scomb2, sc2.combined());
	}
	
	

}
