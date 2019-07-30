package cs2302.pictures;

import android.graphics.Canvas;
import android.graphics.Paint;


/**
 * Represents a rectangle with sides parallel to the axes.
 * The 'base' point for a rectangle is its upper-left
 * corner.
 * Width and height are the horizontal and vertical dimensions
 * of the rectangle, respectively.
 */
public class Rectangle extends Geometric {
	
	private float width, height;

	public Rectangle(PicPoint base, float width, float height, Paint fill, Paint outline) {
		super(base, fill, outline);
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

	@Override
	public void draw(Canvas cnv) {
		PicPoint base = getBase(); // upper left corner
		float left = base.getX();
		float top = base.getY();
		float right = left + width;
		float bottom = top + height;
		
		Paint fillPaint = getFill();  // from superclass
		cnv.drawRect(left, top, right, bottom, fillPaint);
		cnv.drawRect(left, top, right, bottom, getOutline());
	}
	
	@Override
	public Picture getTouched(float x, float y) {
		PicPoint b = getBase();
		float left = b.getX();
		float top = b.getY();
		float right = left + width;
		float bottom = top + height;
		if(left < x && x < right && top < y && y < bottom) {
			return this;
		} else {
			return null;
		}
	}
	
	
	/**
	 * Move a rectangle: what will change?
	 * 
	 * Upper left corner (Base point):   this will change
	 * width		will not change
	 * height		will not change
	 * 
	 */
	
	/**
	 * Since only the base point needs to move, the inherited method works fine.
	 */
	
}












