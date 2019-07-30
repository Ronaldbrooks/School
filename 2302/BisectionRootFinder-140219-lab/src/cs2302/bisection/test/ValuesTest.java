package cs2302.bisection.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cs2302.bisection.Cubic;
import cs2302.bisection.Function;
import cs2302.bisection.Linear;
import cs2302.bisection.Quadratic;

public class ValuesTest {

	private static final double EPS = 1e-15;
	private Function cub, lin, quad;
	private double[] values = {0, 20, -20, 10, 5, .35};
	
	@Before
	public void setup() {
		lin = new Linear();
		cub = new Cubic();
		quad = new Quadratic();
	}
	
	@Test
	public void testLin() {
		for(double x : values) {
			compareLinear(x);
		}
	}

	@Test
	public void testQuad() {
		for(double x : values) {
			compareQuadratic(x);
		}
	}

	@Test
	public void testCub() {
		for(double x : values) {
			compareCubic(x);
		}

	}


	public void compareLinear(double x) {
		double exp = 2 - 5*x;
		assertEquals(exp, lin.eval(x), EPS);
	}

	public void compareQuadratic(double x) {
		double exp = (x+3)*(x-2);
		assertEquals(exp, quad.eval(x), EPS);
	}

	public void compareCubic(double x) {
		double exp = (2*x-1)*(x-3)*(x+2);
		assertEquals(exp, cub.eval(x), EPS);
	}

}
