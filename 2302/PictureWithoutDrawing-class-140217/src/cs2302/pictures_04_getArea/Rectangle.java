package cs2302.pictures_04_getArea;


/**
 * Represents a rectangle with sides parallel to the axes.
 * The 'base' point for a rectangle is its upper-left
 * corner.
 * Width and height are the horizontal and vertical dimensions
 * of the rectangle, respectively.
 */
public class Rectangle extends Geometric {
	
	private float width, height;

	public Rectangle(PicPoint base, float width, float height) {
		super(base);
		this.width = width;
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}
	
		
}
