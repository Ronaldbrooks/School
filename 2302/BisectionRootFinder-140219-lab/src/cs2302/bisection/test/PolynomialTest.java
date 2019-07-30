package cs2302.bisection.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cs2302.bisection.Polynomial;
import cs2302.bisection.RootFinders;

public class PolynomialTest {

	public static  final double EPS = 1e-12;
	public static final double ACC = EPS;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		testPolynomialRoots(new double[]{1,2,3,4});
	}

	@Test
	public void test2() {
		testPolynomialRoots(new double[]{-9, -4, -1, 1, 4, 9});
	}
	
	@Test
	public void test3() {
		double[] intercepts = new double[35];
		for(int i = 0; i < intercepts.length; i++ ) {
			intercepts[i] = .1*i - 1.5;;
		}
		testPolynomialRoots(intercepts);
	}
	
	public void testPolynomialRoots(double intercepts[]) {
		Polynomial poly = new Polynomial(intercepts);
		for(int i = 0; i < intercepts.length; i++ ) {
			double a;
			if(i == 0)
				a = intercepts[i] - 1;
			else
				a = (intercepts[i] + intercepts[i-1])/2;
			double b;
			if( i == intercepts.length - 1) 
				b = intercepts[i] + 1;
			else
				b = (intercepts[i] + intercepts[i+1])/2;
			double neg;
			if( (intercepts.length - i) % 2 == 1)
				neg = a;
			else
				neg = b;
			double pos = a + b - neg;
			//System.out.printf("i  %d a %f  b %f  neg %f (%f) pos %f (%f)\n",
			//		i, a, b, neg, poly.eval(neg), pos, poly.eval(pos)); 
			double root = RootFinders.bisectionFinder(poly, neg, pos, ACC);
			//System.out.printf("root %f  value %e\n", root, poly.eval(root));
			assertEquals(intercepts[i], root, EPS);
		}
	}
	


}