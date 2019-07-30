package cs2302.pictures_04_getArea;

public class Circle extends Geometric {

	private float radius;

	public Circle(PicPoint base, float radius) {
		super(base);
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
		
}






