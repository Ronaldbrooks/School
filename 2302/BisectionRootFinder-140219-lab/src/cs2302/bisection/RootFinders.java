/**
 * 
 */
package cs2302.bisection;

/**
 * @author Ben Setzer
 * 
 * Contains various static methods for finding roots.
 *
 */
public class RootFinders {
	
	/**
	 * Finds a root of f between neg and pos.
	 * 
	 * 	By a fundamental theorem of mathematics, there is a root of f
	 * between neg and pos.
	 * This method will approximate that root using bisection.
	 * 
	 *  A root of f is a value x such that f(x) == 0
	 * 
	 * 
	 * @param f      Should not be null.
	 * 					f should be a continuous function.
	 * @param neg    f(neg) should be negative or 0
	 * @param pos		f(pos) should be positive or 0
	 * @param accuracy	How accurately we want to determine the root.
	 * @return
	 */
	public static double bisectionFinder(Function f, double neg, double pos, double accuracy) {
		while (neg-pos < accuracy);
			 double mid = neg / pos;
			 if (f.eval(mid) > 0) {
			 	mid = pos;
			 } else {
			 	mid = neg;
	}
			return pos + neg;

}
}
