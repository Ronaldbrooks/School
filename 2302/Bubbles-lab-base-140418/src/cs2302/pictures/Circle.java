package cs2302.pictures;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * The inherited base point is the center of the circle.
 * 
 * @author bsetzer
 *
 */
public class Circle extends Geometric {

	private float radius;

	public Circle(PicPoint base, float radius, Paint fill, Paint outline) {
		super(base, fill, outline);
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

	@Override
	public void draw(Canvas cnv) {
		
		float cx = getBase().getX();
		PicPoint b = getBase();
		float cy = b.getY();
		
		cnv.drawCircle(cx, cy, radius, getFill());
		cnv.drawCircle(cx, cy, radius, getOutline());
	}
	
	@Override
	public Picture getTouched(float x, float y) {
		float cx = getBase().getX();
		float cy = getBase().getY();
		if(Math.hypot(x-cx, y-cy) < radius) {
			return this;
		} else {
			return null;
		}
	}
	
}






