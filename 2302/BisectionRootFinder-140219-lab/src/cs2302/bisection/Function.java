/**
 * 
 */
package cs2302.bisection;

/**
 * Represents a function of one variable on the real line.
 * 
 * @author Ben Setzer
 *
 */
public interface Function {

	/**
	 * Evaluate the function for the given argument.
	 *
	 * @return The result of evaluating the argument for the given value.
	 */
	double eval(double x);
	
}
