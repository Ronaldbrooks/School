package cs2302.pictures;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * The base point is one vertex of the triangle.
 * The other two vertices are new instance fields.
 * 
 * @author bsetzer
 *
 */
public class Triangle extends Geometric {

	private PicPoint v1, v2;

	public Triangle(PicPoint v0, PicPoint v1, PicPoint v2, Paint fill, Paint outline) {
		super(v0, fill, outline);
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
		// lengths of the three sides
		double s1 = Math.hypot(x0-v1.getX(), y0-v1.getY());
		double s2 = Math.hypot(x0-v2.getX(), y0-v2.getY());
		double s0 = Math.hypot(v1.getX()-v2.getX(), v1.getY()-v2.getY());
		// Heron's formula for the area
		double sp = (s0+s1+s2)/2;
		double a = Math.sqrt(sp*(sp-s1)*(sp-s2)*(sp-s0));
		return a;
	}

	@Override
	public void draw(Canvas cnv) {
		// get the coordinates of all the vertices of the triangle
		//     trivia: vertex is from the Greek, so the plural is a Greek plural: vertices
		PicPoint v0 = getBase();
		float x0 = v0.getX();
		float y0 = v0.getY();
		float x1 = v1.getX();
		float y1 = v1.getY();
		float x2 = v2.getX();
		float y2 = v2.getY();
		
		Path pth = new Path();
		pth.moveTo(x0, y0);
		pth.lineTo(x1, y1);
		pth.lineTo(x2, y2);
		pth.close();
		
		cnv.drawPath(pth, getFill());
		cnv.drawPath(pth, getOutline());
		
	}

	@Override
	public Picture getTouched(float x, float y) {
		// TODO Auto-generated method stub
		// leaving this unimplemented for now.
		// http://stackoverflow.com/questions/2049582/how-to-determine-a-point-in-a-triangle
		//   provides several different approaches
		return null;
	}
	
	

	
	
	
}
