package cs2302.bisection;

public class Cubic implements Function {

	@Override
	public double eval(double x) {
		return 2*x*x*x - 3*x*x - 11*x + 6;
	}

}
