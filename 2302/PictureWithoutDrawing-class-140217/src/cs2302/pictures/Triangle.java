package cs2302.pictures;
/**
 * The base point is one vertex of the triangle
 * The other two vertices are new instance fields.
 * 
 * @author rbrook46
 *
 */

public abstract class Triangle extends Geometric {

	private PicPoint v1, v2;

	public Triangle(PicPoint v0, PicPoint v1, PicPoint v2) {
		super(v0);
		this.v1 = v1;
		this.v2 = v2;
	}

	public PicPoint getV1() {
		return v1;
	}

	public void setV1(PicPoint v1) {
		this.v1 = v1;
	}

	public PicPoint getV2() {
		return v2;
	}

	public void setV2(PicPoint v2) {
		this.v2 = v2;
	}
	
	@Override
	public double getArea() {
		double x0 = getBase().getX();
		double y0 = getBase().getY();
		double s1 = Math.hypot(x0-v1.getX(), y0-v1.getY());
		double s2 = Math.hypot(x0-v2.getX(), y0-v2.getY());
		double s0 = Math.hypot(v1.getX()-v2.getX(), v1.getY()-v2.getY());
		double sp = (s0+s1+s2)/2;
		double a = Math.sqrt(sp*(sp-s1)*(sp-s2)*(sp-s0));
		return a;
	}
	public abstract double getPerimeter();
}		

