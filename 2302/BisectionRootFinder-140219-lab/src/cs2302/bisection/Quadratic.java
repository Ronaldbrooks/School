package cs2302.bisection;

public class Quadratic implements Function {

	@Override
	public double eval(double x) {
		return  x*x + x - 6;
	}

}
