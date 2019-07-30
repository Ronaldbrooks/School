package Equation;

public class QuadraticEquation {
	private double a1,b1,c1;
	

	public QuadraticEquation(double a1, double b1, double c1) {
		super();
		this.a1 = a1;
		this.b1 = b1;
		this.c1 = c1;
	}
	
	public double getA() {
		return a1;
	}

	public double getB() {
		return b1;
	}

	public double getC() {
		return c1;
	}

	public double getDiscriminant() {
		return (Math.pow(b1, 2) - 4 * a1 * c1);
	}
	public double getRoot0() {
		return  ((-b1 + Math.sqrt(getDiscriminant())) / (2 * a1));
	}

	public double getRoot1() {
		return ((-b1 - Math.sqrt(getDiscriminant())) / (2 * a1));
	}
	

}


