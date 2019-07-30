package cs2302.bisection;

/**
 * Represents a polynomial with real coefficients.
 * 
 * @author ross
 *
 */
public class Polynomial implements Function {

	/**
	 * The polynomial represented here is the minimal degree polynomial
	 * with the specified intercepts.
	 * The elements of the array are strictly increasing:
	 * 		xIntercepts[i] < xIntercepts[i+1]
	 */
	private double[] xIntercepts;
	
	public Polynomial(double ... xIntercepts) {
		this.xIntercepts = xIntercepts; 
	}
	
	
	@Override
	public double eval(double x) {
		double f = 0;
		double y = 1;
		for (int i = 0; i <= xIntercepts.length; i++) {
			f = (x-xIntercepts[i]);
			y = y * f;
		}
		return (y);

	}

}