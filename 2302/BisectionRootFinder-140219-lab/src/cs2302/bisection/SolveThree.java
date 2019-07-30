
package cs2302.bisection;

public class SolveThree {
	public static void main(String[] args) {

	Cubic cub = new Cubic();
	Linear lin = new Linear();
	Quadratic quad = new Quadratic();
	double accuracy = 1e-12;

	
	System.out.println("Root of lin is " + RootFinders.bisectionFinder(lin, lin.eval(10), lin.eval(0), accuracy));
	System.out.println("First root of quad is " + RootFinders.bisectionFinder(quad, quad.eval(0), quad.eval(-30), accuracy));
	System.out.println("Second root of quad is " + RootFinders.bisectionFinder(quad, quad.eval(0), quad.eval(30), accuracy));
	System.out.println("First root of cub is " + RootFinders.bisectionFinder(cub, cub.eval(1), cub.eval(20), accuracy));
	System.out.println("Second root of cub is " + RootFinders.bisectionFinder(cub, cub.eval(1), cub.eval(0), accuracy));
	System.out.println("Third root of cub is " + RootFinders.bisectionFinder(cub, cub.eval(-30), cub.eval(0), accuracy));
}
}

