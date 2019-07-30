package cs2302.bubbles_140418;

import java.util.Random;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import cs2302.pictures.Circle;
import cs2302.pictures.Composite;
import cs2302.pictures.PicPoint;
import cs2302.pictures.Picture;

/**
 * Bubbles is really just a Composite with a bunch of circles.
 * However, the way we will use it, it helps to have a few extra
 * parameters and methods.
 * 
 * Major use functionality:
 *    	*  	add a bubble positioned at random.
 *    		This will use bounds for the center and will use
 *    		a given radius
 *    		and a set of paints
 * 	  	*  	Initialize radius, bounds for center, paints for circles
 * 		*	remove a given bubble
 * 		*	Draw all the bubbles
 * 		*	Return a bubble containing a point, if there is one
 * 
 * 
 * @author Ben
 *
 */
public class Bubbles extends Picture {

	private Composite bubList;
	private static final Random gen = new Random();
	private float width, height; 
	private float radius;
	private Paint fill, outline;
	private final int defaultFillColor = Color.rgb(200,200,255);
	private final int defaultOutlineColor = Color.rgb(200, 0, 0);
	private final int outlineWidth = 3;
	
	/**
	 * Initialize the bubbles group with the given radius for each
	 * bubble.  
	 * Width and height specify the space available for bubbles.
	 * @param width  Should be positive
	 * @param height  Should be positive
	 * @param radius  Should be positive
	 */
	public Bubbles(float width, float height, float radius) {
		super(new PicPoint(0, 0));
		bubList = new Composite();
		fill = new Paint();
		fill.setStyle(Style.FILL);
		fill.setColor(defaultFillColor);
		outline = new Paint();
		outline.setStyle(Style.STROKE);
		outline.setColor(defaultOutlineColor);
		outline.setStrokeWidth(outlineWidth);
		this.radius = radius;
		this.width = width;
		this.height = height;
	}

	@Override
	public synchronized void draw(Canvas cnv) {
		bubList.draw(cnv);
	}

	@Override
	public Picture getTouched(float x, float y) {
		return bubList.getTouched(x, y);
	}

	public synchronized void addBubbleAtRandom() {
		float cx = gen.nextFloat()*(width - 2*radius) + radius;
		float cy = gen.nextFloat()*(height - 2*radius) + radius;
		PicPoint center = new PicPoint(cx, cy);
		Circle c = new Circle(center, radius, fill, outline);
		bubList.addPicture(c);
	}
	
	public synchronized void removeBubble(Picture pic) {
		System.out.println("Before remove size: " + bubList.getComponents().size());
		bubList.getComponents().remove(pic);
		System.out.println("After remove size: " + bubList.getComponents().size());
	}
	
	public void setFillColor(int color) {
		fill.setColor(color);
	}
	
	public void setOutlineColor(int color) {
		outline.setColor(color);
	}
	
}
