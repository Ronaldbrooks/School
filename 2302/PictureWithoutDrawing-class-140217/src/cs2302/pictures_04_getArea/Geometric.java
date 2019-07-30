package cs2302.pictures_04_getArea;

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

	public Geometric(PicPoint base) {
		super(base);
		// TODO Auto-generated constructor stub
	}

	public abstract double getArea();
	
}
