package cs2302.pictures;

import android.graphics.Paint;

/**
 * Geometric is for organizational purposes.
 * We don't intend to create any 'Geometric' objects
 * directly.  
 * We will only create objects of subclasses.
 * 
 * We make Geometric an 'abstract class' to signal
 * to Java our intentions.
 * 
 * @author Ben Setzer
 *
 */
public abstract class Geometric extends Picture  {
	
	private Paint fill, outline;

	public Geometric(PicPoint base, Paint fill, Paint outline) {
		super(base);
		this.fill = fill;
		this.outline = outline;
	}

	
	
	
	public Paint getFill() {
		return fill;
	}




	public void setFill(Paint fill) {
		this.fill = fill;
	}




	public Paint getOutline() {
		return outline;
	}




	public void setOutline(Paint outline) {
		this.outline = outline;
	}




	public abstract double getArea(); 
	
}
