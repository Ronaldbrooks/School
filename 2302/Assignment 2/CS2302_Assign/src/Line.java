
public class Line {
	
	private double a;
	private double b;
	private double c;
	
	public Line(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public Point intersection(Line l2) {
		return null;
	}
	
	public double distance(Point p) {
		return a;
		
	}
	public static final double EPS = 1.0e-12;
}

