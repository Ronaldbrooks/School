package cs2302.bisection;

public class tryOutFunctions {

 public static void main(String args[] ) {	
	Cubic cub = new Cubic();
	Linear lin = new Linear();
	Quadratic quad = new Quadratic();
//cubic
	System.out.println("cub evaluated at -30 is " + cub.eval(-30));
	System.out.println("cub evaluated at -2 is " + cub.eval(-2));
	System.out.println("cub evaluated at 0 is " + cub.eval(0));
	System.out.println("cub evaluated at 1 is " + cub.eval(1));
	System.out.println("cub evaluated at 10 is " + cub.eval(10));
	System.out.println("cub evaluated at 20 is " + cub.eval(20));
	System.out.println("cub evaluated at 30 is " + cub.eval(30));
//linear
	System.out.println("lin evaluated at -30 is " + lin.eval(-30));
	System.out.println("lin evaluated at -2 is " + lin.eval(-2));
	System.out.println("lin evaluated at 0 is " + lin.eval(0));
	System.out.println("lin evaluated at 1 is " + lin.eval(1));
	System.out.println("lin evaluated at 10 is " + lin.eval(10));
	System.out.println("lin evaluated at 20 is " + lin.eval(20));
	System.out.println("lin evaluated at 30 is " + lin.eval(30));
//Quadratic
	System.out.println("quad evaluated at -30 is " + quad.eval(-30));
	System.out.println("quad evaluated at -2 is " + quad.eval(-2));
	System.out.println("quad evaluated at 0 is " + quad.eval(0));
	System.out.println("quad evaluated at 1 is " + quad.eval(1));
	System.out.println("quad evaluated at 10 is " + quad.eval(10));
	System.out.println("quad evaluated at 20 is " + quad.eval(20));
	System.out.println("quad evaluated at 30 is " + quad.eval(30));
}
}

